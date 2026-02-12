create a postgres database with name 'testdb' and update the password in the configuration file

#mvn spring-boot:run

java -jar .\target\sb-backend-postgresql-0.0.1-SNAPSHOT.jar --DB_URL=jdbc:postgresql://localhost:5432/testdb --DB_USERNAME=postgres --DB_PASSWORD=postgres --test.testval=12345 --DB_DRIVER=org.postgresql.Driver

curl -X POST http://localhost:8080/api/tutorials/create -d '{"title":"test2", "description":"desc2"}' -H "Content-Type: application/json"

curl http://localhost:8080/api/tutorials/getAll
curl http://localhost:8082/api/tutorials/getAll

