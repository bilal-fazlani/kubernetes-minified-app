ThisBuild / scalaVersion := "3.0.2"
ThisBuild / version      := "0.1.0-SNAPSHOT"
ThisBuild / organization := "com.bilal-fazlani"

lazy val kubeClient = (project in file("./kubeClient"))
  .settings(
    name := "kubeClient",
    libraryDependencies ++= Seq(
      STTP.sttpCore,
      STTP.zioBackend,
      STTP.circe,
      Libs.zioK8s,
    )
  )


