REM -- WORKING WITH COMPOSITE DATA TYPES

DECLARE
TYPE T_REC IS RECORD
    (V_SAL NUMBER (8),V_MINSAL NUMBER(8)DEFAULT 1000,
    V_HIRE_DATE EMPLOYEES.HIRE_DATE%TYPE,
    V_REC1 EMPLOYEES %ROWTYPE);
    V_MYREC T_REC; --- DECLARATION OF IDENTIFER WITH THE TYPE CRETAED
    
BEGIN
 V_MYREC.V_SAL :=V_MYREC.V_MINSAL +500;
 V_MYREC.V_HIRE_DATE :=SYSDATE;
 
SELECT * INTO V_MYREC.V_REC1
 FROM EMPLOYEES
 WHERE EMPLOYEE_ID=100;
 DBMS_OUTPUT.PUT_LINE(V_MYREC.V_REC1.LAST_NAME || ' '|| TO_CHAR(V_MYREC.V_HIRE_DATE)
        || ' ' || TO_CHAR(V_MYREC.V_SAL));    
END;
/

REM -- ASSOCIATIVE ARRAYS

DECLARE
 TYPE ENAME_TABLE_TYPE IS TABLE OF
 EMPLOYEES.LAST_NAME%TYPE
 INDEX BY PLS_INTEGER;
 TYPE HIREDATE_TABLE_TYPE IS TABLE OF DATE
 INDEX BY PLS_INTEGER;
 
 ENAME_TABLE ENAME_TABLE_TYPE;
 HIREDATE_TABLE HIREDATE_TABLE_TYPE;
 BEGIN
 ENAME_TABLE(1) := 'RAHUL';
 HIREDATE_TABLE(7) :=SYSDATE +7;
 DBMS_OUTPUT.PUT_LINE(ENAME_TABLE(1));
 DBMS_OUTPUT.PUT_LINE(HIREDATE_TABLE(7));
END;
/



DECLARE

TYPE dept_table_type

IS TABLE OF departments%ROWTYPE INDEX BY VARCHAR2(20);

dept_table dept_table_type;

REM-- Each element of dept_table is a record
BEGIN SELECT * INTO dept_table(1) FROM departments

WHERE department_id = 10;
DBMS_OUTPUT.PUT_LINE(dept_table(1).department_id ||' '||
dept_table(1).department_name ||' '||dept_table(1).manager_id);

END;
/

REM -- USING INBUILT ARRAY FUNCTIONS
DECLARE
   TYPE emp_table_type IS TABLE OF
      employees%ROWTYPE INDEX BY PLS_INTEGER;
   my_emp_table  emp_table_type;
   max_count         NUMBER(3):= 104; 
BEGIN
  FOR i IN 100..max_count
  LOOP
   SELECT * INTO my_emp_table(i) FROM employees
   WHERE employee_id = i;
  END LOOP;
  FOR i IN my_emp_table.FIRST..my_emp_table.LAST 
  LOOP
     DBMS_OUTPUT.PUT_LINE(my_emp_table(i).last_name);
  END LOOP;
END; 
/

