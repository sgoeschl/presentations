FROM openjdk:8-jdk-alpine

LABEL maintainer="siegfried.goeschl@gmail.com"

VOLUME /tmp
EXPOSE 8080
ARG JAR_FILE=target/freemarker-demo-app.jar
ADD ${JAR_FILE} application.jar

ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/application.jar"]