val dottyVersion = "3.0.1"

lazy val root = project
  .in(file("."))
  .settings(
    name := "advent-of-scala",
    version := "0.1.0",

    scalaVersion := dottyVersion,

    libraryDependencies += "com.novocode" % "junit-interface" % "0.11" % "test"
  )
