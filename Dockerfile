FROM openjdk:18
EXPOSE:5000
ADD target/docker-test-java.jar docker-test-java.jar
ENTRYPOINT ["java", "-jar", "demo88.jar"]

