REM -- DECLARING PL/SQL VARIABLES
DECLARE
 v_myName VARCHAR(30);
BEGIN
 DBMS_OUTPUT.PUT_LINE('MY NAME IS :'
 ||V_myName);
 v_myName := 'kousil';
    DBMS_OUTPUT.PUT_LINE('MY NAME IS :'
 ||V_myName);
END;
/


