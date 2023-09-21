REM -- Lab activity on SQL commands

REM -- 1st question : TRUE

REM -- 2nd question :TRUE

REM -- 3rd question : 

REM -- Given question:
REM -- SELECT employee_id, last_name
REM --sal x 12 ANNUAL SALARY
REM--FROM employees;

REM -- solved answer
REM -- , is missed after last_name
REM -- alias name is inproperly given instead of salary colounm
REM -- Multplication symbol is wrongly given
REM -- annaul salary spelling given wrongly

SELECT employee_id, last_name,
salary *12 ANNUAL_SALARY
FROM employees;



REM -- 6th question

DESC DEPARTMENTS;

SELECT * FROM DEPARTMENTS;


REM -- 7Th question 

SELECT  EMPLOYEE_ID,LAST_NAME,JOB_ID,HIRE_DATE AS "STARTDATE"
FROM EMPLOYEES;

REM --9TH question

SELECT DISTINCT JOB_ID
FROM  EMPLOYEES;


REM-- 10TH QUESTION
SELECT  EMPLOYEE_ID AS "Emp #",LAST_NAME AS "Employee" ,JOB_ID as "Job",HIRE_DATE as "Hire Date"
FROM EMPLOYEES;


REM -- 11TH question

SELECT FIRST_NAME||', '||JOB_ID AS "Employee And Title"
FROM EMPLOYEES;

REM --12TH question
SELECT EMPLOYEE_ID||','||FIRST_NAME||','||LAST_NAME||','||JOB_ID ||','||PHONE_NUMBER||','||HIRE_DATE AS "THE_OUTPUT"
FROM EMPLOYEES
