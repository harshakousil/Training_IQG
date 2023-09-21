REM -- SET OPERATIONS

REM -- UNION OPERATION

SELECT EMPLOYEE_ID,JOB_ID
FROM EMPLOYEES
UNION
SELECT EMPLOYEE_ID,JOB_ID
FROM JOB_HISTORY;

REM -- UNION ALL OPERATION

SELECT EMPLOYEE_ID,JOB_ID
FROM EMPLOYEES
UNION ALL
SELECT EMPLOYEE_ID,JOB_ID
FROM JOB_HISTORY;

REM -- INTERSECT OPERATOR

SELECT EMPLOYEE_ID,JOB_ID
FROM EMPLOYEES
INTERSECT
SELECT EMPLOYEE_ID,JOB_ID
FROM JOB_HISTORY;
 
REM -- MINUS OPERATOR

SELECT EMPLOYEE_ID,JOB_ID
FROM EMPLOYEES
MINUS
SELECT EMPLOYEE_ID,JOB_ID
FROM JOB_HISTORY;


SELECT DEPARTMENT_ID,TO_NUMBER(NULL) AS "LOACTION",HIRE_DATE
FROM EMPLOYEES
UNION
SELECT 
DEPARTMENT_ID,LOCATION_ID, TO_DATE(NULL)
FROM DEPARTMENTS;




