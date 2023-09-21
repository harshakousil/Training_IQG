REM --PART -1


REM -- 1st question
REM -- ANS  D

 

REM -- 2nd question
REM -- ANS  C

REM -- Question 3
REM -- ANS -> C. DELETE  D. MERGE E. UPDATE

REM -- question 4
REM -- ANS B

 

REM -- question 5
REM -- ANS A

 

REM -- Question 6
REM -- ANS  C

 

REM -- Question 7
REM -- ANS B

 

REM -- Question 8
REM -- ANS A

 

REM -- Question 9
REM -- ANS A, C and D

 

REM -- Question 10
REM -- ANS B & C





Rem--  Part -2

REM -- 1St QUESTION

DESC departments;


SELECT * FROM departments;

REM --2ND QUESTION


SELECT DISTINCT job_id
FROM employees;



REM --3RD QUESTION


SELECT employee_id || ' ,'|| first_name || ','||last_name || ',' ||email || ',' || phone_number || ',' ||job_id || ','||manager_id || ','||hire_date || ','||salary
|| ' ,'||commission_pct || ' ,' || department_id
FROM employees;


REM --4th question
SELECT last_name,salary
FROM employees
WHERE salary>12000;


REM --5th question

SELECT last_name,salary
FROM employees
WHERE salary NOT BETWEEN 5000 AND 12000;



REM --6th question
SELECT last_name,job_id,hire_date
FROM employees
WHERE last_name IN('Matos','Taylor')
ORDER BY hire_date;

REM --7th question

SELECT last_name "Employee" ,salary "Monthly Salary"
FROM employees
WHERE salary BETWEEN 5000 AND 12000
AND department_id IN (20,50);


REM --8th question


SELECT last_name,salary,commission_pct
FROM employees
WHERE commission_pct IS NOT NULL
ORDER BY salary DESC,commission_pct  DESC;


REM --9th question


SELECT employee_id,last_name,salary,department_id
FROM employees
WHERE manager_id= &given_id
ORDER BY &given_col;

REM  --10th question


SELECT employee_id,last_name,salary,
ROUND(salary*1.155,0) "New Salary"
FROM employees;



REM -- 11th question

SELECT SUBSTR(LAST_NAME,1,8) ||' '|| 
        RPAD(' ', SALARY/1000+1, '*')
EMPLOYEES_AND_THEIR_SALARIES
FROM EMPLOYEES
ORDER BY SALARY DESC;

REM --12th question
SELECT JOB_ID, 
    CASE JOB_ID
        WHEN 'ST_CLERK' THEN 'E'
        WHEN 'SA_REP' THEN 'D'
        WHEN 'IT_PROG' THEN 'C'
        WHEN 'ST_MAN' THEN 'B'
        WHEN 'AD_PRES' THEN 'A'
        ELSE '0' 
    END GRADE
FROM EMPLOYEES;

REM --13th question
SELECT LAST_NAME, JOB_ID, E.DEPARTMENT_ID, 
        DEPARTMENT_NAME
FROM EMPLOYEES E
JOIN DEPARTMENTS D
ON D.DEPARTMENT_ID = E.DEPARTMENT_ID
JOIN LOCATIONS L
ON D.LOCATION_ID = L.LOCATION_ID
AND L.CITY='Toranto';

REM --14th question
SELECT E.LAST_NAME "Employee", E.EMPLOYEE_ID "EMP#", 
        M.LAST_NAME "Manager", M.EMPLOYEE_ID "Mgr#"
FROM EMPLOYEES E JOIN EMPLOYEES M
ON (E.MANAGER_ID = M.EMPLOYEE_ID);

REM --15th question
SELECT LAST_NAME, HIRE_DATE
FROM EMPLOYEES
WHERE DEPARTMENT_ID IN 
                        (SELECT DEPARTMENT_ID
                         FROM EMPLOYEES
                         WHERE LAST_NAME = '&&ENTER_LAST_NAME')
AND LAST_NAME <> '&ENTER_LAST_NAME';

REM ---16th question
SET SERVEROUTPUT ON

DECLARE 
v_max_deptno NUMBER(8,2);
BEGIN
    SELECT MAX(DEPARTMENT_ID) INTO v_max_deptno
    FROM DEPARTMENTS;
    DBMS_OUTPUT.PUT_LINE('The maximum department_id is : '||v_max_deptno);
