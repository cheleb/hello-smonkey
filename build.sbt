val scala3Version = "3.0.1"

lazy val root = project
  .in(file("."))
  .settings(
    name := "scala3-simple",
    version := "0.1.0",
    scalaVersion := scala3Version,
    libraryDependencies ++= Seq("jme3-core", "jme3-desktop", "jme3-lwjgl")
      .map("org.jmonkeyengine" % _ % "3.4.0-stable"),
    libraryDependencies += "com.novocode" % "junit-interface" % "0.11" % "test",
    run / javaOptions ++= Seq(
      "java.util.concurrent.atomic",
      "java.lang",
      "java.util",
      "java.util.concurrent",
      "java.lang.reflect",
      "java.net",
      "java.nio",
      "com.jme3.util"
    ).map(p => s"--add-opens=java.base/$p=ALL-UNNAMED"),
    run / fork := true
  )
