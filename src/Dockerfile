FROM openjdk:11

COPY target/contact-backend-service-0.0.1-SNAPSHOT  /usr/app/

WORKDIR /usr/app/

ENTRYPOINT ["java", "-jar", "contact-backend-service-0.0.1-SNAPSHOT.jar"]

EXPOSE 8080