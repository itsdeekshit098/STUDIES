CREATE DATABASE update1;
USE update1;
CREATE TABLE update1 (
  order_id INT,
  customer_name VARCHAR(50),
  order_date DATE,
  total_amount DECIMAL(10,2)
);

INSERT INTO update1(order_id, customer_name, order_date, total_amount) VALUES
  (1, 'John Smith', '2022-01-01', 100.00),
  (2, 'Jane Doe', '2022-02-01', 250.50),
  (3, 'Bob Johnson', '2022-02-01', 75.99),
  (4, 'Alice Green', '2022-03-01', 500.25),
  (5, 'Tom Wilson', '2022-03-15', 350.10);
								-- UPDATE
  UPDATE update1
  SET order_id=55,customer_name="changed name"
  WHERE order_id=5;
  
  SELECT * FROM update1;
  
  UPDATE update1
  SET order_id=67
  WHERE order_date<current_date();
   SELECT * FROM update1;
