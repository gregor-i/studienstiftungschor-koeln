package controller

import controllers.Assets
import javax.inject.Inject
import play.api.mvc.InjectedController
import play.twirl.api.Html

class UiController @Inject()(assets: Assets) extends InjectedController {
  private def ui(html:Html) = Action(Ok(html))

  def index() = ui(views.html.index())
  def chorleiter() = ui(views.html.chorleiter())
  def kontakt() = ui(views.html.kontakt())
  def konzerte() = ui(views.html.konzerte())
  def programm() = ui(views.html.programm())

  def asset(path: String) = assets.at(path)
}
