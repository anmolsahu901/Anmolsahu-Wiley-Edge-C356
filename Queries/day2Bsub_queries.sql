-- Subquery –      How to nest a query (inner query) within another query (outer query) and use the result of the inner query for the outer query.
-- Derived table – derived table concept and show you how to use it to simplify complex queries.
-- EXISTS –        test for the existence of rows.
-- MySQL subquery to write complex queries
/* 
 MySQL subquery is a query nested within another query 
 such as SELECT, INSERT, UPDATE or DELETE. Also, a subquery can be nested within another subquery.
 
 A MySQL subquery is called an inner query while the query that contains the subquery is 
 called an outer query. A subquery can be used anywhere that expression
 is used and must be closed in parentheses.
 */
-- Use Cases
-- return the employees who are working in usa
SELECT
    lastName,
    firstName
from
    employees
WHERE
    officeCode IN(
        SELECT
            officeCode
        FROM
            offices
        where
            country = 'USA'
    );

-- Subquery to return the employees who work in the offices located in the USA.
-- MySQL subquery with comparison operators
-- Return the customer who has the highest payment.
SELECT
    customerNumber,
    checkNumber,
    amount
FROM
    payments
WHERE
    amount = (
        SELECT
            MAX(amount)
        FROM
            payments
    );

-- Find customers whose payments are greater than the average payment using a subquery:
SELECT
    customerNumber,
    checkNumber,
    amount
FROM
    payments
WHERE
    amount > (
        SELECT
            AVG(amount)
        FROM
            payments
    );

------------
--MySQL subquery with IN and NOT IN operators
-- We an use other operators such as IN or NOT IN operator in the WHERE clause.
--Use customers and orders tables
-- Find the customers who have not placed any orders with Subquery and  NOT IN operator 
SELECT
    customerName
from
    customers
WHERE
    customerNumber NOT IN(
        SELECT
            DISTINCT customerNumber
        FROM
            orders
    );

-- MySQL subquery in the FROM clause
-- Find the maximum, minimum, and average number of items in sale orders with SubQuery
SELECT
    MIN(items),
    MAX(items),
    AVG(items)
from
    (
        SELECT
            orderNumber,
            COUNT(orderNumber) AS items
        FROM
            orderdetails
        GROUP BY
            orderNumber
    ) as lineItems;

-- MySQL correlated subquery
/*Unlike a standalone subquery, a correlated subquery is a subquery that uses the data from the outer query. In other words, a correlated subquery depends on the outer query. 
 A correlated subquery is evaluated once for each row in the outer query.*/
-- Select products whose buy prices are greater than the average buy price of 
-- all products in each product line with correlated subquery
SELECT
    productName,
    buyprice
from
    products p1
where
    buyprice >(
        Select
            AVG(buyprice)
        from
            products
        WHERE
            productline = p1.productline
    );

--  Note: 
--  Unlike a regular subquery, you cannot execute a correlated subquery independently like this. 
--  If you do so, MySQL doesn’t know the p1 table and will issue an error.
SELECT
    AVG(buyprice)
FROM
    products
WHERE
    productline = p1.productline;

* / -- MySQL subquery with EXISTS and NOT EXISTS
/*
 When a subquery is used with the EXISTS or NOT EXISTS operator, a subquery returns a 
 Boolean value of TRUE or FALSE.  The following query illustrates a subquery used with the 
 EXISTS operator:
 */
SELECT
    *
FROM
    table_name
WHERE
    EXISTS(subquery);

-- Use orders and orderdetails table
-- Find sales orders whose total values are greater than 60K.
SELECT
    orderNumber,
    SUM(priceEach * quantityOrdered) total
FROM
    orderdetails
    INNER join orders Using (orderNumber)
GROUP BY
    orderNumber
having
    SUM(priceEach * quantityOrdered) > 60000;

---
-- use the query above as a correlated subquery to find customers who placed 
-- at least one sales order with the total value greater than 60K by using the EXISTS operator
SELECT
    customerName,
    customerNumber
FROM
    customers
WHERE
    EXISTS (
        SELECT
            orderNumber,
            SUM(priceEach * quantityOrdered) total
        FROM
            orderdetails
            INNER join orders Using (orderNumber)
        WHERE
            customerNumber = customers.customerNumber
        GROUP BY
            orderNumber
        having
            SUM(priceEach * quantityOrdered) > 60000
    );

--------------------------------------------------------------------------------------------
-- MySQL Derived Tables
/*
 A derived table is a virtual table returned from a SELECT statement.
 A derived table is similar to a temporary table, 
 but using a derived table in the SELECT statement is much simpler than a
 temporary table because it does not require creating the temporary table.
 
 The term derived table and subquery is often used interchangeably. When a stand-alone 
 subquery is used in the FROM clause of a SELECT statement, it is also called a derived table.
 */
