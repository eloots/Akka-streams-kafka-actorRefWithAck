/**
  * Copyright © 2018 Lightbend, Inc
  *
  * Licensed under the Apache License, Version 2.0 (the "License");
  * you may not use this file except in compliance with the License.
  * You may obtain a copy of the License at
  *
  * http://www.apache.org/licenses/LICENSE-2.0
  *
  * Unless required by applicable law or agreed to in writing, software
  * distributed under the License is distributed on an "AS IS" BASIS,
  * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
  *
  * NO COMMERCIAL SUPPORT OR ANY OTHER FORM OF SUPPORT IS OFFERED ON
  * THIS SOFTWARE BY LIGHTBEND, Inc.
  *
  * See the License for the specific language governing permissions and
  * limitations under the License.
  */

import sbt._

object Version {
  val akkaVer         = "2.5.10"
  val logbackVer      = "1.2.3"
  val scalaVer        = "2.12.4"
  val scalaParsersVer = "1.0.4"
  val akkaSBRVer      = "1.1.0"
  val akkaManagementVer = "0.9.0"
  val akkaStreamsKafka  = "0.19"
  val kafka             = "1.0.0"
}

object Dependencies {
  val dependencies = Seq(
    "com.typesafe.akka"             %% "akka-actor"                   % Version.akkaVer,
    "com.typesafe.akka"             %% "akka-slf4j"                   % Version.akkaVer,
//    "org.apache.kafka"               % "kafka-clients"                % Version.kafka,
    "com.typesafe.akka"             %% "akka-cluster-tools"           % Version.akkaVer,
    "com.typesafe.akka"             %% "akka-cluster"                 % Version.akkaVer,
    "com.typesafe.akka"             %% "akka-cluster-sharding"        % Version.akkaVer,
    "com.typesafe.akka"             %% "akka-distributed-data"        % Version.akkaVer,
    "com.typesafe.akka"             %% "akka-persistence"             % Version.akkaVer,
    "com.typesafe.akka"             %% "akka-stream-kafka"            % Version.akkaStreamsKafka,
    "com.lightbend.akka"            %% "akka-split-brain-resolver"    % Version.akkaSBRVer,
    "com.typesafe.akka"             %% "akka-stream"                  % Version.akkaVer,
    "com.typesafe.akka"             %% "akka-slf4j"                   % Version.akkaVer,
    "ch.qos.logback"                 %  "logback-classic"             % Version.logbackVer,
    "ch.qos.logback"                 %  "logback-classic"             % Version.logbackVer,
    "com.lightbend.akka.management" %% "akka-management"              % Version.akkaManagementVer,
    "com.lightbend.akka.management" %% "akka-management-cluster-http" % Version.akkaManagementVer,
    "com.typesafe.akka"             %% "akka-testkit"                 % Version.akkaVer            % Test
  )
}
