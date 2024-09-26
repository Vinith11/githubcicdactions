FROM openjdk:17
EXPOSE 8080
ADD target/spring-cicdaction-demo.jar spring-cicdaction-demo.jar
ENTRYPOINT ["java", "-jar", "/spring-cicdaction-demo.jar"]