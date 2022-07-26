FROM openjdk:8
EXPOSE:5000
ADD target/docker-test-java.jar docker-test-java.jar
ENTRYPOINT ["java", "-jar", "\docker-test-java.jar"]


