name := "Connected"

version := "1.0"

scalaVersion := "2.11.7"

mainClass in Compile := Some("rojosam.connected")

libraryDependencies ++=  Seq(
  //"org.apache.hadoop" % "hadoop-client" % "2.7.2",
  "org.scalactic" %% "scalactic" % "2.2.6",
  "org.scalatest" %% "scalatest" % "2.2.6" % "test",
  "org.apache.logging.log4j" % "log4j-api" % "2.5",
  "org.apache.logging.log4j" % "log4j-1.2-api" % "2.5",
  "org.apache.logging.log4j" % "log4j-core"  % "2.5",
  "org.apache.logging.log4j" % "log4j-slf4j-impl"  % "2.5",
  "org.slf4j" % "slf4j-api" % "1.7.12"

)