FROM openjdk:8-jre
COPY build/libs/demo-*.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]