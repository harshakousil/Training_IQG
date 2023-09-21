REM -INTRODUTION TO PL/SQL
DECLARE
 V_FNAME VARCHAR(30);
BEGIN

SELECT FIRST_NAME INTO V_FNAME FROM
EMPLOYEES
WHERE EMPLOYEE_ID =100;
END;
/
REM -- / IS THE SEPARAOR B/W 2 ANONYMOUS BLOCKS
SET SERVEROUTPUT ON;
DECLARE
 V_FNAME VARCHAR(30);
BEGIN

SELECT FIRST_NAME INTO V_FNAME FROM
EMPLOYEES
WHERE EMPLOYEE_ID =100;
DBMS_OUTPUT.PUT_LINE('THE FIRST NAME OF THR EMPLOYEE IS' ||V_FNAME);
END;
/

rem --delimiters

declare
 v_event varchar2 (30);
 
begin
 v_event := q'!Father's Day!';
 dbms_output.put_line('3rd sunday in june is ' || v_event);
 v_event := q'[mothers's day]';
 dbms_output.put_line('2nd sunday in May is ' ||v_event);
end;
/

rem -- bind variables

variable 
b_result NUMBER
begin
select(salary *12) + nvl(commission_pct,0) into
:b_result
from employees
where employee_id=144;
end;
/

print b_result;