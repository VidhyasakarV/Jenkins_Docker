FROM openjdk:8

WORKDIR /app

COPY target/DJ-0.0.1-SNAPSHOT.jar .

EXPOSE 1111

CMD ["java","-jar","DJ-jar"]