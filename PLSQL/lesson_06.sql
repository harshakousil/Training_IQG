REM -- WRITING CONTROL STATEMENTS
SET SERVEROUTPUT ON
DECLARE
 v_myAge NUMBER :=31;
 
BEGIN
    IF v_myAge <11 THEN
        DBMS_OUTPUT.PUT_LINE('I AM A KID');
        END IF;
END;
/
REM --IF THERN ELSE CONDITION

DECLARE
 v_myAge NUMBER :=31;
 
BEGIN
    IF v_myAge <11 THEN
        DBMS_OUTPUT.PUT_LINE('I AM A KID');
       
    ELSE
    DBMS_OUTPUT.PUT_LINE('I AM  NOT A KID');
    END IF;
END;
/

REM -- IF ELSE IF


DECLARE
 v_myAge NUMBER :=31;
 
BEGIN
    IF v_myAge <11 THEN
        DBMS_OUTPUT.PUT_LINE('I AM A KID');    
    ELSIF v_myAge <20 THEN
    DBMS_OUTPUT.PUT_LINE('I am Young');
    ELSIF v_myAge <30 THEN
    DBMS_OUTPUT.PUT_LINE('I am in My Twenties');
    ELSIF v_myAge <40 THEN
    DBMS_OUTPUT.PUT_LINE('I am in My thirties');
    ELSE
        DBMS_OUTPUT.PUT_LINE('I am ALWAYS YOUNG');
    END IF;
END;
/

REM -- CASE EXPRESSIONS

DECLARE

v_grade  CHAR(1) :=UPPER('&GRADE');
v_appraisal VARCHAR(20);

BEGIN
 v_appraisal := CASE v_grade
     WHEN 'A' THEN 'EXCELLENT'
     WHEN 'B' THEN 'VERY GOOD'
     WHEN 'C' THEN 'GOOD'
     ELSE 'NO SUCH GRADE'
     END;
     DBMS_OUTPUT.PUT_LINE('Grade : ' || v_grade || ' Appraisal ' || v_appraisal);
END;
/


REM -- SEARCHED CASE


DECLARE

v_grade  CHAR(1) :=UPPER('&GRADE');
v_appraisal VARCHAR(20);

BEGIN
 v_appraisal := CASE
     WHEN v_grade = 'A' THEN 'EXCELLENT'
     WHEN v_grade IN ('B','C') THEN 'GOOD'
     ELSE 'NO SUCH GRADE'
     END;
     DBMS_OUTPUT.PUT_LINE('Grade : ' || v_grade || ' Appraisal ' || v_appraisal);
END;
/



REM  -- BASIC LOOPS

DECLARE
 v_countryId  LOCATIONS.COUNTRY_ID%TYPE :='CA';
 v_loc_id  LOCATIONS.LOCATION_ID%TYPE;
 v_counter NUMBER(2) :=1;
 v_new_city LOCATIONS.CITY%TYPE := 'Montreal';
BEGIN
 SELECT MAX(LOCATION_ID) INTO v_loc_id
 FROM LOCATIONS
 WHERE COUNTRY_ID =v_countryId;
 LOOP 
  INSERT INTO LOCATIONS(LOCATION_ID,CITY,COUNTRY_ID)
  VALUES ((v_loc_id +v_counter),v_new_city,v_countryId);
  v_counter :=v_counter +1;
  EXIT WHEN v_counter >3;
  END LOOP;
END;
/

REM -- WHLE LOOP



DECLARE
 v_countryId  LOCATIONS.COUNTRY_ID%TYPE :='CA';
 v_loc_id  LOCATIONS.LOCATION_ID%TYPE;
 v_counter NUMBER(2) :=1;
 v_new_city LOCATIONS.CITY%TYPE := 'Montreal';
BEGIN
 SELECT MAX(LOCATION_ID) INTO v_loc_id
 FROM LOCATIONS
 WHERE COUNTRY_ID =v_countryId;
 WHILE v_counter <=3
 LOOP
  INSERT INTO LOCATIONS(LOCATION_ID,CITY,COUNTRY_ID)
  VALUES ((v_loc_id +v_counter),v_new_city,v_countryId);
  v_counter :=v_counter +1;
  END LOOP;
END;
/

REM -- FOR LOOPS




DECLARE
 v_countryId  LOCATIONS.COUNTRY_ID%TYPE :='CA';
 v_loc_id  LOCATIONS.LOCATION_ID%TYPE;
 v_counter NUMBER(2) :=1;
 v_new_city LOCATIONS.CITY%TYPE := 'Montreal';
BEGIN
 SELECT MAX(LOCATION_ID) INTO v_loc_id
 FROM LOCATIONS
 WHERE COUNTRY_ID =v_countryId;
  FOR I IN 1..3 LOOP
  INSERT INTO LOCATIONS(LOCATION_ID,CITY,COUNTRY_ID)
  VALUES ((v_loc_id +I),v_new_city,v_countryId);
  END LOOP;
END;
/
