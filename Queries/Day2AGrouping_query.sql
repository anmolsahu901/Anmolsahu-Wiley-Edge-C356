-- find all the orders that already shipped and total amout greater than 1500
SELECT
    a.orderNumber,
    status,
    sum(priceEach * quantityOrdered) AS total
FROM
    orderDetails a
    Inner JOIN orders b ON b.orderNumber = a.orderNumber
GROUP BY
    orderNumber,
    status
HAVING
    status = "Shipped"
    and total > 1500;

-- created a new table named sales that stores the order values summariezed by product lines and years
--the data comes from the products , orders, and ordeDetails table 
--products, orders, orderdetails
--create a sales table
create table sales
select
    productline,
    YEAR(orderDate) orderYear,
    SUM(priceEach * quantityOrdered) AS orderValue
from
    orderDetails
    Inner Join orders using (orderNumber)
    inner Join products using (productCode)
GROUP BY
    productline,
    orderYear;

--Grouping set is a set of cols which ou wanted to groups 
SELECT
    productline,
    sum(orderValue) totalOrderValue
from
    sales
GROUP BY
    productline;

-- this will create empty grp
SELECT
    SUM(orderValue) totalOrderValue
FROM
    sales;

-- 2 or more groping sets totgehter on one query union all
SELECT
    productline,
    sum(orderValue) totalOrderValue
from
    sales
GROUP BY
    productline
UNION
ALL
SELECT
    NULL,
    SUM(orderValue) totalOrderValue
FROM
    sales;