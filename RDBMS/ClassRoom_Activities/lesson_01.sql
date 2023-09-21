SELECT
    *
FROM
    departments;

REM -- PROJECTION

SELECT
    department_id,
    department_name
FROM
    departments;

REM -- ARTHIMETIC EXPRESSION

SELECT
    last_name,
    salary,
    salary + 300
FROM
    employees;

SELECT
    last_name,
    salary,
    12 * ( salary + 100 )
FROM
    employees;

SELECT
    last_name,
    job_id,
    salary,
    commission_pct
FROM
    employees;

SELECT
    last_name       AS "Name",
    commission_pct  comm
FROM
    employees;

SELECT
    department_name
    || q'{,it,s assigned Manager Id :}'
    || manager_id AS "DEPARTMENTS AND MANAGERS"
FROM
    departments;

SELECT DISTINCT
    department_id
FROM
    departments;

SELECT
    last_name
    || ' HAVING SALARY '
    || salary AS employee_and_salary
FROM
    employees;
    
    
    
    
DESCRIBE EMPLOYEES;