lazy val root =
  project
    .in(file("."))
    .settings(
      organization := "io.github.mavenrain",
      name := "scala3-docker",
      version := "0.1.0-SNAPSHOT",
      versionScheme := Some("early-semver"),

      scalaVersion := "3.0.0",
      // todo remove when fixed: https://github.com/lampepfl/dotty/issues/11943
      Compile / doc / sources := Seq(),
      libraryDependencies ++= Seq(

      )
    )

assembly / assemblyMergeStrategy := {
  case PathList("META-INF", "MANIFEST.MF") => MergeStrategy.discard
  case _ => MergeStrategy.first
}
dockerExposedPorts += 9000
enablePlugins(JavaAppPackaging)
enablePlugins(DockerPlugin)