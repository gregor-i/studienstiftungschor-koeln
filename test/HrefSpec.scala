import org.scalatest.{FunSuite, Matchers}
import org.scalatestplus.play.guice.GuiceOneServerPerSuite
import play.api.Application
import play.api.inject.guice.GuiceApplicationBuilder
import play.api.libs.ws.WSClient

import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.duration._
import scala.concurrent.{Await, Future}

class HrefSpec extends FunSuite with Matchers with GuiceOneServerPerSuite {
  override def fakeApplication(): Application = new GuiceApplicationBuilder().configure().build()


  val wsClient = app.injector.instanceOf[WSClient]

  val host = s"http://localhost:$port"
//  val host = "http://www.studienstiftungschor-koeln.de"

  val Link = "(href|src)=\"([^\"]*)\"".r

  def await[A](fut: Future[A]): A = Await.result(fut, 100.seconds)

  def get(url: String): String =
    await(wsClient.url(host + url).get()
      .map { resp =>
        resp.status shouldBe 200
        resp.body
      })

  def status(url: String): Int =
    await(wsClient.url(host + url).get().map(_.status))

  def crawlLinks(pageUrl: String): Seq[String] = {
    val body = get(pageUrl)
    Link.findAllIn(body)
      .collect { case Link(_, linkUrl) => linkUrl }
      .toSeq
  }

  for (page <- Seq("/", "/ueber-uns", "/chorleitung", "/kontakt", "/konzerte")) {
    test(s"page '${page}': all internal links are absolute and get served from the server") {
      val links = crawlLinks(page)
      val internalLinks = links.filter(url => !url.startsWith("http://")
        && !url.startsWith("https://")
        && !url.startsWith("mailto:"))

      for (url <- internalLinks)
        url should startWith("/")

      for (url <- internalLinks)
        assert(status(url) == 200, s"url '$url' was not serves with status 200")
    }
  }
}
