CREATE DATABASE Todo_db;

USE Todo_db;

CREATE TABLE User(
    id INTEGER PRIMARY KEY AUTO_INCREMENT,
    firstName VARCHAR(100),
    lastName VARCHAR(100),
    email VARCHAR(50),
    phone VARCHAR(10),
    password VARCHAR(100),
    createdTimestamp TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

CREATE TABLE TodoItem(
    id INTEGER PRIMARY KEY AUTO_INCREMENT,
    title VARCHAR(100),
    details VARCHAR(1000),
    status VARCHAR(10) DEFAULT 'created',
    isPublic INT(1) DEFAULT 0,
    userId INTEGER,
    createdTimestamp TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);