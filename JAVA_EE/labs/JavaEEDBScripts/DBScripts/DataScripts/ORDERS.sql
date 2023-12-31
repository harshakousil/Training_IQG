REM Define the orders on the system
REM $Id: ORDERS.sql 2265 2007-08-30 18:22:31Z lmunsing $
    
insert into ORDERS values (1001, sysdate-14, sysdate-11, 'COMPLETE', 50.97, 108, null,              3, null,       1, 1002, null,  1, 'N', 'N', null,       'N', null, 0, SYSDATE,0,SYSDATE,0);
insert into ORDERS values (1002, sysdate-4,  null,       'PICK',     1249.91, 108, null,              97, null,       3, 1001, null,  null, 'Y', 'Y', 103,        'N', null, 0, SYSDATE,0,SYSDATE,0);
insert into ORDERS values (1003, sysdate-15, null,       'STOCK',    5000, 120, 'My friend Craig', 69, 3033471691, 2, 1015, 6,    null, 'N', 'N', null,      'Y', 'Congratulations!', 0, SYSDATE,0,SYSDATE,0);
insert into ORDERS values (1004, sysdate-25, null,       'CANCEL',   879.98, 115, null,              16, null,      1, 1010, 6,     null, 'N', 'N', null,      'N', null, 0, SYSDATE,0,SYSDATE,0);
insert into ORDERS values (1005, sysdate-50, sysdate-45, 'COMPLETE', 2225.98, 118, null,              19, null,      1, 1013, 3,     null, 'Y', 'Y', 101,      'N', null, 0, SYSDATE,0,SYSDATE,0);
insert into ORDERS values (1006, sysdate-10, null,       'STOCK',    551.86, 112, null,              11, null,      2, 1007, 6,     null, 'N', 'N', null,      'N', null, 0, SYSDATE,0,SYSDATE,0);
insert into ORDERS values (1007, sysdate-40, sysdate-35, 'COMPLETE', 3295.94, 119, 'The Weiss Family',20, 6501241214, 3, 1014, 6,    null, 'N', 'N', null,      'Y', 'Happy Holidays!', 0, SYSDATE,0,SYSDATE,0);
insert into ORDERS values (1008, sysdate-1,  null,       'PENDING',  100.97, 113, null,              13, null,      3, 1008, 7,     null, 'N', 'N', null,      'N', null, 0, SYSDATE,0,SYSDATE,0);
insert into ORDERS values (1009, sysdate-3,  null,       'PICK',     12.99, 109, null,              4, null,       1, 1004, null,  2, 'N', 'N', null,      'N', null, 0, SYSDATE,0,SYSDATE,0);
insert into ORDERS values (1010, sysdate-3,  null,       'PENDING',  1259.98, 120, null,              21, null,      2, 1015, 6,     null, 'N', 'N', null,      'N', null, 0, SYSDATE,0,SYSDATE,0);
insert into ORDERS values (1011, sysdate-6,  null,       'SHIP',     99.99, 110, null,              9, null,       2, 1005, 5,     null, 'N', 'N', null,      'N', null, 0, SYSDATE,0,SYSDATE,0);
insert into ORDERS values (1012, sysdate-2,  null,       'PICK',     1299.96, 115, 'Mom',             16, 6082913792, 2, 1010, 6,    null, 'N', 'N', null,      'Y', 'Happy Birthday!', 0, SYSDATE,0,SYSDATE,0);
insert into ORDERS values (1013, sysdate-2,  null,       'CART',     89.99, 114, null,              14, null,      2, 1009, 4,     null, 'Y', 'Y', 105,        'N', null, 0, SYSDATE,0,SYSDATE,0);
insert into ORDERS values (1014, sysdate-20, sysdate-15, 'COMPLETE', 1499.50, 116, null,              17, null,      1, 1011, 1,     null, 'N', 'N', null,      'N', null, 0, SYSDATE,0,SYSDATE,0);
insert into ORDERS values (1015, sysdate-1,  null,       'CART',     53.97, 109, null,               4, null,      1, 1004, null,  null, 'Y', 'N', null,      'N', null, 0, SYSDATE,0,SYSDATE,0);
insert into ORDERS values (1016, sysdate-2,  null,       'PENDING',  160.94, 117, null,              18, null,      1, 1012, 3,     null, 'Y', 'N', null,      'N', null, 0, SYSDATE,0,SYSDATE,0);
insert into ORDERS values (1017, sysdate-9,  null,       'STOCK',    1649.92, 111, null,              8, null,       2, 1006, 3,     null, 'Y', 'Y', 102,        'N', null, 0, SYSDATE,0,SYSDATE,0);
insert into ORDERS values (1018, sysdate-1,  null,       'CART',     195.99, 112, null,              11, null,      3, 1007, 6,     null, 'N', 'N', null,      'N', null, 0, SYSDATE,0,SYSDATE,0);
insert into ORDERS values (1019, sysdate-28, sysdate-24, 'COMPLETE', 2179.99, 114, null,              14, null,      1, 1009, 2,     null, 'Y', 'Y', 103,        'N', null, 0, SYSDATE,0,SYSDATE,0);
insert into ORDERS values (1020, sysdate-2, sysdate-1,   'COMPLETE', 2451.97, 118, null,            27, null,       1, 1013, 3,     null, 'Y', 'Y', 101,    'N', null, 0, SYSDATE,0,SYSDATE,0);
insert into ORDERS values (1021, sysdate-8, sysdate-4,   'COMPLETE', 2677.96, 118, null,            26, null,       1, 1013, 3,     null, 'Y', 'Y', 101,    'N', null, 0, SYSDATE,0,SYSDATE,0);
insert into ORDERS values (1022, sysdate-17, sysdate-13, 'COMPLETE', 2225.98, 118, null,            28, null,       1, 1013, 3,     null, 'Y', 'Y', 101,    'N', null, 0, SYSDATE,0,SYSDATE,0);
insert into ORDERS values (1023, sysdate-45, sysdate-41, 'COMPLETE', 2451.97, 114, null,            29, null,       1, 1019, 3,     null, 'Y', 'Y', 101,    'N', null, 0, SYSDATE,0,SYSDATE,0);
insert into ORDERS values (1024, sysdate-7, sysdate-3,   'COMPLETE', 2677.96, 114, null,            30, null,       1, 1019, 3,     null, 'Y', 'Y', 101,    'N', null, 0, SYSDATE,0,SYSDATE,0);
insert into ORDERS values (1025, sysdate-12, sysdate-8,  'COMPLETE', 2225.98, 114, null,            2, null,        1, 1019, 3,     null, 'Y', 'Y', 101,    'N', null, 0, SYSDATE,0,SYSDATE,0);
insert into ORDERS values (1026, sysdate-18, sysdate-15, 'COMPLETE', 2451.97, 110, null,            24, null,       1, 1018, 3,     null, 'Y', 'Y', 101,    'N', null, 0, SYSDATE,0,SYSDATE,0);
insert into ORDERS values (1027, sysdate-25, sysdate-20, 'COMPLETE', 2677.96, 110, null,            25, null,       1, 1018, 3,     null, 'Y', 'Y', 101,    'N', null, 0, SYSDATE,0,SYSDATE,0);
insert into ORDERS values (1028, sysdate-21, sysdate-19, 'COMPLETE', 2225.98, 110, null,            6, null,        1, 1018, 3,     null, 'Y', 'Y', 101,    'N', null, 0, SYSDATE,0,SYSDATE,0);
insert into ORDERS values (1029, sysdate-9, sysdate-7,   'COMPLETE', 2451.97, 109, null,            4, null,        1, 1017, 3,     null, 'Y', 'Y', 101,    'N', null, 0, SYSDATE,0,SYSDATE,0);
insert into ORDERS values (1030, sysdate-15, sysdate-12, 'COMPLETE', 2677.96, 109, null,            23, null,       1, 1017, 3,     null, 'Y', 'Y', 101,    'N', null, 0, SYSDATE,0,SYSDATE,0);
insert into ORDERS values (1031, sysdate-47, sysdate-44, 'COMPLETE', 2225.98, 109, null,            22, null,       1, 1017, 3,     null, 'Y', 'Y', 101,    'N', null, 0, SYSDATE,0,SYSDATE,0);
insert into ORDERS values (1032, sysdate-31, sysdate-30, 'COMPLETE', 2451.97, 108, null,            3, null,        1, 1016, 3,     null, 'Y', 'Y', 101,    'N', null, 0, SYSDATE,0,SYSDATE,0);
insert into ORDERS values (1033, sysdate-24, sysdate-21, 'COMPLETE', 2677.96, 108, null,            20, null,       1, 1016, 3,     null, 'Y', 'Y', 101,    'N', null, 0, SYSDATE,0,SYSDATE,0);
insert into ORDERS values (1034, sysdate-17, sysdate-16, 'COMPLETE', 2225.98, 108, null,            21, null,       1, 1016, 3,     null, 'Y', 'Y', 101,    'N', null, 0, SYSDATE,0,SYSDATE,0);