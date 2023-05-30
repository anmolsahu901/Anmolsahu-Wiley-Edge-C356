-- ---control flow 
-- CASE  10:18 - 36


WITH cte AS(
    SELECT
        c.customerName,
        COUNT(o.customerName) AS order_count
    FROM
        customers c
        LEFT JOIN orders o ON c.customerName = o.customerName
    GROUP BY
        c.customerNumber,
        c.customerName
)
SELECT
    customerName,
    order_count,
    case
        order_count
        WHEN 1 THEN 'one-time customer'
        WHEN 2 THEN 'repeated customer'
        WHEN 3 THEN 'frequent customer'
        ELSE 'lOYAL Customer'
    END customerType
FROM
    cte_count
ORDER BY
    customerName;

--------------------
--CASE & ORDER BY 
-- sort the customers by states if state is not null
-- or sort country in case the state is not
SELECT
    customerName,
    city,
    country
FROM
    customers
ORDER BY
    (
        CASE
            WHEN STATE IS NULL THEN country
            ELSE state
        END
    )
LIMIT
    5;

---------------------------
-- sum to calculate total sales orders by order status
--- write all the status by this way !! 
SELECT
    SUM(
        CASE
            WHEN status = "shipped" then 1
            ELSE 0
        END
    ) AS 'shipped',
    SUM(
        CASE
            WHEN status = "on Hold" then 1
            ELSE 0
        END
    ) AS 'on Hold',
    COUNT(*) as total
FROM
    orders;

-- +---------+---------+-------+
-- | shipped | on Hold | total |
-- +---------+---------+-------+
-- |     303 |       4 |   326 |
-- +---------+---------+-------+


------------------------
-- IF 
SELECT
    IF(1 = 2, 'TRUE', 'FALSE');

SELECT
    IF(1 = 1, 'TRUE', 'FALSE');

SELECT
    customerName,
    customerNumber,
    IF(state IS NULL, 'N/A', state) state,
    country
FROM
    customers;

-- IFNULL
IFNULL(exp1,exp2);

IFNULL(1,0);

IFNULL(NULL,'IF NULL FUNCTION');

employee info 
mobile 
home_phone
-- is mobile number is not there select home number 
SELECT contactName,IFNULL(mobile,home_phone) phone
FROM emp_contact_info;


-- NULLIF
NULLIf(expr1,expr2);

CASE WHEN expression1 = expression2
    THEN NULL
    ELSE
    expression1
    END;

---- instead of writing this much we use nullif 

----get all orders created in june 2003
SELECT
orderNumber,orderDate,requiredDate,shippedDate,status
FROM orders
WHERE
 orderDate BETWEEN '2004-06-01' and '2003-06-30';


---

