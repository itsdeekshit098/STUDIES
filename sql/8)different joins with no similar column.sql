create database joins3;
use joins3;
create table student(
s_id int,
name varchar(30),
marks int);

create table course(
c_id int,
course_name varchar(30),
c_credits int);

insert into student
values
(1,"hansi1",59),
(2,"hansi2",67),
(3,"hansi3",77),
(4,"hansi4",87);

insert into course
values
(1,"ds",3),
(22,"ds",4),
(3,"ds",5),
(44,"ds",6);
/* 
NOTE:
1)JOIN AND INNERJOIN  and  CROSS JOIN ALL ARE SAME BUT NOTE:if condition is specified in one OF THE JOIN it should be ther in all joins to be same
--ex;
select * from student join course;
select * from student cross join course;
select * from student inner join course;
u will get same output for all above 3 codes

select * from student join course on student.c_id=course.c_id;
select * from student cross join course on student.c_id=course.c_id;
select * from student inner join course on student.c_id=course.c_id;
similarly the output of these also will be same

but if u see the output of below two code it will different 
select * from student join course;
select * from student cross join course on student.c_id=course.c_id;

and
select * from student join course;
select * from student inner join course on student.c_id=course.c_id;

similarly in all other cases of with and without condition statements if u compare u wont get same output
*/
select * from student;
select * from course;
-- cross join 
select * from student join course; -- here each attributes of course will me merged with all attributes of student
-- inner join
select * from student join course on student.s_id=course.c_id; -- returns rows by combining attributes of both tables when the condition is satisfied
-- join
select * from student inner join course; 
select * from student cross join course;-- NOTE:both inner join and join and cross join are same 

-- self join(syntax is different from join,cross join,inner join)
select * from student,course where student.s_id=course.c_id;
select * from student,course on student.s_id=course.c_id; #cannot use on

-- full outer join
select  student.s_id from student full outer join course on student.s_id=course.c_id;
SELECT * FROM Customers FULL OUTER JOIN Orders ON Customers.CustomerID=Orders.CustomerID
ORDER BY Customers.CustomerName;

/* left outer join: returns the values of left table(means in code (student left join course ) here student is left 
so after joining rows of two tables,then based on condition for which rows condition is satisfied those values only 
be displayed in right table but in left tale all are displayed NOTE THIS JOIN  */

select * from student  left outer join course on student.s_id=course.c_id; #NOTE:left outer join and left join are same
/* right join(right outer join) value of left table are displayed only when condition is satisfied but all values of 
righ ttable are displayed*/
select * from student right outer join course on student.s_id=course.c_id;

# theta join(>=,<=,>,<)
select * from student join course on student.c_id<=course.c_id;
#equi join(=)
select * from student join course on student.c_id=course.c_id;
#natural join 
select * from student natural join course ; #it is like checks for same col in two tables then checks for same values in similar col of two tables if values are similar then that row of 2 tables are merged with no repeatition of columns