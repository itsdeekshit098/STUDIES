CREATE DATABASE select_selectDistinct;
USE select_selectDistinct;

CREATE TABLE my_table (
	id INT PRIMARY KEY,
    name VARCHAR(20),
    age INT,
    score INT,
    grade CHAR(1));

INSERT INTO my_table
VALUES
	   (1, 'John Doe', 25, 85, 'B'),
       (2, 'Jane Smith', 30, 92, 'A'),
       (3, 'Bob Johnson', 40, 78, 'C'),
       (4, 'Sue Davis', 30, 85, 'B');

					-- SELECT 
                    
                    
-- SELECT used to retrieve data of  specified columns 
-- EX
SELECT age from my_table; -- retrieve or prints the age column from table of database 

		-- * resembles all columns
-- Ex
SELECT * FROM my_table;
SELECT age,name FROM my_table; -- retreiving multiple col using a single statement



					-- SELECT DISTINCT
-- SELECT DISTINCT = retrives the distinct data from specified columns
/* which means that if in age's col there are ages as follows(25,30,40,30) 
if u use select distinct instead of distinct u will get 25 30 40 with no other 30 */

-- EX
SELECT DISTINCT age FROM my_table;

					-- SELECT DISTINCT WITH MULTIPLE COL
-- if u specify multiple columns in select distinct then if two or more rows have same values those select columns then only one among them is printed
-- if u specify *(which means all columns) then if two ot more rows have same values in all columns then only row or record is printed among them
-- ex
CREATE TABLE myTabl(
	id INT ,
    name VARCHAR(20),
    age INT,
    score INT,
    grade CHAR(1));

INSERT INTO mytabl
VALUES
	   (1, 'John Doe', 25, 85, 'B'),
       (2, 'Jane Smith', 30, 92, 'A'),
       (3, 'Bob Johnson', 40, 78, 'C'),
       (4, 'Sue Davis', 30, 85, 'B'),
       (5, 'D',28,85,'D'),
       (6,'E',30,90,'D'),
       (6,'E',30,90,'D'),
       (6,'E',30,90,'E');
SELECT DISTINCT age FROM mytabl;
SELECT DISTINCT age,score FROM mytabl; -- last 2 rows not printed bcz score and age are same with 3rd row from last
SELECT DISTINCT age,grade FROM mytabl;-- last to 2nd row not printed bcz age,grade of that and above row are same but last row have grade diff eventhough score is same
SELECT  DISTINCT * FROM mytabl; 




				  -- WHERE with SELECT
-- WHERE is used when u want to retrieve data which satisfies a condition from specified columns
-- EX: id u want to retrive the records of people whose marks are above 80 
SELECT * FROM my_table WHERE score>80; -- as u see the row having 78 marks isnt retrieved bcz below 80

				 -- WHERE with SELECT DISTICT:
CREATE TABLE myTable (
	id INT ,
    name VARCHAR(20),
    age INT,
    score INT,
    grade CHAR(1));

INSERT INTO mytable
VALUES
	   (1, 'John Doe', 25, 85, 'B'),
       (2, 'Jane Smith', 30, 92, 'A'),
       (3, 'Bob Johnson', 40, 78, 'C'),
       (4, 'Sue Davis', 30, 85, 'B'),
       (5, 'D',28,85,'D'),
       (6,'E',30,90,'D'),
       (6,'E',30,90,'D'),
       (6,'E',30,90,'E');
DROP TABLE MYTABLE; 


select * from mytable;
-- IN BELOW STATEMENT if u see rows with id 6 all columns values of them are same so only one will be printed i.e., first onw
-- if u check first row with id 6 and last row with id 6 there grade differs as D and E so both are printed 
SELECT  DISTINCT * FROM mytable WHERE score>80; -- IF U DONT SPECIFY SPECIFIC COLUMN THEN SELECT DISTICT WORKS LIKE EACH ROW IS CHECKED WITH ALL OTHER ROWS IF DATA IN ALL COLUMNS IS SAME THEN THAT ROW WONT BE PRINTED IF ALEAST ONE FIELD OR COLUMN DATA IS DIFFERENT THEN IT IS PRINTED

SELECT DISTINCT age FROM mytable WHERE score>80;