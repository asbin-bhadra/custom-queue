name := "custome_queue"

version := "0.1"

scalaVersion := "2.12.12"

lazy val queue = (project in file("queue")).settings(
  libraryDependencies ++= Seq(
    "org.scalatest" %% "scalatest" % "3.2.3" % Test,
  )
)

lazy val root = (project in file(".")).aggregate(queue)