REM -- PERFORMING DML COMMANDS [INSERT,DELETE,UPDATE,TRUNCATE]



INSERT INTO DEPARTMENTS(DEPARTMENT_ID,DEPARTMENT_NAME,MANAGER_ID,LOCATION_ID)
VALUES(71,'PUBLIC RELATIONS',100,1700);


REM -- OMITING COLUMNS FROM THE LIST

INSERT INTO DEPARTMENTS(DEPARTMENT_ID,DEPARTMENT_NAME)
VALUES (290, 'NEW ADMINISTASTION');


INSERT INTO DEPARTMENTS
VALUES(300,'PURCHASING',NULL,NULL);


REM -- COLLECTING DATA FROM THE END-USER

INSERT INTO DEPARTMENTS(DEPARTMENT_ID,DEPARTMENT_NAME,
LOCATION_ID,MANAGER_ID)
VALUES(&DEPT_ID, '&DEPTNAME',&LOCID, &MGRID);


REM --USING SUBQUERIES TO INSERT THE DATA
INSERT INTO SALES_REPS(ID,NAME,SALARY,COMMISSION_PCT)
SELECT EMPLOYEE_ID,FIRST_NAME,SALARY,COMMISSION_PCT
FROM EMPLOYEES
WHERE JOB_ID LIKE '%REP_%';
REM -- ABOVE QUERY WON'T WORK BECAUSE THE SALES_REP IS NOT PRESENT


REM -- UPDATE COMMAND

UPDATE EMPLOYEES
SET DEPARTMENT_ID =70
WHERE EMPLOYEE_ID =113;


REM --USING SUB QUERY TO UPDATE


UPDATE EMPLOYEES
SET JOB_ID=( SELECT JOB_ID
FROM EMPLOYEES
WHERE EMPLOYEE_ID=205),
SALARY =( SELECT SALARY
FROM EMPLOYEES
WHERE EMPLOYEE_ID =205)
WHERE EMPLOYEE_ID=114;


REM -- DELETE COMMAND

DELETE FROM DEPARTMENTS
WHERE DEPARTMENT_ID=7;

ROLLBACK;