-- Note: Every derived table must have its own alias.
SELECT
    select_list
FROM
    (
        SELECT
            select_list
        FROM
            table_1
    ) derived_table_name
WHERE
    derived_table_name.c1 > 0;

-- Get the top five products by sales revenue in 2003 
--from the orders and orderdetails tables
-- time 11:45 am 
Select
    productCode,
    ROUND (SUM(quantityOrdered * priceEach)) sales
from
    orderdetails
    INNER JOIN orders using (orderNumber)
WHERE
    YEAR(shippedDate) = 2003
GROUP BY
    productCode
ORDER BY
    sales DESC
LIMIT
    5;

-- Use the result of this query as a derived table and join it with the products table
-- time 11:45 am 
SELECT
    productName,
    sales
from
    (
        Select
            productCode,
            ROUND (SUM(quantityOrdered * priceEach)) sales
        from
            orderdetails
            INNER JOIN orders using (orderNumber)
        WHERE
            YEAR(shippedDate) = 2003
        GROUP BY
            productCode
        ORDER BY
            sales DESC
        LIMIT
            5
    ) top5productof2003
    INNER join products Using (prodCode);

-- complex MySQL derived table 
/*
 Classify the customers who bought products in 2003 into 3 groups: platinum, gold, and silver. 
 And we need to know the number of customers in each group with the following conditions:
 
 Platinum customers who have orders with the volume greater than 100K.
 Gold customers who have orders with the volume between 10K and 100K.
 Silver customers who have orders with the volume less than 10K.
 */
SELECT
    customerNumber,
    ROUND(SUM(quantityOrdered * priceEach)) sales,
    (
        CASE
            WHEN SUM(quantityOrdered * priceEach) < 10000 THEN 'Silver'
            WHEN SUM(quantityOrdered * priceEach) BETWEEN 10000
            AND 100000 THEN 'Gold'
            WHEN SUM(quantityOrdered * priceEach) > 100000 THEN 'Platinum'
        END
    ) customerGroup
FROM
    orderdetails
    INNER JOIN orders USING(orderNumber)
WHERE
    YEAR(shippedDate) = 2003
GROUP BY
    customerNumber;

-----------
SELECT
    customerGroup,
    COUNT(cg.customerGroup) AS groupCount
FROM
    (
        SELECT
            customerNumber,
            ROUND(SUM(quantityOrdered * priceEach)) sales,
            (
                CASE
                    WHEN SUM(quantityOrdered * priceEach) < 10000 THEN 'Silver'
                    WHEN SUM(quantityOrdered * priceEach) BETWEEN 10000
                    AND 100000 THEN 'Gold'
                    WHEN SUM(quantityOrdered * priceEach) > 100000 THEN 'Platinum'
                END
            ) customerGroup
        FROM
            orderdetails
            INNER JOIN orders USING(orderNumber)
        WHERE
            YEAR(shippedDate) = 2003
        GROUP BY
            customerNumber
    ) cg
GROUP BY
    cg.customerGroup;

-- MySQL EXISTS operator
/*
 The EXISTS operator is a Boolean operator that returns either true or false. 
 The EXISTS operator is often used to test for the existence of rows returned by the subquery.
 */
-- Syntax of the EXISTS operator
SELECT
    select_list
FROM
    a_table
WHERE
    [NOT] EXISTS(subquery);

-- Use customers and orders tables 
-- Find the customer who has at least one order using EXISTS operator
select
    customerName,
    customerNumber
from
    customers c
where
    EXISTS (
        SELECT
            customerNumber
        FROM
            orders o
        WHERE
            c.customerNumber = o.customerNumber
    );

-- Find customers who do not have any orders using EXISTS operator
select
    customerName,
    customerNumber
from
    customers c
where
    NOT EXISTS (
        SELECT
            customerNumber
        FROM
            orders o
        WHERE
            c.customerNumber = o.customerNumber
    );

-- Update the phone’s extensions of the employees who work at the office in San Francisco.
-- Find employees who work at the office in San Franciso
-- 12.35
select
    employeeNumber,
    firstName,
    lastName,
    extension
from
    employees
WHERE
    exists (
SELECT
    1
from offices
where
    city = 'San Francisco'
    AND
GROUP BY
    offices.officeCode = employees.officeCode );

-- MySQL UPDATE EXISTS 


-- MySQL INSERT EXISTS
-- Archive customers who don’t have any sales order in a separate table. 
-- MySQL DELETE EXISTS 
-- Archiving the customer data is to delete the customers that exist in 
-- the customers_archive table from the customers table
-- Select all employees who work at the office in San Francisco.