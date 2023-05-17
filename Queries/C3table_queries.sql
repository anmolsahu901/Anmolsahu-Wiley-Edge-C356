-- MySQL storage engines           – it is essential to understand the features of each storage engine so that you can use them effectively to maximize the performance of your databases.
-- CREATE TABLE                    – how to create new tables in a database using CREATE TABLE statement.
-- AUTO_INCREMENT                  – how to use an AUTO_INCREMENT column generate unique numbers automatically for the primary key.
-- ALTER TABLE                     – learn how to change the structure of a table using the ALTER TABLE statement.
-- Renaming tables                 – how to rename a table using RENAME TABLE statement.
-- Removing a column from a table  – how to use the ALTER TABLE DROP COLUMN statement to remove one or more columns from a table.
-- Adding a new column to a table  – how to add one or more columns to an existing table using ALTER TABLE ADD COLUMN statement.
-- DROP TABLE                      – how to remove existing tables using DROP TABLE statement.
-- Temporary tables                – discuss MySQL temporary tables and how to manage temporary tables effectively.
-- TRUNCATE TABLE                  – how to delete all data from a table fast and more efficient using the TRUNCATE TABLE statement.
-- Generated columns               – guide you on how to use the generated columns to store data computed from an expression or other columns.
-- MySQL provides various storage engines for its tables as follows:
-- MyISAM
-- InnoDB
-- MERGE
-- MEMORY (HEAP)
-- ARCHIVE
-- CSV
-- FEDERATED
-- MyISAM
-- MyISAM extends the former ISAM storage engine. The MyISAM tables are optimized for compression and speed. MyISAM tables are also portable between platforms and operating systems.
-- The size of the MyISAM table can be up to 256TB, which is huge. In addition, MyISAM tables can be compressed into read-only tables to save spaces. At startup, MySQL checks MyISAM tables for corruption and even repairs them in a case of errors. The MyISAM tables are not transaction-safe.
-- Before MySQL version 5.5, MyISAM is the default storage engine when you create a table without specifying the storage engine explicitly. From version 5.5, MySQL uses InnoDB as the default storage engine.
-- InnoDB
-- The InnoDB tables fully support ACID-compliant and transactions. They are also optimal for performance. InnoDB table supports foreign keys, commit, rollback, roll-forward operations. The size of an InnoDB table can be up to 64TB.
-- Like MyISAM, the InnoDB tables are portable between different platforms and operating systems. MySQL also checks and repairs InnoDB tables, if necessary, at startup.
-- MERGE
-- A MERGE table is a virtual table that combines multiple MyISAM tables that have a similar structure to one table. The MERGE storage engine is also known as the MRG_MyISAM engine. The MERGE table does not have its own indexes; it uses indexes of the component tables instead.
-- Using MERGE table, you can speed up performance when joining multiple tables. MySQL only allows you to perform SELECT, DELETE, UPDATE and INSERT operations on the MERGE tables. If you use DROP TABLE statement on a MERGE table, only MERGE specification is removed. The underlying tables will not be affected.
-- Memory
-- The memory tables are stored in memory and use hash indexes so that they are faster than MyISAM tables. The lifetime of the data of the memory tables depends on the uptime of the database server. The memory storage engine is formerly known as HEAP.
-- Archive
-- The archive storage engine allows you to store a large number of records, which for archiving purpose, into a compressed format to save disk space. The archive storage engine compresses a record when it is inserted and decompress it using the zlib library as it is read.
-- The archive tables only allow INSERT and SELECT statements. The ARCHIVE tables do not support indexes, so it is required a full table scanning for reading rows.
-- CSV
-- The CSV storage engine stores data in comma-separated values (CSV) file format. A CSV table brings a convenient way to migrate data into non-SQL applications such as spreadsheet software.
-- CSV table does not support NULL data type. In addition, the read operation requires a full table scan.
-- FEDERATED
-- The FEDERATED storage engine allows you to manage data from a remote MySQL server without using the cluster or replication technology. The local federated table stores no data. When you query data from a local federated table, the data is pulled automatically from the remote federated tables.
-----------------------------------------------------------
-- Create Tables 
CREATE TABLE IF NOT EXISTS tasks (
    task_id INT AUTO_INCREMENT PRIMARY KEY,
    title VARCHAR(255) NOT NULL,
    start_date DATE,
    due_date DATE,
    status TINYINT NOT NULL,
    -- TINYINT LIKE : 0 TO 5 DEPENDS 
    priority TINYINT NOT NULL,
    -- PRIORITY GIVEN TO SOME VARIABLE 
    description TEXT,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
) ENGINE = INNODB;

CREATE TABLE IF NOT EXISTS checklists (
    todo_id INT AUTO_INCREMENT,
    task_id INT,
    todo VARCHAR(255) NOT NULL,
    is_completed BOOLEAN NOT NULL DEFAULT FALSE,
    PRIMARY KEY (todo_id, task_id),
    FOREIGN KEY (task_id) REFERENCES tasks (task_id) ON UPDATE RESTRICT ON DELETE CASCADE -- 10:26 MORNING 
);

