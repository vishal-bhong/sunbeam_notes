CREATE DATABASE dac_db;

USE dac_db;

CREATE TABLE employee(
    empid INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(20),
    salary DECIMAL(9,2)
);

INSERT INTO employee(name,salary) VALUES("Anil",10000);
SELECT * FROM employee;
