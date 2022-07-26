FROM openjdk:11
EXPOSE 8080
ADD target/docker-test-java.jar docker-test-java.jar
ENTRYPOINT ["java", "-jar", "/docker-test-java.jar"]