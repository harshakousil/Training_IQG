rem --using sql statements within plsql block
declare
   v_fname varchar2(30);
begin
select first_name into v_fname
from employees
where employee_id=100;
dbms_output.put_line('First name is ' || v_fname);
end;
/

DECLARE
 v_emp_hiredate   employees.hire_date%TYPE;
 v_emp_salary     employees.salary%TYPE; 
BEGIN
  SELECT   hire_date, salary
  INTO     v_emp_hiredate, v_emp_salary
  FROM     employees
  WHERE    employee_id = 100;
  DBMS_OUTPUT.PUT_LINE ('Hire date is :'|| v_emp_hiredate);
  DBMS_OUTPUT.PUT_LINE ('Salary is :'|| v_emp_salary);
END;
/


rem -- group functions in pl/sql block

REM -- Group Functions in PLSQL Block
DECLARE    
   v_sum_sal   NUMBER(10,2); 
   v_deptno    NUMBER NOT NULL := 60;           
BEGIN
  SELECT    SUM(salary)  -- group function
  INTO v_sum_sal  FROM    employees
  WHERE     department_id = v_deptno;
  DBMS_OUTPUT.PUT_LINE ('The sum of salary is ' || v_sum_sal);
END;
/


SELECT first_name,salary
FROM employees
WHERE job_id = 'ST_CLERK';
DECLARE 
  v_sal_increase   employees.salary%TYPE := 800;  
BEGIN
  UPDATE  employees
  SET  salary = salary + v_sal_increase
  WHERE  job_id = 'ST_CLERK';
END;
/
SELECT first_name,salary
FROM employees
WHERE job_id = 'ST_CLERK';



DECLARE
  v_rows_deleted VARCHAR2(30);
  v_empno employees.employee_id%TYPE := 165;
BEGIN
  DELETE FROM  employees
  WHERE employee_id = v_empno;
  v_rows_deleted := (SQL%ROWCOUNT ||
                       ' row deleted.');
  DBMS_OUTPUT.PUT_LINE (v_rows_deleted);
 
END;