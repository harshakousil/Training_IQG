REM -- 1ST QUESTION

SELECT LAST_NAME,SALARY 
FROM EMPLOYEES
WHERE SALARY>12000;

REM -- 2ND QUESTION

SELECT LAST_NAME,DEPARTMENT_ID
FROM EMPLOYEES
WHERE EMPLOYEE_ID =176;


REM -- 3RD QUESTION

SELECT LAST_NAME, SALARY 
FROM EMPLOYEES
WHERE SALARY NOT BETWEEN 5000 AND 12000;



REM -- 4TH QUESTION

SELECT LAST_NAME,JOB_ID,HIRE_DATE
FROM EMPLOYEES
where LAST_NAME in ('Matos','Taylor')
ORDER BY HIRE_DATE ;



REM --5TH QUESTION

SELECT LAST_NAME,DEPARTMENT_ID
FROM EMPLOYEES
WHERE DEPARTMENT_ID BETWEEN 20 AND 50
ORDER BY LAST_NAME ;


REM -- 6TH QUESTION

SELECT LAST_NAME AS "Employee",SALARY AS "Monthly Salary"
FROM EMPLOYEES
WHERE SALARY BETWEEN 5000 AND 12000 AND 
DEPARTMENT_ID =20 OR DEPARTMENT_ID=50 ;


REM -- 7TH QUESTION

SELECT LAST_NAME,HIRE_DATE
FROM EMPLOYEES
WHERE HIRE_DATE BETWEEN '01-JAN-94' AND '31-DEC-94';


REM --8TH QUESTION

SELECT LAST_NAME,JOB_ID
FROM EMPLOYEES
WHERE MANAGER_ID IS NULL;



REM --9TH QUESTION

SELECT LAST_NAME,SALARY,COMMISSION_PCT
FROM EMPLOYEES
WHERE COMMISSION_PCT IS NOT NULL
ORDER BY COMMISSION_PCT DESC,SALARY DESC;


REM --1OTH QUESTION

SELECT LAST_NAME,SALARY
FROM EMPLOYEES
WHERE SALARY >&GIVEN_SALARY;


REM --11TH QUESTION

SELECT &MAN_ID EMPLOYEE_ID,LAST_NAME,SALARY,DEPARTMENT_ID
FROM EMPLOYEES
WHERE MANAGER_ID=&MAN_ID
ORDER BY  &COL_NAME;


REM --12TH QUESTION

SELECT LAST_NAME
FROM EMPLOYEES
WHERE LAST_NAME LIKE '___a%';

REM --13TH QUESTION
SELECT LAST_NAME
FROM EMPLOYEES
WHERE LAST_NAME LIKE 'a%' OR LAST_NAME LIKE 'e%';


REM --14TH QUESTION

SELECT LAST_NAME, JOB_ID, SALARY
FROM employees
WHERE JOB_ID in ('SA_REP','ST_CLERK') and SALARY not in (2500,3500,7000);


REM --15TH QUESTION

SELECT LAST_NAME  AS Employee, SALARY  AS "Monthly Salary", COMMISSION_PCT
FROM EMPLOYEES
WHERE COMMISSION_PCT = 0.2;