END;
/

REM --17th question
CREATE TABLE MESSAGES (RESULTS NUMBER);

BEGIN
    FOR i IN 1..10 LOOP
        IF i IN (6,8) THEN
        CONTINUE;
        END IF;
        INSERT INTO MESSAGES(RESULTS)
        VALUES (i);
    END LOOP;
    COMMIT;
END;
/ 

SELECT *
FROM MESSAGES;

REM -- 18th question 
DECLARE
    TYPE t_rec IS RECORD 
    (v_countryid COUNTRIES.COUNTRY_ID%TYPE,
    v_rec1 COUNTRIES%ROWTYPE);
    v_country_record t_rec;
    
BEGIN
    v_country_record.v_countryid := 'CA';
    SELECT * INTO v_country_record.v_rec1
    FROM COUNTRIES
    WHERE COUNTRY_ID = v_country_record.v_countryid;
    DBMS_OUTPUT.PUT_LINE('Country Id: ' || v_country_record.v_rec1.COUNTRY_ID 
                        || ' Country Name: ' || v_country_record.v_rec1.COUNTRY_NAME 
                        || ' Region: ' || v_country_record.v_rec1.REGION_ID);                       
END;
/

REM --- 19th questio
DECLARE
    v_deptno NUMBER := 50;
    CURSOR c_emp_cursor IS
    SELECT LAST_NAME, SALARY, MANAGER_ID
    FROM EMPLOYEES
    WHERE DEPARTMENT_ID = v_deptno;
    
BEGIN
    FOR emp_record IN c_emp_cursor
    LOOP
        IF emp_record.SALARY < 5000 AND emp_record.MANAGER_ID IN (101,124) THEN
        DBMS_OUTPUT.PUT_LINE(emp_record.LAST_NAME ||' Due for a raise');
        ELSE
        DBMS_OUTPUT.PUT_LINE(emp_record.LAST_NAME ||' Not Due for a raise');
        END IF;
    END LOOP;
END;
/

REM --- 2oth question 
DECLARE
    CURSOR c_dept_cursor IS
    SELECT DEPARTMENT_ID, DEPARTMENT_NAME
    FROM DEPARTMENTS
    WHERE DEPARTMENT_ID < 100
    ORDER BY DEPARTMENT_ID;
    
    CURSOR c_emp_cursor (deptno NUMBER) IS
    SELECT LAST_NAME, JOB_ID, HIRE_DATE, SALARY
    FROM EMPLOYEES
    WHERE DEPARTMENT_ID = deptno AND EMPLOYEE_ID < 120;
    
    v_deptId DEPARTMENTS.DEPARTMENT_ID%TYPE;
    v_deptName DEPARTMENTS.DEPARTMENT_NAME%TYPE;
    
    v_lname EMPLOYEES.LAST_NAME%TYPE;
    v_jobId EMPLOYEES.JOB_ID%TYPE;
    v_hireDate EMPLOYEES.HIRE_DATE%TYPE;
    v_sal EMPLOYEES.SALARY%TYPE;

BEGIN
    OPEN c_dept_cursor;
    LOOP
        FETCH c_dept_cursor INTO v_deptId, v_deptName;
        EXIT WHEN c_dept_cursor%NOTFOUND;
        DBMS_OUTPUT.PUT_LINE('Department Number : ' || v_deptId ||
                            ' Department Name : ' || v_deptName );
        
        IF c_emp_cursor%ISOPEN THEN 
            CLOSE c_emp_cursor;
        END IF;
        
        OPEN c_emp_cursor(v_deptId);
        LOOP
            FETCH c_emp_cursor INTO v_lname, v_jobId, v_hireDate, v_sal;
            EXIT WHEN c_emp_cursor%NOTFOUND;
            DBMS_OUTPUT.PUT_LINE(v_lname ||'  '|| v_jobId||'  '|| 
                                v_hireDate||'  ' || v_sal );
        END LOOP;
        DBMS_OUTPUT.PUT_LINE('----------------------------------------------------------------');
        CLOSE c_emp_cursor;
    END LOOP;
    CLOSE c_dept_cursor;
END;
/