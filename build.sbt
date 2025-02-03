name := "gitbucket-plantuml-plugin"

organization := "com.yotaichino"

version := "1.8.0"

scalaVersion := "2.13.7"
gitbucketVersion := "4.42.1"

libraryDependencies ++= Seq(
  "org.scalatest"            %% "scalatest"          % "3.0.8" % "test"
)

libraryDependencies += "net.sourceforge.plantuml" % "plantuml-asl" % "1.2025.0"

scalacOptions := Seq("-deprecation", "-feature", "-language:postfixOps", "-Ydelambdafy:method", "-target:jvm-17")
javacOptions in compile ++= Seq("-target", "17", "-source", "17")

useJCenter := true 
