# Imagen Modelo
FROM eclipse-temurin:17.0.13_11-jdk
WORKDIR /app
COPY target/microservice-student-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8090
ENTRYPOINT ["java", "-jar", "app.jar"]
