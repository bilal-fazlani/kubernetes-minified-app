import sbt._

object Libs {
  lazy val zioK8s = "com.coralogix" %% "zio-k8s-client" % "1.3.4"
}

object STTP {
  private val org = "com.softwaremill.sttp.client3"
  private val version = "3.3.14"
  
  lazy val sttpCore = org %% "core" % version
  lazy val zioBackend = org %% "async-http-client-backend-zio" % version
  lazy val circe = org %% "circe" % version
}
