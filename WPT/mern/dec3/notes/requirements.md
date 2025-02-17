# Backend for Notes application

## requirements

- user
  - register (POST /user/register)
  - login (POST /user/login)
  - forgot password (POST /user/forgot-password)
  - change password (PATCH /user/password)
  - update profile (PUT /user/profile)
- todo
  - create a item (private) (POST /todo/)
  - update an item (PUT /todo/<id>)
  - delete an item (DELETE /todo/<id>)
  - list my items (GET /todo/my)
  - list all public items (GET /todo/public)
  - search the items (POST /todo/search)

## packages

- express
  - used to implement REST APIs
- mysql2
  - used to connect to the MySQL server
  - driver provided by MySQL for connecting nodejs applications to the mysql database
- crypto-js
  - used to add encryption
- jsonwebtoken
  - used to implement JWT functionality
  - token
    - string which contains required data in encrypted format
    - contains 3 parts
      - header
        - contains the metadata about the payload
        - its contains the algorithm used to sign the payload
      - payload (body)
        - application specific data
        - this data contains the information application will use
      - signature
        - a key used to create signature which will make the encryption unique

## security

### Confidentiality

- confidential data must be confidential
- the confidential data must not be visible/readable
- to achieve confidentiality use encryption
- encryption
  - conversion of plain text to cypher text

### Integrity

- once the data is entered in the application, it can be retrieved at any time in the future without getting corrupted

### Availability

- the application will be always available irrespective to the infrastructure
- to achieve high availability (HA), use horizontal scaling

### Authentication

- checking if a user is valid
- to implement authentication
  - store the users data like email and password
  - and challenge the user to enter the same to login in the system

### Authorization

- checking which part of the application is allowed to access for authenticated user
- to implement authorization
  - use json web token (JWT)
