name := "scala-interview-prep"

scalaVersion := "3.8.2"

libraryDependencies ++= Seq(
  "com.google.guava" % "guava" % "16.0.1",
  "junit" % "junit" % "4.10" % "test",
  "org.mockito" % "mockito-core" % "1.10.19" % "test",
  "org.scalacheck" %% "scalacheck" % "1.19.0" % "test",
  "org.scalatest" %% "scalatest" % "3.2.19" % "test",
  "org.scalatestplus" %% "scalacheck-1-19" % "3.2.19.0" % "test"
)
