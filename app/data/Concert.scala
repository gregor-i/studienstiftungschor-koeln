package data

case class Concert(name: String,
                   date: String,
                   flyerThumbnailUrl: String,
                   flyerImageUrl: String,
                   content: Seq[String],
                   audioSamples: Seq[String] = Seq.empty,
                   images: Seq[String] = Seq.empty)

object Concert {
  val johannaUndKathi = "unter Leitung von Johanna Vinnen und Katharina Vincon"

  val toBeDefined = "/images/Plakat-to-be-defined.svg"

  val SS19 = Concert(
    name = "Heimweh Fernweh",
    date = "14. Juli 2019",
    flyerThumbnailUrl = "/konzerte/SS19/Plakat_128.jpg",
    flyerImageUrl = "/konzerte/SS19/Plakat.jpg",
    content = Seq(
      """Unter dem Motto <strong>Heimweh Fernweh</strong> reisen wir dabei um die ganze Welt und präsentieren
        |Stücke unterschiedlicher Epochen, z.B. von Antonín Dvořák, Enya, Franz Schubert, Frank
        |Sinatra, Ola Gjeilo, Jacques Brel, Francesco S. Patavino, Edith Piaf und den Beach Boys.
      """.stripMargin,
      johannaUndKathi)
  )

  val WS18 = Concert(
    name = "Across the Universe",
    date = "15. Dezember 2018",
    flyerThumbnailUrl = "/konzerte/WS18/Plakat_128.jpg",
    flyerImageUrl = "/konzerte/WS18/Plakat.jpg",
    content = Seq(
      "<strong>Across the Universe</strong> mit Werken von Bruckner, den Beatles, Schubert, Rammstein, Johann Schulz, Monteverdi, Queen, Erik Esenvalds, David Bowie und Justin Hurwitz",
      "Ausserdem gibt es eine Uraufführung von Martín Letelier",
      johannaUndKathi
    )
  )

  val SS18 = Concert(
    name = "Set Fire To The Rain",
    date = "8. Juli 2018",
    flyerThumbnailUrl = "/konzerte/SS18/Plakat_128.jpg",
    flyerImageUrl = "/konzerte/SS18/Plakat.jpg",
    content = Seq("Feuer und Wasser mit Stücken von Mozart, Toto, Edwar Elgar, Dan Ikuma, Bach, \"Juli\", John Conahan, Adele, \"Earth, Wind, and Fire\", John Bennett, ...",
      johannaUndKathi),
    audioSamples = Seq("/konzerte/SS18/Air-Konzert.mp3"),
    images = Seq("/konzerte/SS18/Chor.jpg")
  )

  val WS17 = Concert(
    name = "Let Earth Receive Her Queen",
    date = "9. Dezember 2017",
    flyerThumbnailUrl = "/konzerte/WS17/Plakat_128.jpg",
    flyerImageUrl = "/konzerte/WS17/Plakat.jpg",
    content = Seq("Die besondere Weihnachtseinstimmung mit Stücken von Ola Gjeilo, Pentatonix, Edward Elgar, Hubert Parry, Eric Whitacre, Leonard Cohen, Coldplay und natürlich Queen",
      johannaUndKathi),
    audioSamples = Seq("/konzerte/WS17/Konzert_Christmas.mp3"),
    images = Seq("/konzerte/WS17/Let_Earth.jpg")
  )

  val SS17 = Concert(
    name = "On This Shining Night",
    date = "25. Juni 2017",
    flyerThumbnailUrl = "/konzerte/SS17/Plakat_128.jpg",
    flyerImageUrl = "/konzerte/SS17/Plakat.jpg",
    content = Seq("Amerikanische und britische Stücke zur Nacht von C.H.H.Parry, E.Elgar, Th.Vautor, A.Sullivan, M.Lauridsen, S.Barber, P.Ballard, L. Bernstein, A.Lennox, E.Whitacre, A.Lloyd Webber, den Beatles ...",
      johannaUndKathi),
    audioSamples = Seq("/konzerte/SS17/Konzert_Nacht.mp3"),
    images = Seq("/konzerte/SS17/On_this_shining_night.jpg")
  )

  val WS16 = Concert(
    name = "Machet die Tore weit",
    date = "3. Dezember 2016",
    flyerThumbnailUrl = "/konzerte/WS16/Plakat_128.jpg",
    flyerImageUrl = "/konzerte/WS16/Plakat.jpg",
    content = Seq("Adventseinstimmung von Mozart, Palestrina, Rutter, Rheinberger, Bruckner, Mendelssohn-Bartoldy, Reinthaler, de Boeck, ...", johannaUndKathi),
    audioSamples = Seq("/konzerte/WS16/14-Ave_verum.mp3"),
    images = Seq("/konzerte/WS16/Machet_die_Tore.jpg")
  )

  val SS16 = Concert(
    name = "Nord&shy;lichter",
    date = "3. Juli 2016",
    flyerThumbnailUrl = "/konzerte/SS16/Plakat_128.jpg",
    flyerImageUrl = "/konzerte/SS16/Plakat.jpg",
    content = Seq("Eine Reise durch Skandinavien von Ola Gjeilo, Jean Sibelius, Edward Elgar, Hugo Alfven, Cyrillus Kreek, Stefan Nilsson, Waldemar Ahlen, ...", johannaUndKathi),
    images = Seq("/konzerte/SS16/Nordlichter_2.jpg")
  )

