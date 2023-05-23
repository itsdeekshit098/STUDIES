create database hansi999;
use hansi999;
create table jig
(
name varchar(30));

				#RENAMING THE TABLE
alter table jig rename to hansi;
insert into jig
values("hansi");     #this doesnt works bcz we have cchanged the name of the table to hansi

insert into hansi	#THIS WORKS
values("hansi");
				#RENAMING COLUMNS
alter table hansi rename column name to custname;   #changes col name to custname

select name from hansi; #shows error bcz the column_name is changed from name to custname so now letus try with custname

select custname from hansi; #we got output