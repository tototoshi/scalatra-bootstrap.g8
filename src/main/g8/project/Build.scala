import sbt._
import Keys._

object RootProject extends Build {

  lazy val persistenceDependencies = List (
    "com.github.seratch" %% "scalikejdbc" % "0.4.2",
    "commons-dbcp" % "commons-dbcp" % "1.4",
    "org.hsqldb" % "hsqldb" % "[2,)"
  )

  lazy val scalatraDependencies = List(
    "org.scalatra" %% "scalatra" % "2.0.3",
    "org.scalatra" %% "scalatra-scalate" % "2.0.3"
  )

  lazy val containerDependencies = List(
    "javax.servlet" % "servlet-api" % "2.5" % "provided",
    "org.mortbay.jetty" % "jetty" % "6.1.22" % "container"
  )

  lazy val additionalDependencies = List(
    "org.scalaz" %% "scalaz-core" % "6.0.4",
    "com.github.scala-incubator.io" %% "scala-io-core" % "0.2.0",
    "com.github.scala-incubator.io" %% "scala-io-file" % "0.2.0"
  )

  lazy val root = Project (
    id = "$application_name$",
    base = file ("."),
    settings = Defaults.defaultSettings ++ Seq (
      scalaVersion := "2.9.1",
      libraryDependencies ++= persistenceDependencies ++ scalatraDependencies ++ containerDependencies ++ additionalDependencies
    )
  )

}

