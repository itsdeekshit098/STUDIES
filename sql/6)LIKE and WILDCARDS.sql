/*
							-- wildcards
Symbol	Description	Example
%		Represents zero or more characters											bl% finds bl, black, blue, and blob
_		Represents a single character												h_t finds hot, hat, and hit
[]		Represents any single character within the brackets							h[oa]t finds hot and hat, but not hit
^		Represents any character not in the brackets								h[^oa]t finds hit, but not hot and hat
-		Represents any single character within the specified range					c[a-b]t finds cat and cbt
*/
							-- LIKE
/*
	like is used when one need to query the specific columns where a specific pattern is found in a specific column
    
    syntax:
    
    SELECT c1,c2,c3.... FROM TABLE_NAME 
    WHERE only_one_column_name
    LIKE pattern;              NOTE:PATTERNS NEED TO BE IN " "(INVERTED COMMAS)    
    
    examples of pattern
    a% 		==starts with a and has zero or more character after it
    %a		==ends with a
    a%b		==starts with a and ends with b with zero or character in b/w a and begin
    a_b     ==starts with a and ends with b with only one character in between them
    a[az]b	==starts with a and ends with b with any one character in the brackets
    a[a-z]b  ==starts with a and ends with b with any one character in b/w the range of a-z specified in brackets
    a_		==starts with a and has only one character after a
 */
 CREATE DATABASE like1;
 USE like1;
 CREATE TABLE users (
    id INT,
    name VARCHAR(50),
    email VARCHAR(50)
);
INSERT INTO users (id, name, email)
VALUES 
  (1, 'John Doe', 'johndoe@example.com'),
  (2, 'Jane Smith', 'janesmith@example.com'),
  (3, 'Bob Johnson', 'bobjohnson@example.com'),
  (4, 'Sara Lee', 'saralee@example.com');

SELECT * FROM users WHERE name LIKE "J%";
SELECT id,email FROM users WHERE name LIKE "J%";
SELECT * FROM users WHERE name LIKE "__r__L%";	-- % represents with any number of character after the L
SELECT * FROM users WHERE name LIKE "__r__L__"; -- _ after L represents a name with two character afer the L
SELECT * FROM users WHERE name LIKE "J[^a-z]h%";
-- below queries are not showing appropriate output let me ask sir about it
SELECT * FROM users WHERE name LIKE "J[ao]h%";
SELECT * FROM users WHERE name LIKE "J[a-z]h%";


 
 