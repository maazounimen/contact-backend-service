# Utiliser l'image OpenJDK 11 comme base
FROM openjdk:11

# Copier le fichier JAR de l'application dans le répertoire /usr/app/ dans le conteneur
COPY target/contact-backend-service-*.jar /usr/app/

# Définir le répertoire de travail
WORKDIR /usr/app/

# Définir le point d'entrée pour exécuter l'application Java
ENTRYPOINT ["java", "-jar", "contact-backend-service-*.jar"]

# Exposer le port 8081
EXPOSE 8081
