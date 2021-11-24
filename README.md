# Simple Login Application
Reference material for a register and login application using Spring Security and MongoDB

## Table of Contents
1. [Setting Up a New Login Application](#setting-up-a-new-login-application)
2. [API Endpoints](#api-endpoints)
3. [Reference Material](#reference-material)

### Setting Up a New Login Application
- Copy the code featured in this repository
- Create a new MongoDB project
  - Create a new cluster
  - Obtain connection string
  - Use MongoDB Compass to create a new database
    - Should match the database name in the connection string. (e.g. MyFirstDatabase)
  - Use MongoDB Compass to create a new collection called "roles"
  - Add the following items: (The _id does not matter and will be automatically generated by MongoDB when using the "Add Data" > "Insert Document" approach)
- Set your system/user environment variables or provide them to the application
  - Ensure that the variable names match those in the application.properties
  - The Mongo URI should be the connection string
  - The secret should be any string which is unique and specific to your application
- Application will need to be run with the argument: `-Dspring-boot.run.jvmArguments="-Djdk.tls.client.protocols=TLSv1.2"`
  - Because of this, the application will either need to be run using the "start.bat" file in the repository, or the JVM arguments will need to be configured.
    
### API Endpoints
##### - [Swagger UI Available when running application: click here](http://localhost:8080/swagger-ui.html)
##### Sign In 
- `/authn/signin`
- POST
- Body: 
```
    {
        "username": "<USERNAME>",
        "password": "<PASSWORD>"
    }
```
<br>

##### Register
- `/authn/register`
- POST
- Body: 
```
    {
        "username": "<USERNAME>",
        "firstName": "<F_NAME>",
        "lastName": "<L_NAME>",
        "email": "<EMAIL>",
        "password": "<PASSWORD>",
        "roles": ["user","mod","admin"]
    }
```

### Reference Material
- [Bezkoder Spring Security Tutorial](https://www.bezkoder.com/spring-boot-jwt-auth-mongodb/)
