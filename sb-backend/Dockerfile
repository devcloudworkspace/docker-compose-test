FROM alpine/java:21-jdk

WORKDIR '/app'

COPY ./target/*.jar sb-backend.jar

EXPOSE 8082

ENTRYPOINT ["java", "-jar", "sb-backend.jar"]