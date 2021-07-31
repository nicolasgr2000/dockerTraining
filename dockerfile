FROM openjdk:11
ARG JAR_FILE=release/infoTraining-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} infoTraining-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","infoTraining-0.0.1-SNAPSHOT.jar"]
