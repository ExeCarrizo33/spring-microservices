# Imagen Modelo
FROM eclipse-temurin:17.0.13_11-jdk
WORKDIR /app
COPY target/microservice-gateway-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]
