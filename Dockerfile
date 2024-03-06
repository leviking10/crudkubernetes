FROM openjdk:17
EXPOSE 8080
ADD target/crudkubernetes.jar crudkubernetes.jar
ENTRYPOINT ["java","-jar","/crudkubernetes.jar"]