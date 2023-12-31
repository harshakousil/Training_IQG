REM -- USING SUBQUERIES
SELECT LAST_NAME, SALARY
FROM EMPLOYEES
WHERE SALARY >(SELECT SALARY 
                 FROM EMPLOYEES
                 WHERE LAST_NAME='Abel');

SELECT LAST_NAME, HIRE_DATE
FROM EMPLOYEES
WHERE HIRE_DATE >
                  (SELECT HIRE_DATE
                   FROM EMPLOYEES
                   WHERE LAST_NAME='Davies');

 

SELECT LAST_NAME, JOB_ID, SALARY
FROM EMPLOYEES
WHERE JOB_ID = 
               ( SELECT JOB_ID 
                 FROM EMPLOYEES
                 WHERE EMPLOYEE_ID=141 )
AND SALARY > 
             ( SELECT SALARY 
               FROM EMPLOYEES
               WHERE EMPLOYEE_ID=143);

 

REM -- GROUP FUNCTIONS IN SUB QUERIES
SELECT LAST_NAME, JOB_ID, SALARY
FROM EMPLOYEES
WHERE SALARY = ( SELECT MIN(SALARY)
                  FROM EMPLOYEES );

REM -- GROUP BY AND HAVING

SELECT DEPARTMENT_ID,MIN(SALARY)
FROM EMPLOYEES;
GROUP BY DEPARTMNET_ID
HAVING MIN(SALARY) >(SELECT MIN(SALARY) FROM EMPLOYEES 
WHERE DEPARTMENT_ID=100);

