FROM openjdk:11
VOLUME /tmp
ADD  target/springboot-keycloak.jar springboot-keycloak.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/springboot-keycloak.jar"]