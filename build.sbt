name := "website-studienstiftungschor-koeln"

scalaVersion in ThisBuild := "2.13.1"

enablePlugins(SbtTwirl)

libraryDependencies += "org.scalatest" %% "scalatest" % "3.1.1" % Test
libraryDependencies += "org.scalatestplus.play" %% "scalatestplus-play" % "5.0.0" % Test
