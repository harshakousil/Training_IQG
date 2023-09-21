REM -- TO_CHAR FUNCTION [ FROM DATE TO CHAR DATA]

SELECT EMPLOYEE_ID,TO_CHAR(HIRE_DATE,'MM/YY') MONTH_HIRED
FROM EMPLOYEES
WHERE FIRST_NAME ='Steven';


SELECT LAST_NAME,TO_CHAR(HIRE_DATE,'FMDD Month YYYY') AS HIREDATE
FROM  EMPLOYEES;

REM -- TO_CHAR FUNCTION [FROM NUMBER TO CHAR DATA]

SELECT TO_CHAR(SALARY, '$99,999.00') AS MONTHLY_SALARY
FROM EMPLOYEES
WHERE LAST_NAME='King';

REM -- TO_DATE FUNCTION (FROM CHAR TO DATE DATA)
SELECT LAST_NAME, TO_CHAR(HIRE_DATE, 'DD-MON-YYYY')AS "Date"
FROM EMPLOYEES
WHERE HIRE_DATE<TO_DATE('01-01-2005', 'DD,MM,YYYY');


REM -- GENERAL FUNCTIONS 

REM --USING NVL FUNCTION

SELECT LAST_NAME,SALARY, NVL(COMMISSION_PCT,0),(SALARY*12)+(SALARY *12 * NVL(COMMISSION_PCT,0)) AS ANNUAL_SAL
FROM EMPLOYEES
ORDER BY SALARY;

REM--UISNG NVL2 FUCNTION

SELECT LAST_NAME,SALARY,COMMISSION_PCT,NVL2(COMMISSION_PCT,'SAL+COMM','SAL') INCOME
FROM EMPLOYEES
WHERE DEPARTMENT_ID IN (50,80);

REM -- USING NULLIF FUNCTION

SELECT FIRST_NAME, LENGTH(FIRST_NAME) "EXPR1",
        LAST_NAME, LENGTH(LAST_NAME) "EXPR2",
 NULLIF(LENGTH(fIRST_NAME),LENGTH(LAST_NAME)) RESULT
 FROM EMPLOYEES;
 
REM  -- COLLESCE [FUNCTION RETURNS THE FIRST NON NULL EXPRESSION]
 
SELECT LAST_NAME,SALARY,COMMISSION_PCT,COALESCE((SALARY+(COMMISSION_PCT*SALARY)),SALARY+2000) "NEW SALARY"
FROM EMPLOYEES;

REM --CONDITION EXPRESSIONS

SELECT LAST_NAME,JOB_ID, SALARY,
CASE JOB_ID WHEN 'IT_PROG' THEN 1.10*SALARY
            WHEN 'ST_CLERK' THEN 1.15*SALARY
            WHEN 'SA_REP'THEN 1.20*SALARY
            ELSE SALARY
END AS "REVISED SALARY"
FROM EMPLOYEES;


