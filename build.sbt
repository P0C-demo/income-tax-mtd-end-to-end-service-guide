val appName = "income-tax-mtd-end-to-end-service-guide"

scalaVersion := "2.12.10"

lazy val microservice = Project(appName, file("."))
  .enablePlugins(SbtAutoBuildPlugin, SbtGitVersioning, SbtArtifactory)
  .settings(
    evictionWarningOptions in update := EvictionWarningOptions.default.withWarnScalaVersionEviction(false),
    majorVersion := 0

  )

  .settings(
    resolvers += Resolver.bintrayRepo("hmrc", "releases"),
    resolvers += Resolver.jcenterRepo
  )

libraryDependencies ++= Seq(
  "uk.gov.hmrc"   %% "bootstrap-play-26" % "1.3.0",
  "org.pegdown" % "pegdown" % "1.6.0" % "test",
  "org.scalatest" %% "scalatest" % "3.1.0" % "test",
  "com.vladsch.flexmark"   % "flexmark-all" % "0.35.10"
)
