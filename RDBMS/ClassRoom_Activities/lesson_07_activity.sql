REM -- 1ST QUESTION


SELECT LAST_NAME,HIRE_DATE
FROM EMPOLYEES
WHERE DEPARTMENT_ID=
(SELECT DEPARTMENT_ID FROM EMPLOYEES
WHERE LAST_NAME LIKE '&NAME')AND
LAST_NAME != '&NAME';


REM --2ND QUESTION

SELECT EMPLOYEE_ID,LAST_NAME,SALARY
FROM EMPLOYEES
WHERE SALARY >(SELECT AVG(SALARY) FROM
EMPLOYEES)
ORDER BY SALARY;

REM --3RD QUESTION

SELECT EMPLOYEE_ID,LAST_NAME
FROM EMPLOYEES
WHERE DEPARTMENT_ID IN(SELECT
DEPARTMENT_ID FROM EMPLOYEES
WHERE LAST_NAME LIKE '%u%');

REM --4TH QUESTION
SELECT LAST_NAME,DEPARTMENT_ID,JOB_ID
FROM EMPLOYEES
WHERE DEPARTMENT_ID IN
(SELECT DEPARTMENT_ID FROM DEPARTMENTS
WHERE LOCATION_ID =1700);

REM --5TH QUESTION

SELECT  LAST_NAME,SALARY
FROM EMPLOYEES
WHERE MANAGER_ID IN
(SELECT EMPLOYEE_ID FROM EMPLOYEES
WHERE LAST_NAME ='King');

REM --6TH QUESTION

SELECT DEPARTMENT_ID,LAST_NAME,JOB_ID
FROM EMPLOYEES
WHERE DEPARTMENT_ID IN
(SELECT DEPARTMENT_ID FROM DEPARTMENTS WHERE 
DEPARTMENT_NAME ='Executive');

REM --7TH QUESTION

SELECT EMPLOYEE_ID,LAST_NAME,SALARY
FROM EMPLOYEES
WHERE SALARY >(SELECT 
AVG(SALARY)
FROM EMPLOYEES)
AND DEPARTMENT_ID IN (SELECT DEPARTMENT_ID FROM
EMPLOYEES WHERE LAST_NAME LIKE '%u%');
