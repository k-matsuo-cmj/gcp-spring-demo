FROM ibm-semeru-runtimes:open-17-jre-focal
COPY ./target/demo-0.0.1-SNAPSHOT.jar /app/demo.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/app/demo.jar"]
