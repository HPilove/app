FROM openjdk:17
EXPOSE 9090
ADD target/telsoft-app-docker.jar telsoft-app-docker
ENTRYPOINT ["java","-jar","/telsoft-app-docker.jar"]