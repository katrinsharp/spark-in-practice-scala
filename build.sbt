name := "Spark-HandsOn"

version := "1.0"

scalaVersion := "2.11.8"

val sparkVersion = "2.1.0"

libraryDependencies += "org.apache.spark" %% "spark-core" % sparkVersion

libraryDependencies += "org.apache.spark" %% "spark-sql" % sparkVersion

libraryDependencies += "org.apache.spark" %% "spark-mllib" % sparkVersion

libraryDependencies += "org.apache.spark" %% "spark-streaming" % sparkVersion

libraryDependencies += "com.fasterxml.jackson.core" % "jackson-databind" % "2.4.4"

libraryDependencies += "com.google.code.gson" % "gson" % "2.3.1"

libraryDependencies += "org.apache.spark" %% "spark-streaming-twitter" % "1.6.3"

libraryDependencies += "org.twitter4j" % "twitter4j-core" % "3.0.3"

libraryDependencies += "org.scalatest" % "scalatest_2.11" % "2.2.4" % "test"

resolvers += "Akka Repository" at "http://repo.akka.io/releases/"
