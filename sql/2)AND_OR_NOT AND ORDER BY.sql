CREATE DATABASE operators;

USE operators;

CREATE TABLE test_table1 (
  id INT,
  name VARCHAR(50),
  age INT,
  city VARCHAR(50)
);

INSERT INTO test_table1 (id, name, age, city) VALUES
  (1, 'John', 20, 'New York'),
  (2, 'Jane', 30, 'Los Angeles'),
  (3, 'Bob', 20, 'Chicago'),
  (4, 'Mary', 20, 'Chicago'),
  (5, 'Alice', 28, 'San Francisco');
DROP TABLE test_table1;
/*			The WHERE clause can be combined with AND, OR, and NOT operators.

The AND and OR operators are used to filter records based on more than one condition:

The AND operator displays a record if all the conditions separated by AND are TRUE.
The OR operator displays a record if any of the conditions separated by OR is TRUE.
The NOT operator displays a record if the condition(s) is NOT TRUE.*/

SELECT * FROM test_table1 WHERE age=20 and (city='New York' OR city='Chicago');
SELECT * FROM test_table1 WHERE age=20 and city='New York' OR city='Chicago';

-- in above two statements the output is same but it wont be in all cases see below
SELECT * FROM test_table1 WHERE city='New York' and city='Chicago'OR age=28;-- here it is taking like city='new york' and city='chicago if not this or age=28 so we are getting some x output but what we want is to check first condition and then check the other two so in that case u need to use the brackets as below:
SELECT * FROM test_table1 WHERE city='New York' and (city='Chicago'OR age=28);-- now we will get no output bcz the condition is not satified

SELECT * FROM test_table1 WHERE NOT (city='New York' and (city='Chicago'OR age=28));
SELECT * FROM test_table1 WHERE NOT city='New York' and (city='Chicago'OR age=28); -- works different so be careful
 
 
 
 
						-- ORDER BY
CREATE TABLE orders1 (
  order_id INT,
  customer_name VARCHAR(50),
  order_date DATE,
  total_amount DECIMAL(10,2)
);

INSERT INTO orders1 (order_id, customer_name, order_date, total_amount) VALUES
  (1, 'John Smith', '2022-01-01', 100.00),
  (2, 'Jane Doe', '2022-02-01', 250.50),
  (3, 'Bob Johnson', '2022-02-01', 75.99),
  (4, 'Alice Green', '2022-03-01', 500.25),
  (5, 'Tom Wilson', '2022-03-15', 350.10);

DROP TABLE orders1;

SELECT * FROM orders1 ORDER BY order_date ASC;
SELECT * FROM orders1 ORDER BY order_date; -- IF U SPECIFY NOTHING IT TAKES LIKE ASCENDING
SELECT * FROM orders1 ORDER BY order_date DESC;


-- ORDER BY multiple columns 
SELECT * FROM orders1 ORDER BY order_date,total_amount; -- note on 01 of 2nd month 2 order of amount 75,250 as nothing is specified so orders by ASC so 75 is displayed first
SELECT * FROM orders1 ORDER BY order_date ASC,total_amount DESC; -- IN THIS CASE ALSO ON 01 DATE OF 2ND MONTH THERE ARE TWO ORDERS AS WE GAVE DATE ASC AND AMOUNT DESC SO ON 01-02 THE ORDER WITH HIGH AMOUNT DISPLAYED FIRST AND THE OTHER IS DISPLAYED NEXT
