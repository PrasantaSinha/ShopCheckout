ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.12.13"

lazy val root = (project in file("."))
  .settings(
    name := "StoreCheckout",
    libraryDependencies ++= Seq(
      "org.scalatest"     %% "scalatest-wordspec"                % "3.2.15"         % "test",
      "org.scalatest"     %% "scalatest"                         % "3.2.15"         % "test",
      "org.hamcrest"      % "hamcrest"                           % "2.2"           % "test"
    ),
    Defaults.itSettings
  )
