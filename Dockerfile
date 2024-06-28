# Utiliser l'image OpenJDK 11 comme base
FROM openjdk:17

# Copier le fichier JAR de l'application dans le répertoire /usr/app/ dans le conteneur
COPY target/contact-backend-service-0.0.1-SNAPSHOT.jar /usr/app/

# Définir le répertoire de travail
WORKDIR /usr/app/

# Définir le point d'entrée pour exécuter l'application Java
ENTRYPOINT ["java", "-jar", "contact-backend-service-0.0.1-SNAPSHOT.jar"]
# Exposer le port 8080 (docker)
EXPOSE 8083