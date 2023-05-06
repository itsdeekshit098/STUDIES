CREATE DATABASE maths1;
USE maths1;

CREATE TABLE maths1(
  order_id INT,
  customer_name VARCHAR(50),
  order_date DATE,
  total_amount DECIMAL(10,2)
);

INSERT INTO maths1(order_id, customer_name, order_date, total_amount) 
VALUES
  (1, 'John Smith', '2022-01-01', 100.00),
  (2, 'Jane Doe', '2022-02-01', 250.50),
  (3, 'Bob Johnson', '2022-02-01', 75.99),
  (4, 'Alice Green', '2022-03-01', 500.25),
  (5, 'Tom Wilson', '2022-03-15', 350.10);
						-- MIN
 SELECT MIN(total_amount) FROM maths1; 
SELECT MIN(total_amount AND order_id) FROM maths1; -- THIS IS INVALID SYNTAX
/*
The last statement (SELECT MAX(order_id AND total_amount) FROM maths1) is invalid syntax because the AND operator cannot
 be used to find the maximum value between two columns in a SQL query. The correct syntax to find the maximum value of a 
 column in a table is to use the MAX() function followed by the column name.

To get the maximum value between two columns in a SQL query, you can use the GREATEST() function. The GREATEST() function 
takes two or more arguments and returns the largest value among them.

SELECT GREATEST(order_id, total_amount) AS max_value FROM maths1;

 */
 SELECT GREATEST(order_id, total_amount)  FROM maths1; -- IT DOESNT WORKS AS WE NEEDED 
 SELECT MAX(col_value) AS max_value
FROM (
  SELECT order_id AS col_value FROM maths1
  UNION
  SELECT total_amount AS col_value FROM maths1
) AS combined_values;

						-- MAX
 SELECT MAX(total_amount) FROM maths1; 
SELECT MAX(order_id AND total_amount) FROM maths1; -- THIS IS INVALID SYNTAX

/*
The last statement (SELECT MAX(order_id AND total_amount) FROM maths1) is invalid syntax because the AND operator cannot
 be used to find the maximum value between two columns in a SQL query. The correct syntax to find the maximum value of a 
 column in a table is to use the MAX() function followed by the column name.
 */
 
 
					-- COUNT
SELECT COUNT(order_id) FROM maths1;

					-- AVG
SELECT AVG(total_amount) FROM maths1;

					-- SUM
SELECT SUM(total_amount) FROM maths1;