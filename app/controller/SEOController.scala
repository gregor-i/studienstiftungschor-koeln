package controller

import java.time.format.DateTimeFormatter
import java.time.{Instant, ZonedDateTime}
import java.util.TimeZone

import play.api.mvc.InjectedController

class SEOController extends InjectedController {
  private val startInstant = Instant.ofEpochMilli(
    java.lang.management.ManagementFactory.getRuntimeMXBean.getStartTime
  )

  private val lastmod = ZonedDateTime.ofInstant(startInstant, TimeZone.getDefault.toZoneId)
    .format(DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ssZ"))
    .replaceAll("(.*)(\\d\\d)$", "$1:$2")

  def sitemap() = Action {
    Ok(views.xml.sitemap(lastmod))
  }
}