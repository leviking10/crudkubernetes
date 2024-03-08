FROM openjdk:17-jdk

WORKDIR /app
COPY target/crudkubernetes.jar /app/crudkubernetes.jar
EXPOSE 8089
# Exécuter l'application
CMD ["java", "-jar", "/app/crudkubernetes.jar"]
