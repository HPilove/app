FROM openjdk:8
EXPOSE 9090
ADD target/telsoft-app-docker.jar telsoft-app-docker.jar
ENTRYPOINT ["java","-jar","/telsoft-app-docker.jar"]