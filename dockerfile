FROM openjdk:17-jdk-alpine

WORKDIR /app

COPY target/DJ-0.0.1-SNAPSHOT.jar DJ-0.0.1-SNAPSHOT.jar

EXPOSE 1111

CMD ["java","-jar","DJ-0.0.1-SNAPSHOT.jar"]