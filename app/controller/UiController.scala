package controller

import controllers.Assets
import javax.inject.Inject
import play.api.mvc.InjectedController
import play.twirl.api.Html

class UiController @Inject()(assets: Assets) extends InjectedController {
  private def ui(html:Html) = Action(Ok(html))

  def index() = ui(views.html.index())
  def chorleitung() = ui(views.html.chorleitung())
  def kontakt() = ui(views.html.kontakt())
  def konzerte() = ui(views.html.konzerte())
  def programm() =  Action {
    Redirect("/")
  }
  def ueberUns() = ui(views.html.ueberUns())


  def asset(path: String) = assets.at(path)
}
