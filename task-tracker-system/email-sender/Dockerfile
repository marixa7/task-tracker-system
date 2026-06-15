FROM eclipse-temurin:17-jdk-jammy
WORKDIR /app
# Копируем JAR-файл, который Maven создаст в папке target
COPY target/*.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]
