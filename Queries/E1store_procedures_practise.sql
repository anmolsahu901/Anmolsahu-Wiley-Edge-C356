-- ----basic 1

DELIMITER $$
CREATE  PROCEDURE totalCustomers()
BEGIN
select count(*) from customers ;
END$$

DELIMITER ;

call totalCustomers;

-- +----------+
-- | count(*) |
-- +----------+
-- |      122 |
-- +----------+


----------pass parameter--------------

DELIMITER $$
CREATE  PROCEDURE getCustomerOfCity(IN city varchar(50))
BEGIN
SELECT * FROM customers where customers.city =city;
END$$

DELIMITER ;

call getCustomerOfCity("Singapore");

-- +----------------+----------------------------+-----------------+------------------+----------------+-------------------------+--------------------------+-----------+-------+------------+-----------+------------------------+-------------+
-- | customerNumber | customerName               | contactLastName | contactFirstName | phone          | addressLine1            | addressLine2             | city      | state | postalCode | country   | salesRepEmployeeNumber | creditLimit |
-- +----------------+----------------------------+-----------------+------------------+----------------+-------------------------+--------------------------+-----------+-------+------------+-----------+------------------------+-------------+
-- |            148 | Dragon Souveniers, Ltd.    | Natividad       | Eric             | +65 221 7555   | Bronz Sok.              | Bronz Apt. 3/6 Tesvikiye | Singapore | NULL  | 079903     | Singapore |                   1621 |   103800.00 |
-- |            166 | Handji Gifts& Co           | Victorino       | Wendy            | +65 224 1555   | 106 Linden Road Sandown | 2nd Floor                | Singapore | NULL  | 069045     | Singapore |                   1612 |    97900.00 |
-- |            206 | Asian Shopping Network, Co | Walker          | Brydey           | +612 9411 1555 | Suntec Tower Three      | 8 Temasek                | Singapore | NULL  | 038988     | Singapore |                   NULL |        0.00 |
-- +----------------+----------------------------+-----------------+------------------+----------------+-------------------------+--------------------------+-----------+-------+------------+-----------+------------------------+-------------+


---------------return a single value and pass parameter-----------

DELIMITER $$
CREATE  PROCEDURE getCustomerNameById(OUT name varchar(20),IN customernumber int)
BEGIN
SELECT contactFirstName into name FROM customers where customers.customerNumber = customerNumber ;
END$$

DELIMITER ;

call getCustomerNameById(@name,114);
SELECT @name as name;

-- +-------+
-- | name  |
-- +-------+
-- | Peter |
-- +-------+

----------------multiple rows return multiple values 

DELIMITER $$

CREATE PROCEDURE getCustomerFullNameByCity (OUT firstname varchar(20),OUT lastname varchar(20), IN city varchar(50))
BEGIN
SELECT contactFirstName AS firstname,contactLastName AS lastname FROM customers where customers.city = city;
END$$

DELIMITER ;


call getCustomerFullNameByCity(@firstname,@lastname,"Nantes");

-- +-----------+----------+
-- | firstname | lastname |
-- +-----------+----------+
-- | Carine    | Schmitt  |
-- | Janine    | Labrune  |