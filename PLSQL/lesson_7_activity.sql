REM --LESSON-07 PRATICE ACTIVITY


REM --1ST QUESTION

REM--1.A AND B

SET SERVEROUTPUT ON
DECLARE
TYPE Countries_1 IS RECORD (
CountyID COUNTRIES.COUNTRY_ID%type,
CountyName COUNTRIES.COUNTRY_NAME%type,
RId COUNTRIES.REGION_ID%type);

Countries_1_rec Countries_1;

BEGIN
SELECT COUNTRY_ID INTO Countries_1_rec.CountyID FROM COUNTRIES WHERE COUNTRY_NAME='Canada';
DBMS_OUTPUT.PUT_LINE('Id of Country: '||Countries_1_rec.CountyID);
END;

REM 1.C


SET SERVEROUTPUT ON
DECLARE
TYPE Countries_1 IS RECORD (
CountyID COUNTRIES.COUNTRY_ID%type := 'CA',
CountyName COUNTRIES.COUNTRY_NAME%type,
RId COUNTRIES.REGION_ID%type);

Countries_1_rec Countries_1;

BEGIN
SELECT COUNTRY_ID INTO Countries_1_rec.CountyID FROM COUNTRIES WHERE COUNTRY_NAME='Canada';
DBMS_OUTPUT.PUT_LINE('Id of Country: '||Countries_1_rec.CountyID);
END;
/
REM --1.D AND 1.E
SET SERVEROUTPUT ON
DEFINE myvar Varchar(20):=('&NAME');
DECLARE
DemoCountryID countries.country_id%type;
DemoCountryName countries.country_name%type;
DemoRegionId countries.region_id%type;
BEGIN
select country_id,country_name,region_id INTO DemoCountryID,DemoCountryName,DemoRegionId FROM countries where country_name=myvar;
DBMS_OUTPUT.PUT_LINE('country Id :'||DemoCountryID||' '||'country Name :'|| DemoCountryName||' '||'Region' || DemoRegionId);
END;
/


REM --2.A
SET SERVEROUTPUT ON
DECLARE
TYPE DEPTID IS TABLE OF NUMBER(4)
INDEX BY PLS_INTEGER;
TYPE MY_DEPT_TABLE IS TABLE OF VARCHAR2(30)
INDEX BY PLS_INTEGER;
EMPID DEPTID;
DEPTNAME MY_DEPT_TABLE;
TEMPNAME MY_DEPT_TABLE;
BEGIN
SELECT DEPARTMENT_ID,DEPARTMENT_NAME INTO EMPID,DEPTNAME
FROM DEPARTMENTS;
END;
/


REM --2.B AND 2.C

DECLARE
TYPE dept_table_typE
IS TABLE OF departments%ROWTYPE
INDEX BY PLS_INTEGER;
my_dept_table dept_table_type;
f_loop_count number :=10;
v_deptno number := 0;
BEGIN
FOR i IN 1..f_loop_count LOOP
v_deptno:= v_deptno + f_loop_count;
SELECT * INTO my_dept_table(i) FROM departments
WHERE department_id = v_deptno;
END LOOP;
FOR i IN 1..f_loop_count 
LOOP
DBMS_OUTPUT.PUT_LINE(my_dept_table(i).department_id ||' '||my_dept_table(i).department_name);
END LOOP;
END;
/

REM --2.D
DECLARE
TYPE dept_table_type IS TABLE OF departments%ROWTYPE
INDEX BY PLS_INTEGER;
my_dept_table dept_table_type;
f_loop_count number :=10;
v_deptno number := 0;
BEGIN
FOR i IN 1..f_loop_count LOOP
v_deptno:= v_deptno + f_loop_count;
SELECT * INTO my_dept_table(i) FROM departments
WHERE department_id = v_deptno;
END LOOP;
FOR i IN 1..f_loop_count 
LOOP
DBMS_OUTPUT.PUT_LINE(my_dept_table(i).department_name);
END LOOP;
END;
/


REM --3TH QUESTION


DECLARE
TYPE dept_table_type IS TABLE OF departments%ROWTYPE
INDEX BY PLS_INTEGER;
my_dept_table dept_table_type;
f_loop_count number :=10;
v_deptno number := 0;
BEGIN
FOR i IN 1..f_loop_count LOOP
v_deptno:= v_deptno + f_loop_count;
SELECT * INTO my_dept_table(i) FROM departments
    WHERE department_id = v_deptno;
END LOOP;
FOR i IN 1..f_loop_count 
LOOP
DBMS_OUTPUT.PUT_LINE('Department Number: '||my_dept_table(i).department_id || ' '||'Department Name: '||my_dept_table(i).department_name || ' '||'Manager Id: '||my_dept_table(i).MANAGER_ID || ' '||'Location Id: '||my_dept_table(i).location_id);
END LOOP;
END;
/