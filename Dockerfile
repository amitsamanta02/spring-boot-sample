FROM openjdk:8-jdk-alpine
MAINTAINER dockerstudy.com
COPY target/docket_image-0.0.1-SNAPSHOT.jar message-server-1.0.0.jar
ENTRYPOINT ["java","-jar","/message-server-1.0.0.jar"]