# 🚀 ProgramacaoWebSpring

Welcome to ProgramacaoWebSpring, a Spring Boot project with Docker integration and H2 database setup!

This project was developed for a college assignment.

## 📝 Introduction

ProgramacaoWebSpring is a Java web application built with Spring Boot, aimed at providing a foundation for developing web-based applications. It includes basic CRUD operations and uses an H2 in-memory database for data storage, making it easy to set up and run for development and testing purposes.

## 🛠️ Development

### Prerequisites

Before you begin, ensure you have the following installed on your local machine:

- [Java Development Kit (JDK)](https://www.oracle.com/java/technologies/javase-jdk17-downloads.html)
- [Apache Maven](https://maven.apache.org/download.cgi)
- [Docker](https://docs.docker.com/get-docker/)

### Getting Started

1. Clone this repository to your local machine:

   ```bash
   git clone https://github.com/yourusername/ProgramacaoWebSpring.git
   ```

2. Navigate to the project directory:

    ```bash
    cd ProgramacaoWebSpring
    ```

3. Build and package the project using Maven:

    ```bash
    mvn clean install
    ```

Note: i don't have maven in my machine, so i use: `docker run -it --rm --name my-maven-project -v "$(pwd)":/usr/src/mymaven -w /usr/src/mymaven maven mvn clean install`

4. Start the Docker services defined in the docker-compose.yaml file:
    ```bash
    docker compose up
    ```

Your Spring Boot application and H2 database should now be running in Docker containers.
Usage
Access the H2 database console: http://localhost:8082
API base URL: http://localhost:8080

Note: You also can access this app using `mvn clean install`, `cd target` and `java -jar <Project-Name>.jar` 

## 🧰 Technologies Used

- Spring Boot
- Maven
- Docker
- H2 Database

## Routes:

- `GET` http://localhost:8080/api/users;
- `GET` http://localhost:8080/api/users/{user-id-here};
- `POST` http://localhost:8080/api/users;
- `PUT` http://localhost:8080/api/users/{user-id-here};
- `DELETE` http://localhost:8080/api/users;