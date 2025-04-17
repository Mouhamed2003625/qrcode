# Utilise une image Java officielle
FROM openjdk:17-jdk-slim

# Dossier de l'application dans le container
WORKDIR /app

# Copie le JAR dans le container
COPY out/qrcode_jar/qrcode.jar app.jar

# Port exposé (change selon ton app si besoin)
EXPOSE 8080

# Commande pour démarrer l'app
CMD ["java", "-jar", "app.jar"]
