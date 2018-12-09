name := "website-studienstiftungschor-koeln"

scalaVersion in ThisBuild := "2.12.7"

enablePlugins(PlayScala)

libraryDependencies += guice
libraryDependencies += ws

libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.5" % Test
libraryDependencies += "org.scalatestplus.play" %% "scalatestplus-play" % "3.1.2" % Test
