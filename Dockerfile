FROM openjdk:11-slim
WORKDIR /app
COPY target/sample-0.0.1-SNAPSHOT.jar /app
ENV SERVER_PORT 5000
EXPOSE $SERVER_PORT
CMD ["java", "-jar", "sample-0.0.1-SNAPSHOT.jar" ]