# Базовый образ с Java 17
FROM eclipse-temurin:17-jdk-jammy
# Рабочая директория внутри контейнера
WORKDIR /app

# Копируем JAR-файл, который собрал Maven
COPY target/*.jar app.jar

# Команда для запуска
ENTRYPOINT ["java", "-jar", "app.jar"]
