create a postgres database with name 'testdb' and update the password in the configuration file

mvn spring-boot:run

curl -X POST http://localhost:8081/api/frontend/create -d '{"title":"test2", "description":"desc2"}' -H "Content-Type: application/json"
$ curl -X POST http://localhost:8081/api/frontend/create -d '{"title":"test5", "description":"desc5"}' -H "Content-Type: application/json"
