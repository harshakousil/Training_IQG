REM -- EXPLICIT CURSORS

declare
    cursor c_emp_cursor is
    select employee_id,last_name
    from employees
    where department_id=30;
    v_empNo employees.employee_id%type;
    v_lname employees.last_name%type;
begin
open c_emp_cursor;
fetch c_emp_cursor into v_empNo,v_lname;
dbms_output.put_line(v_empNo || ' ' ||v_lname);
end;
/


REM  -- LOOPS FOR USING EXPLICIT CUROSR

declare
    cursor c_emp_cursor is
    select employee_id,last_name
    from employees
    where department_id=30;
    v_empNo employees.employee_id%type;
    v_lname employees.last_name%type;
begin
open c_emp_cursor;
LOOP
fetch c_emp_cursor into v_empNo,v_lname;
EXIT WHEN c_emp_cursor%NOTFOUND;
dbms_output.put_line(v_empNo || ' ' ||v_lname);
END LOOP;
CLOSE c_emp_cursor;
end;
/


REM --curosrs with records

declare
    cursor c_emp_cursor is
    select employee_id,last_name
    from employees
    where department_id=30;
    v_emp_record c_emp_cursor%ROWTYPE;
begin
open c_emp_cursor;
loop
fetch c_emp_cursor into v_emp_record;
exit when c_emp_cursor%notfound;
dbms_output.put_line(v_emp_record.employee_id || ' ' ||v_emp_record.last_name);
end loop;
end;
/

rem --explicit cursors with for loops

declare
    cursor c_emp_cursor is
    select employee_id,last_name
    from employees
    where department_id=30;
    v_empNo employees.employee_id%type;
    v_lname employees.last_name%type;
begin
for emp_record in c_emp_cursor
LOOP
dbms_output.put_line(emp_record.employee_id || ' ' ||emp_record.last_name);
END LOOP;
end;
/


