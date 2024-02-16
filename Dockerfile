FROM ubuntu:latest
RUN apt install openjdk-11-jre
COPY /home/sridhar/SPEMiniProject/calculator/target/calculator-1.0-SNAPSHOT.jar /app/calculator-1.0-SNAPSHOT.jar