ALTER TABLE
    checklists
ADD
    note VARCHAR(300) NOT NULL;

-- aLTER the table
CREATE TABLE vehicles(
    vehicleId INT,
    year INT NOT NULL,
    make VARCHAR(100) NOT NULL,
    PRIMARY KEY(vehicleId)
);

--ADD TABLE
ALTER TABLE
    vehicle
ADD
    model VARCHAR(100) NOT NULL,
ADD
    note VARCHAR(100) NOT NULL;

DESCRIBE vehicles;

--------------------
--modify column
ALTER TABLE
    vehicles
MODIFY
    model VARCHAR(300) NOT NULL,
MODIFY
    note VARCHAR(100) NOT NULL;

----------------
--RENAME COL
ALTER TABLE
    vehicles CHANGE COLUMN note vehicleCondition VARCHAR(255) NOT NULL;

------------------
--DROP COL
ALTER TABLE
    vehicles DROP COLUMN vehicleCondition;

---------------
CREATE DATABASE IF NOT EXISTS hr;

-- use hr
CREATE TABLE departments (
    department_id INT AUTO_INCREMENT PRIMARY KEY,
    dept_name VARCHAR(100)
);

CREATE TABLE employees (
    id int AUTO_INCREMENT primary key,
    first_name varchar(50) not null,
    last_name varchar(50) not null,
    department_id int not null,
    FOREIGN KEY (department_id) REFERENCES departments (department_id)
);

INSERT INTO
    departments(dept_name)
VALUES
    ('Sales'),
    ('Markting'),
    ('Finance'),
    ('Accounting'),
    ('Warehouses'),
    ('Production');

INSERT INTO
    employees(first_name, last_name, department_id)
VALUES
    ('John', 'Doe', 1),
    ('Bush', 'Lily', 2),
    ('David', 'Dave', 3),
    ('Mary', 'Jane', 4),
    ('Jonatha', 'Josh', 5),
    ('Mateo', 'More', 1);

------------------
SELECT
    department_id,
    dept_name
FROM
    departments;

--------------
SELECT
    id,
    first_name,
    last_name,
    department_id
FROM
    employees;

-----------------
--referenceed by VIEW :11AM
CREATE VIEW v_employee_info as
SELECT
    id,
    first_name,
    last_name,
    department_id
from
    employees
    INNER JOIN departments USING (department_id);

----
--if you rename table views will get affetced 
CHECK TABLE v_employee_info;

RENAME TABLE employees TO people;

---- 11:15
RENAME TABLE departments to depts;

DELETE FROM
    depts
WHERE
    department_id = 1;

RENAME TABLE depts TO departments,
people TO employees;

------------
--RENAME TABLES usin alter table
ALTER TABLE
    old_tablename to new_tableName;

--- create temporary table
CREATE TEMPORARY TABLE lastNames
SELECT
    DISTINCT last_name
FROM
    employees;

--rename table does not work in temporary table and ALTER works
RENAME TABLE lastNames to unique_lastnames;

--ERROR 1146 (42S02): Table 'hr.lastnames' doesn't exist
ALTER TABLE
    lastNames RENAME to unique_lastnames;

--Query OK, 6 rows affected (0.01 sec)
--Records: 6  Duplicates: 0  Warnings: 0
--------------
--task is to add column if does not exist if exist do nothing
--not even show error

------situation------ 
ALTER TABLE
    table_name
ADD
    column...(if it already exist)




SELECT
    IF (COUNT(*) = 1, 'Exist', 'Not Exist') AS result
FROM
    information_schema.columns
WHERE
    table_schema = "database_name"
    AND table_name = "table1"
    AND column_name = "Location";


-- Eg-- 
SELECT
    IF (COUNT(*) = 1, 'Exist', 'Not Exist') AS result
FROM
    information_schema.columns
WHERE
    table_schema = "hr"
    AND table_name = "employees"
    AND column_name = "Location";

-- +-----------+
-- | result    |
-- +-----------+
-- | Not Exist |
-- +-----------+

------------------------------
DROP COLUMN

------------------------------

DROP TABLE 

DROP TABLE table_name;

DROP TABLE table_name,table1,table2;

DROP TABLE IF EXISTS table_name;

DROP TABLE LIKE '%PATTERNS%';

---11:48





-------------------------

-- Generated columns
CREATE TABLE IF NOT EXISTS contacts(
     id int AUTO_INCREMENT primary key,
    first_name varchar(50) not null,
    last_name varchar(50) not null,
    full_name varchar(100) GENERATED ALWAYS AS (CONCAT(first_name,' ',last_name))
);

----- using alter command for generated column
ALTER TABLE contacts
ADD COLUMN full_name data_type
GENERATED ALWAYS AS (formula);

ALTER TABLE products
ADD COLUMN inStockPrice INT
GENERATED ALWAYS AS (quantityInStock*buyPrice) STORED;
--- VIRTUAL AND STORED TWO TYPES 

----12:24