-- NOT NULL                 – The NOT NULL constraint and show you how to declare a  NOT NULL column or add a NOT NULL constraint to an existing column.
-- Primary key              – The primary key constraint to create the primary key for a table.
-- Foreign key              – The foreign key and show you step by step how to create and drop foreign keys.
-- Disable foreign key checks –How to disable foreign key checks.
-- UNIQUE constraint        – UNIQUE constraint to enforce the uniqueness of values in a column or a group of columns in a table.
-- CHECK constraint         – How to create CHECK constraints to ensure data integrity.
-- DEFAULT                  – How to set a default value for a column using the DEFAULT constraint.
-- CHECK constraint emulation  – if you use MySQL 8.0.15 or earlier version, you can emulate CHECK constraints using views or triggers.


CREATE TABLE tasks(
    taskId INT PRIMARY Key,
    Note varchar(200),
    task_number INT UNIQUE,
    priority INT DEFAULT 5
);

when ->loaded
parent 
child


--disable foreign key_checks 
SET foreign key_checks = 0;

--enable foreign key_checks 
SET foreign key_checks = 1;






