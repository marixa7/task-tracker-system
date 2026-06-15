FROM openjdk:17-jdk-slim
WORKDIR /app
# Копируем JAR-файл, который Maven создаст в папке target
COPY target/*.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]