name := """Big Data Analysis"""

version := "1.0"

scalaVersion := "2.11.12"
val sparkVersion = "2.3.2"

libraryDependencies ++= Seq(
  "org.scalatest"    %% "scalatest"   % "3.2.0-SNAP10" % Test,
  "org.apache.spark" %% "spark-core"  % sparkVersion,
  "org.apache.spark" %% "spark-sql"   % sparkVersion,
  "org.apache.spark" %% "spark-mllib" % sparkVersion,
  // "org.postgresql" % "postgresql" % "9.4.1209.jre7",
  "org.mariadb.jdbc"  % "mariadb-java-client"       % "2.2.5",
  "mysql"             % "mysql-connector-java"      % "8.0.11",
  "log4j"             % "log4j"                     % "1.2.17",
  "edu.umd"           % "cloud9"                    % "1.5.0",
  "org.apache.hadoop" % "hadoop-client"             % "2.7.3",
  "com.databricks"    % "spark-xml_2.10"            % "0.4.1",
  "datastax"          % "spark-cassandra-connector" % "2.0.1-s_2.11"
)

javaOptions in (Test, run) ++= Seq("-Dspark.master=local",
                                   "-Dlog4j.debug=true",
                                   "-Dlog4j.configuration=log4j.properties")

//outputStrategy := Some(StdoutOutput)
// fork := true
// coverageEnabled in Test := true

resolvers ++= Seq(
  Resolver.mavenLocal,
  Resolver.sonatypeRepo("public"),
  Classpaths.typesafeReleases,
  DefaultMavenRepository,
  "Spark Packages Repo" at "https://dl.bintray.com/spark-packages/maven"
)
