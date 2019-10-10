# spring-boot-react-blog
Token-based blog application using spring boot, react and jwt start up kit.

### Technology Stack
Component         | Technology
---               | ---
Frontend          | React 16+
Backend           | Spring Boot 2.1+, Java 8
Security          | Spring Security, JWT
Auth              | Local, Google, Facebook
H2 Database       | In file based url: jdbc:h2:file:./blog-db;DB_CLOSE_DELAY=-1
Persistence       | JPA 
API Documentation | Swagger-UI
Client Build      | npm, yarn, webpack
Server Build      | Maven
JUnit Test        | JUnit 4 Mockito
frontend-maven-plugin | maven UI plugin for easy build creation

## Getting Started

### Prerequisites
-  Install Java 8 
-  Install Node.js 
-  Clone the repo `git clone https://github.com/jeck7/remote-work-blog.git`

## Local Development and Debugging 

Install [Maven](https://maven.apache.org/) and [Yarn](https://yarnpkg.com)

Start `SpringReactStarterApplication` in your IDE

Then start the front end

    $ cd src/main/app
    $ yarn start
    
The front end will start on [port 3000](http://localhost:3000).

## Running locally

To build and run locally

    $ mvn spring-boot:run
    
You can now access the app on [port 8080](http://localhost:8080)

## Build deployable package

To build a deployable artifact

    $ mvn package 
    or
    $ mvn clean install
    
The self contained jar will be created in `${project.basedir}/target`

To run the app

    $ java -jar target/spring-react-boilerplate-0.0.1-SNAPSHOT.jar
    
You can now access the app on [port 8080](http://localhost:8080)  


### Backend
- Go to your project folder from your terminal
- `$ cd blog`
- Run: `$ mvn spring-boot:run`

### Frontend
- Go to your project folder from your terminal
- `$ cd /src/main/app`
- Run: `$ npm install` or `$ yarn install`
- After install, run: `$ npm run start` or `$ yarn start`
- It will open your browser(http://localhost:3000) http://localhost:3000

### Swagger UI
- http://localhost:8080/swagger-ui.html

### Account
- admin email : admin@mail.com
- admin password : admin

## Screenshots

### Main View
<img src="https://user-images.githubusercontent.com/570388/66584804-73ab4b80-eb8e-11e9-8a55-80841977f112.png"></img>
### Post View
<img width="1792" alt="post" src="https://user-images.githubusercontent.com/570388/66594255-71062180-eba1-11e9-994f-63f1d43b3762.png">

### Editor View
<img width="1792" alt="editor" src="https://user-images.githubusercontent.com/570388/66593902-98a8ba00-eba0-11e9-965f-c564103ab224.png">

### Login View
<img width="1792" alt="login" src="https://user-images.githubusercontent.com/570388/66594022-dad1fb80-eba0-11e9-874d-8034175276cc.png">

