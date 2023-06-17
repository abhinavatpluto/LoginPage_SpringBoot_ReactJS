
 LoginPage_SpringBoot_ReactJS

 This file contains code for registration page 

 make a form  using react.js containing these fields
 ID - firstName - lastName - password - Confirm Password - email   ------- In react 

-------------------------------------------------

Endpoints for GET, POST, GetById, Delete 

// Find all user
GET - http://localhost:8080/users

  // Find user by id
  GET - http://localhost:8080/users/{id}  

POST - http://localhost:8080/users
          containing fields - JSON format
           {
        "id": 144,
        "firstName": "Abhinav",
        "lastname": "Kumar",
        "password": "1234543",
        "confirmPassword": "1234543",
        "email": "a@a.com"
    }
    
 // Delete -  http://localhost:8080/users/{id}  
  For ex - http://localhost:8080/users/144  
  

