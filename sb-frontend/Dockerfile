FROM alpine/java:21-jdk

WORKDIR '/app'

COPY ./target/*.jar sb-frontend.jar

EXPOSE 8081

ENTRYPOINT ["java", "-jar", "sb-frontend.jar"]