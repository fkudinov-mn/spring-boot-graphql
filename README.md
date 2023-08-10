# spring-boot-graphql
In this project I realize the simple application to show GraphQL Server with Spring Boot Application.

# run in the first time
If you run in the first time application and want to see the testing data, just open the root file - `GrapgqldemoApplication`, and uncomment `CommandLineRunner`.

# Running
To run the application enter in the command line: `mvn spring-boot:run`


# DB Setup from Scratch
create database formular;
create user formular  with encrypted password 'formular';
grant all privileges on database formular to formular;
GRANT USAGE, CREATE ON SCHEMA public TO formular;


# Run App
mvn clean install
mvn spring-boot:run


# Querying
Go to url:   `http://localhost:8080/graphiql`

Run         queries

`query {
    posts { id, title, author, type, createdDate } 
}
`

`
query {
    post(id:5) { id, author , type, createdDate},
}
`

`
 mutation {
     createPost(title: "My Post Fedir", author: "Fedir", type: "programmer") {id}
 }
`