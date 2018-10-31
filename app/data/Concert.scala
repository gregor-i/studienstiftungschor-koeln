package data

case class Concert(name: String,
                   date: String,
                   flyerImageUrl: String,
                   flyerLinkUrl: Option[String] = None,
                   content: Seq[String],
                   audioSamples: Seq[String] = Seq.empty,
                   images: Seq[String] = Seq.empty)

object Concert {
  val johannaUndKathi = "unter Leitung von Johanna Vinnen und Katharina Vincon"

  val all = Seq(
    Concert(
      name = "Across the Universe",
      date = "15. Dezember 2018, Aula der Universität, Albertus-Magnus-Platz",
      flyerImageUrl = "images/konzerte/plakate/Plakat_thumbnail_Across_the_Universe.png",
      flyerLinkUrl = Some("images/konzerte/plakate/Plakat_Across_the_Universe.jpg"),
      content = Seq("Details zu diesem Konzert gibt es unter <a href=\"/programm\">Programm</a> und im <a href=\"images/konzerte/plakate/Plakat_Across_the_Universe.jpg\">Flyer</a>.")
    ),
    Concert(
      name = "Set Fire To The Rain",
      date = "8. Juli 2018",
      flyerImageUrl = "images/konzerte/plakate/Plakat_Set_Fire.jpg",
      content = Seq("Feuer und Wasser mit Stücken von Mozart, Toto, Edwar Elgar, Dan Ikuma, Bach, \"Juli\", John Conahan, Adele, \"Earth, Wind, and Fire\", John Bennett, ...",
        johannaUndKathi),
      audioSamples = Seq("hoerbeispiele/Air-Konzert.mp3"),
      images = Seq("images/konzerte/Set_fire_sml.jpg")
    ),
    Concert(
      name = "Let Earth Receive Her Queen",
      date = "9. Dezember 2017",
      flyerImageUrl = "images/konzerte/plakate/Plakat_Christmas_Royale.jpg",
      content = Seq("Die besondere Weihnachtseinstimmung mit Stücken von Ola Gjeilo, Pentatonix, Edward Elgar, Hubert Parry, Eric Whitacre, Leonard Cohen, Coldplay und natürlich Queen",
        johannaUndKathi),
      audioSamples = Seq("/hoerbeispiele/Konzert_Christmas.mp3"),
      images = Seq("/images/konzerte/Let_Earth.jpg")
    ),
    Concert(
      name = "On This Shining Night",
      date = "25. Juni 2017",
      flyerImageUrl = "images/konzerte/plakate/Plakat-Nacht.jpg",
      content = Seq("Amerikanische und britische Stücke zur Nacht von C.H.H.Parry, E.Elgar, Th.Vautor, A.Sullivan, M.Lauridsen, S.Barber, P.Ballard, L. Bernstein, A.Lennox, E.Whitacre, A.Lloyd Webber, den Beatles ...",
        johannaUndKathi),
      audioSamples = Seq("hoerbeispiele/Konzert_Nacht.mp3"),
      images = Seq("images/konzerte/On_this_shining_night.jpg")
    ),
    Concert(
      name = "Machet die Tore weit",
      date = "3. Dezember 2016",
      flyerImageUrl = "images/konzerte/plakate/Flyer_Weihnachtskonzert.jpg",
      content = Seq("Adventseinstimmung von Mozart, Palestrina, Rutter, Rheinberger, Bruckner, Mendelssohn-Bartoldy, Reinthaler, de Boeck, ...", johannaUndKathi),
      audioSamples = Seq("hoerbeispiele/14-Ave_verum.mp3"),
      images = Seq("images/konzerte/Machet_die_Tore.jpg")
    ),
    Concert(
      name = "Nord&shy;lichter",
      date = "3. Juli 2016",
      flyerImageUrl = "images/konzerte/plakate/Plakat_Nordlichter.jpg",
      content = Seq("Eine Reise durch Skandinavien von Ola Gjeilo, Jean Sibelius, Edward Elgar, Hugo Alfven, Cyrillus Kreek, Stefan Nilsson, Waldemar Ahlen, ...", johannaUndKathi),
      images = Seq("images/konzerte/Nordlichter_2.jpg")
    ),
    Concert(
      name = "Viva la Vida",
      date = "13. Dezember 2015",
      flyerImageUrl = "images/konzerte/plakate/Plakat_Viva_la_Vida.jpg",
      content = Seq("Zeitgenössische Hits im neuen Chorgewand von Coldplay, Adele, Wise Guys, Snow Patrol, Aura Dione, Rammstein, Billy Joel, ...", johannaUndKathi),
      audioSamples = Seq("hoerbeispiele/Viva_la_Vida_Konzert.mp3"),
      images = Seq("images/konzerte/Viva_la_Vida_sml.jpg")
    ),
    Concert(
      name = "Ich hab die Nacht geträumet",
      date = "27. Juni 2015",
      flyerImageUrl = "images/konzerte/plakate/Plakat_Romantikkonzert.png",
      content = Seq("Romantische Chormusik vom 19. Jahrhundert bis heute von Max Reger, Johannes Brahms, Felix Mendelssohn, Josef Rheinberger, Waldemar Ahlen, Cole Porter, Billy Joel, Henry Mancini, Vincent Clarke, Calvin Carter, ...", johannaUndKathi),
      audioSamples = Seq("hoerbeispiele/Romantikkonzert_15.mp3"),
      images = Seq("images/konzerte/Romantikkonzert.jpg")
    ),
    Concert(
      name = "Besinnliches zur Advents&shy;zeit",
      date = "6. Dezember 2014",
      flyerImageUrl = "images/konzerte/plakate/Plakat_Nikolaus.jpg",
      content = Seq("Chorkonzert in St. Nikolaus in Köln Sülz von W.A. Mozart, J. Brahms, C. Saint-Saëns, J. Rheinberger, E. Elgar, J. Rutter, M.L. Lightfood, M.B. Bender, K. Franklin, ...",
        "unter Leitung von Johanna Vinnen, Katharina Vincon und Vera Cremer"),
      audioSamples = Seq("hoerbeispiele/The_Lord_bless_you.mp3"),
      images = Seq("images/konzerte/Adventskonzert_klein.jpg")
    ),
    Concert(
      name = "Musicals & Carmen",
      date = "1. Juni 2014, Chorforum Essen",
      flyerImageUrl = "images/konzerte/plakate/Plakat_StustiKonzert_2014.jpg",
      content = Seq("Gemeinschaftskonzert des Studienstiftungsorchesters NRW und des Kölner Studienstiftungschores",
        "Der König der Löwen, West-Side-Story, Robert Schumanns Zigeunerleben"),
      audioSamples = Seq("hoerbeispiele/02_Tonight.mp3"),
      images = Seq("images/konzerte/konzert16_sml.jpg")
    ),
    Concert(
      name = "Draw On Sweet Night",
      date = "30. November 2013",
      flyerImageUrl = "images/konzerte/plakate/Plakat_Draw_On.jpg",
      content = Seq("Gemeinschaftskonzert des Studienstiftungsorchesters NRW (Leitung: Gregor Mayrhofer) und des Kölner Studienstiftungschores (Leitung: Vera Cremer)",
        "Max Bruch: Romanze, englische Madrigale"),
      audioSamples = Seq("hoerbeispiele/Konzert_30112013_09.mp3"),
      images = Seq("images/konzerte/Konzert_Nov2013.jpg")
    ),
    Concert(
      name = "Die Schöpfung",
      date = "4. Mai 2013",
      flyerImageUrl = "images/konzerte/plakate/Plakat_Schoepfung_wide.jpg",
      content = Seq("Kölner Studienstiftungschor, „Vokalensemble Caleidon“ der Hochschule für Musik und Tanz Köln, Orchester aus Studierenden der Hochschule für Musik und Tanz Köln (Leitung: Judith Mohr, Alexander Lüken und Paul Krämer)"),
      audioSamples = Seq("hoerbeispiele/Schoepfung_11_Chor.mp3")
    )
  )
}