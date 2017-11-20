name := """shimmy"""

version := "1.0"

scalaVersion := "2.12.4"

/* For `decline` dependency */
resolvers += Resolver.bintrayRepo("bkirwi", "maven")

libraryDependencies ++= Seq(
  "com.monovore"   %% "decline"     % "0.4.0-RC1",
  "com.codecommit" %% "shims"       % "1.0",
  "org.scalaz"     %% "scalaz-core" % "7.2.16"
)
