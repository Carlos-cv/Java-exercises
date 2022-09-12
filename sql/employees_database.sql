DROP DATABASE IF EXISTS 'employeesquery';
CREATE DATABASE 'employeesquery'; 
USE 'employeesquery';

SET NAMES utf8 ;
SET character_set_client = utf8mb4 ;

CREATE TABLE 'employees' (
  'employee_id' INT AUTO_INCREMENT,
  'name' VARCHAR(20),
  'salary' INT,
  'department_id' INT,
  PRIMARY KEY ('employee_id')
);
INSERT INTO 'employees' VALUES (1,'Carlos', 80000, 1);
INSERT INTO 'employees' VALUES (2,'Jack', 50000, 2);
INSERT INTO 'employees' VALUES (3,'Miguel', 35000, 3);
INSERT INTO 'employees' VALUES (4,'Julia', 75000, 2);
INSERT INTO 'employees' VALUES (5,'Katherine', 90000, 1);
INSERT INTO 'employees' VALUES (6,'Roxana', 40000, 1);

CREATE TABLE 'departments' (
  'department_id' INT,
  'department name' VARCHAR(20),
  PRIMARY KEY ('department_id')
) 
INSERT INTO `clients` VALUES (1,'IT');
INSERT INTO `clients` VALUES (2,'Sales');
INSERT INTO `clients` VALUES (3,'Resources Management');
