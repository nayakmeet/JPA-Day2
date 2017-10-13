##Please run the below DDL query before you execute this application.  

CREATE TABLE studen
(studentid NUMBER(6) PRIMARY KEY,
name VARCHAR2(25));


CREATE TABLE customer_tab
(id NUMBER(6) PRIMARY KEY,
cust_name VARCHAR2(50),
cust_mob NUMBER(11),
cust_email VARCHAR2(50);
cust_dob DATE);