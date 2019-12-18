FROM java:8

LABEL maintainer="sizzflyer@gmail.com"

VOLUME /tmp

EXPOSE 8080

ARG JAR_FILE=target/logging-0.0.1-SNAPSHOT.jar
ADD ${JAR_FILE} jk-simple-logging.jar

ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/jk-simple-logging.jar"]
