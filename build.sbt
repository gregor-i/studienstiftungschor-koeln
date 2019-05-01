name := "website-studienstiftungschor-koeln"

scalaVersion in ThisBuild := "2.12.8"

enablePlugins(PlayScala)

libraryDependencies += guice
libraryDependencies += ws

libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.7" % Test
libraryDependencies += "org.scalatestplus.play" %% "scalatestplus-play" % "4.0.2" % Test
