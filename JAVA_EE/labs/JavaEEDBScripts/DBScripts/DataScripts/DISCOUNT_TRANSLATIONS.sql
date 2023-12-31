-- $Id: DISCOUNT_TRANSLATIONS.sql 2288 2007-09-06 23:51:50Z drmills $
REM DISCOUNT_TRANSLATIONS_ID
REM DISCOUNT_ID
REM DESCRIPTION
REM LANGUAGE
REM SOURCE_LANGUAGE
REM CREATED_BY
REM CREATION_DATE
REM LAST_UPDATED_BY
REM LAST_UPDATE_DATE
REM OBJECT_VERSION_ID

insert into DISCOUNT_TRANSLATIONS VALUES(
    1,
    1,
    '$10 Dollars off any item.',
    'US',
    'US',
    0,
    SYSDATE,
    0,
    SYSDATE,
    0
);


insert into DISCOUNT_TRANSLATIONS VALUES(
    2,
    2,
    '$10 Dollars off any item, plus free shipping.',
    'US',
    'US',
    0,
    SYSDATE,
    0,
    SYSDATE,
    0
);

insert into DISCOUNT_TRANSLATIONS VALUES(
    3,
    3,
    'Value shipping for members.',
    'US',
    'US',
    0,
    SYSDATE,
    0,
    SYSDATE,
    0
);


insert into DISCOUNT_TRANSLATIONS VALUES(
    4,
    4,
    'Silver membership discount.',
    'US',
    'US',
    0,
    SYSDATE,
    0,
    SYSDATE,
    0
);

insert into DISCOUNT_TRANSLATIONS VALUES(
    5,
    5,
    'Gold membership discount.',
    'US',
    'US',
    0,
    SYSDATE,
    0,
    SYSDATE,
    0
);

insert into DISCOUNT_TRANSLATIONS VALUES(
    6,
    6,
    'Basic corporate discount.',
    'US',
    'US',
    0,
    SYSDATE,
    0,
    SYSDATE,
    0
);

insert into DISCOUNT_TRANSLATIONS VALUES(
    7,
    7,
    'Basic partner discount.',
    'US',
    'US',
    0,
    SYSDATE,
    0,
    SYSDATE,
    0
);

-- Clone for alternative languages
insert into DISCOUNT_TRANSLATIONS select null,discount_id, description, 'F', 'US', 0, SYSDATE, 0, SYSDATE, 0 from DISCOUNT_TRANSLATIONS where LANGUAGE = 'US';
insert into DISCOUNT_TRANSLATIONS select null,discount_id, description, 'D', 'US', 0, SYSDATE, 0, SYSDATE, 0 from DISCOUNT_TRANSLATIONS where LANGUAGE = 'US';
insert into DISCOUNT_TRANSLATIONS select null,discount_id, description, 'EL', 'US', 0, SYSDATE, 0, SYSDATE, 0 from DISCOUNT_TRANSLATIONS where LANGUAGE = 'US';
insert into DISCOUNT_TRANSLATIONS select null,discount_id, description, 'JP', 'US', 0, SYSDATE, 0, SYSDATE, 0 from DISCOUNT_TRANSLATIONS where LANGUAGE = 'US';
