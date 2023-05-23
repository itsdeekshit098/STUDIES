create database joins;
use joins;
create table student(
s_id int,
name varchar(30),
c_id int,
marks int);

create table course(
c_id int,
course_name varchar(30),
c_credits int);

insert into student
values
(1,"hansi1",1,59),
(2,"hansi2",2,67),
(3,"hansi3",3,77),
(4,"hansi4",4,87);

insert into course
values
(11,"ds",3),
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

-- cross join 
select * from student join course; -- here each attributes of course will me merged with all attributes of student
-- inner join
select * from student join course on student.c_id=course.c_id; -- returns rows by combining attributes of both tables when the condition is satisfied
-- join
select * from student inner join course; -- NOTE:both inner join and join are same 

/* left outer join: 
			1)firstly merges the rows of 2 table like
						1st row of 1st table +(with) 1st row of 2nd table
			 similarly  2nd row of 1st table +(with) 2nd row of 2nd table
				         ........and so on till last count of row number not like 1st row of 1st table with 
                         all rows of 2nd table as in join,crossjoin,innerjoin
			2)in that merging if there is col with same name in the two rows they are displayed individually
            3)after merging as it left outer join the column values of all rows of left table are displayed but in 
			w.r.t right table column values for the rows where condition is satisfied the column values of the respected row 
            are displayed
*/

select * from student  left outer join course on student.c_id=course.c_id;
/* right outer join: 
			1)firstly merges the rows of 2 table like
						1st row of 1st table +(with) 1st row of 2nd table
			 similarly  2nd row of 1st table +(with) 2nd row of 2nd table
				         ........and so on till last count of row number not like 1st row of 1st table with 
                         all rows of 2nd table as in join,crossjoin,innerjoin
			2)in that merging if there is col with same name in the two rows they are displayed individually
            3)after merging as it right outer join the column values of all rows of right table are displayed but in 
			w.r.t left table column values for the rows where condition is satisfied the column values of the respected row 
            are displayed
*/
select * from student right join course on student.c_id=course.c_id;

# theta join(>=,<=,>,<)
select * from student join course on student.c_id<=course.c_id;
#equi join(=)
select * from student join course on student.c_id=course.c_id;
#natural join 
select * from student natural join course ; #it is like checks for same col in two tables then checks for same values in similar col of two tables if values are similar then that row of 2 tables are merged with no repeatition of columns