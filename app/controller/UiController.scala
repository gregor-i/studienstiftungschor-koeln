package controller

import controllers.Assets
import javax.inject.Inject
import play.api.mvc.InjectedController

class UiController @Inject()(assets: Assets) extends InjectedController {
  def index() = Action {
    Redirect("index.html")
  }

  def asset(path: String) = assets.at(path)
}
