name := "website-studienstiftungschor-koeln"

scalaVersion in ThisBuild := "2.13.1"

enablePlugins(PlayScala)

libraryDependencies += guice
libraryDependencies += ws

libraryDependencies += "org.scalatest" %% "scalatest" % "3.1.1" % Test
libraryDependencies += "org.scalatestplus.play" %% "scalatestplus-play" % "5.0.0" % Test
