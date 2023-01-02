FROM openjdk:18-alpine
ADD target/*.jar estudiante-spring-web-app.jar
ENTRYPOINT [ "java", "-jar", "estudiante-spring-web-app.jar" ]
