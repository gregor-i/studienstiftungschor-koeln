import java.io.FileWriter

import play.twirl.api.Html

object GeneratePages {
  val outputFolder = "docs/"

  def saveToFile(file: String)(content: String): Unit = {
    val writer = new FileWriter(outputFolder + file)
    writer.write(content)
    writer.close()
  }


  def main(args: Array[String]): Unit = {
    saveToFile("kontakt.html") (html.kontakt().body)
    saveToFile("konzerte.html") (html.konzerte().body)
    saveToFile("index.html") (html.landing().body)
    saveToFile("chorleitung.html") (html.chorleitung().body)
    saveToFile("mitsingen.html") (html.mitsingen().body)
    saveToFile("ueber-uns.html") (html.ueberUns().body)
  }
}
