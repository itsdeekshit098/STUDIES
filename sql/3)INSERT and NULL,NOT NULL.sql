CREATE DATABASE insert1;
USE insert1;
CREATE TABLE orders111 (
  order_id INT,
  customer_name VARCHAR(50),
  order_date DATE,
  total_amount DECIMAL(10,2)
);

INSERT INTO orders111(order_id, customer_name, order_date, total_amount) VALUES
  (1, 'John Smith', '2022-01-01', 100.00),
  (2, 'Jane Doe', '2022-02-01', 250.50),
  (3, 'Bob Johnson', '2022-02-01', 75.99),
  (4, 'Alice Green', '2022-03-01', 500.25),
  (5, 'Tom Wilson', '2022-03-15', 350.10);
DROP TABLE ORDERS111;
								--   			insert
                                
                                
-- if we are inserting values into all columns then in syntax along with the table name we need not to inset all the column names 
-- NOTE: order of values should be same as table created while doing task as in above comments
-- when we are inserting values into specific 
INSERT INTO orders111
values
  (6, 'Tom Wilson', '2022-03-15', 350.10);
SELECT * FROM orders111;

  
-- inserting into specific colums
INSERT INTO orders111(order_id,total_amount)
VALUES
(7,112.20);
SELECT * FROM orders111;


INSERT INTO orders111(order_date,total_amount)
VALUES
('2022-03-15',324.22);


INSERT INTO orders111(order_date,total_amount)
VALUES
(324.22,'2022-03-15');		-- this raises error bcz we are pushing 324.22 into order-date of type date and '2022-03-15' to to total_amount column of type int





								-- null values
/*
It is not possible to test for NULL values with comparison operators, such as =, <, or <>.

We will have to use the IS NULL and IS NOT NULL operators instead.

IS NULL Syntax
						SELECT column_names
                        FROM table_name
                        WHERE column_name IS NULL;
IS NOT NULL Syntax
						SELECT column_names
						FROM table_name
						WHERE column_name IS NOT NULL;
*/
-- NULL
SELECT * FROM orders111;
SELECT * FROM orders111 where order_id IS NULL;
SELECT * FROM orders111 where order_date IS NULL;
SELECT * FROM orders111 where order_id,order_date IS NULL; -- error cannot use , u need to use operators
SELECT * FROM orders111 where order_id AND order_date IS NULL;

-- NOT NULL
SELECT * FROM orders111 where order_date IS NOT NULL;
SELECT * FROM orders111 where order_id IS NOT NULL;