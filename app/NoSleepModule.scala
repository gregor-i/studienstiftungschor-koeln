import akka.actor.ActorSystem
import akka.stream.scaladsl.{Sink, Source}
import akka.stream.{ActorMaterializer, Materializer}
import com.google.inject.AbstractModule
import javax.inject.Provider
import play.api.libs.ws.WSClient
import play.api.{Configuration, Environment, Logger}

import scala.concurrent.duration._

class NoSleepModule(environment: Environment, configuration: Configuration) extends AbstractModule {
  override def configure() = {
    val maybeUrl = configuration.getOptional[String]("NoSleepModule.url")

    maybeUrl match {
      case None => Logger.info("No 'NoSleepModule.url' defined")
      case Some(url) =>
        val tickInterval = configuration.getOptional[FiniteDuration]("NoSleepModule.tickInterval").getOrElse(10.minutes)
        Logger.info(s"Starting poller on '$url' with interval '$tickInterval'")

        val as = ActorSystem("NoSleepModule")
        val mat = ActorMaterializer()(as)

        val provideWs = getProvider(classOf[WSClient])

        bind(classOf[Poller])
          .toProvider(new Provider[Poller] {
            override def get(): Poller = new Poller(provideWs.get(), url, tickInterval)(mat)
          })
          .asEagerSingleton()
    }
  }
}

private class Poller(ws: WSClient, url: String, tickInterval: FiniteDuration)(implicit mat: Materializer) {
  Source.tick(0.seconds, tickInterval, ())
    .to(Sink.foreach(_ => ws.url(url).get()))
    .run()
}