  val WS15 = Concert(
    name = "Viva la Vida",
    date = "13. Dezember 2015",
    flyerThumbnailUrl = "/konzerte/WS15/Plakat_128.jpg",
    flyerImageUrl = "/konzerte/WS15/Plakat.jpg",    content = Seq("Zeitgenössische Hits im neuen Chorgewand von Coldplay, Adele, Wise Guys, Snow Patrol, Aura Dione, Rammstein, Billy Joel, ...", johannaUndKathi),
    audioSamples = Seq("/konzerte/WS15/Viva_la_Vida_Konzert.mp3"),
    images = Seq("/konzerte/WS15/Viva_la_Vida_sml.jpg")
  )

  val SS15 = Concert(
    name = "Ich hab die Nacht geträumet",
    date = "27. Juni 2015",
    flyerThumbnailUrl = "/konzerte/SS15/Plakat_128.jpg",
    flyerImageUrl = "/konzerte/SS15/Plakat.png",
    content = Seq("Romantische Chormusik vom 19. Jahrhundert bis heute von Max Reger, Johannes Brahms, Felix Mendelssohn, Josef Rheinberger, Waldemar Ahlen, Cole Porter, Billy Joel, Henry Mancini, Vincent Clarke, Calvin Carter, ...", johannaUndKathi),
    audioSamples = Seq("/konzerte/SS15/Romantikkonzert_15.mp3"),
    images = Seq("/konzerte/SS15/Romantikkonzert.jpg")
  )

  val WS14 = Concert(
    name = "Besinnliches zur Advents&shy;zeit",
    date = "6. Dezember 2014",
    flyerThumbnailUrl = "/konzerte/WS14/Plakat_128.jpg",
    flyerImageUrl = "/konzerte/WS14/Plakat.jpg",
    content = Seq("Chorkonzert in St. Nikolaus in Köln Sülz von W.A. Mozart, J. Brahms, C. Saint-Saëns, J. Rheinberger, E. Elgar, J. Rutter, M.L. Lightfood, M.B. Bender, K. Franklin, ...",
      "unter Leitung von Johanna Vinnen, Katharina Vincon und Vera Cremer"),
    audioSamples = Seq("/konzerte/WS14/The_Lord_bless_you.mp3"),
    images = Seq("/konzerte/WS14/Adventskonzert_klein.jpg")
  )

  val SS14 = Concert(
    name = "Musicals & Carmen",
    date = "1. Juni 2014, Chorforum Essen",
    flyerThumbnailUrl = "/konzerte/SS14/Plakat_128.jpg",
    flyerImageUrl = "/konzerte/SS14/Plakat.jpg",
    content = Seq("Gemeinschaftskonzert des Studienstiftungsorchesters NRW und des Kölner Studienstiftungschores",
      "Der König der Löwen, West-Side-Story, Robert Schumanns Zigeunerleben"),
    audioSamples = Seq("/konzerte/SS14/02_Tonight.mp3"),
    images = Seq("/konzerte/SS14/konzert16_sml.jpg")
  )

  val WS13 = Concert(
    name = "Draw On Sweet Night",
    date = "30. November 2013",
    flyerThumbnailUrl = "/konzerte/WS13/Plakat_128.jpg",
    flyerImageUrl = "/konzerte/WS13/Plakat.jpg",
    content = Seq("Gemeinschaftskonzert des Studienstiftungsorchesters NRW (Leitung: Gregor Mayrhofer) und des Kölner Studienstiftungschores (Leitung: Vera Cremer)",
      "Max Bruch: Romanze, englische Madrigale"),
    audioSamples = Seq("/konzerte/WS13/Konzert_30112013_09.mp3"),
    images = Seq("/konzerte/WS13/Konzert_Nov2013.jpg")
  )

  val SS13 = Concert(
    name = "Die Schöpfung",
    date = "4. Mai 2013",
    flyerThumbnailUrl = "/konzerte/SS13/Plakat_128.jpg",
    flyerImageUrl = "/konzerte/SS13/Plakat.jpg",
    content = Seq("Kölner Studienstiftungschor, „Vokalensemble Caleidon“ der Hochschule für Musik und Tanz Köln, Orchester aus Studierenden der Hochschule für Musik und Tanz Köln (Leitung: Judith Mohr, Alexander Lüken und Paul Krämer)"),
    audioSamples = Seq("/konzerte/SS13/Schoepfung_11_Chor.mp3")
  )

  val WS12 = Concert(
    name = "Spätherbst",
    date = "25. November 2012",
    flyerThumbnailUrl = "/konzerte/WS12/Plakat_128.jpg",
    flyerImageUrl = "/konzerte/WS12/Plakat.jpg",
    content = Seq("Chorkonzert in St. Aposteln in Köln (Leitung: Paul Krämer). u.a. Stücke von Johannes Brahms und zeitgenössische Kompositionen"),
    images = Seq("/konzerte/WS12/Spaetherbst.jpg")
  )


  val all = Seq(WS18, SS18, WS17, SS17, WS16, SS16, WS15, SS15, WS14, SS14, WS13, SS13, WS12)
}
