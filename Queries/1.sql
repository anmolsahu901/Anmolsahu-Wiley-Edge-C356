CREATE DATABASE Wiley_table;

USE Wiley_table;

CREATE TABLE Students(
    Id PRIMARY KEY  int,
    firstname NOT NULL varchar(10),
    lastname varchar(10),
    age int CHECK(age>18)
);

-- Drop TABLE Students;
-- rename Students to StudentList;

INSERT INTO Students (1,'Anmol','Sahu',22);
INSERT INTO Students (2,'Ritu','Rathore',23);
INSERT INTO Students (3,'Rishav','Raj',24);
INSERT INTO Students (4,'Swati','Jha',25);

SELECT * FROM Students;









