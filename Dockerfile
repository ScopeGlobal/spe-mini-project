FROM ubuntu:latest
RUN apt-get update
RUN apt install -y openjdk-11-jre
COPY calculator/target/calculator-1.0-SNAPSHOT.jar /
