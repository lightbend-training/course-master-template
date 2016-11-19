import sbt._

object Version {
  val akkaVer         = "2.4.12"
  val scalaVer        = "2.12.0"
  val scalaParsers    = "1.0.4"
  val scalaTestVer    = "3.0.0"
  val logbackVer      = "1.1.3"
  val playVersion     = "2.5.9"
}

object Library {
    val scalaParsers      = "org.scala-lang.modules"  %% "scala-parser-combinators"   % Version.scalaParsers
    val akkaActor         = "com.typesafe.akka"       %% "akka-actor"                 % Version.akkaVer withSources()
    val akkaTestkit       = "com.typesafe.akka"       %% "akka-testkit"               % Version.akkaVer withSources()
    val akkaStream        = "com.typesafe.akka"       %% "akka-stream"                % Version.akkaVer withSources()
    val akkaStreamTestKit = "com.typesafe.akka"       %% "akka-stream-testkit"        % Version.akkaVer withSources()
    val akkaSlf4j         = "com.typesafe.akka"       %% "akka-slf4j"                 % Version.akkaVer
    val logbackClassic    = "ch.qos.logback"           % "logback-classic"            % Version.logbackVer
    //val playJson          = "com.typesafe.play"       %% "play-json"                  % Version.playVersion
    val scalaTest         = "org.scalatest"           %% "scalatest"                  % Version.scalaTestVer
    val scalactic         = "org.scalactic"           %% "scalactic"                  % Version.scalaTestVer
}

object Dependencies {
  import Library._

  val dependencies = List(
    akkaActor,
    akkaTestkit,
    akkaStream,
    akkaStreamTestKit,
    akkaSlf4j,
    logbackClassic,
    //playJson,
    scalaParsers,
    scalaTest % "test",
    scalactic % "test"
  )
}
