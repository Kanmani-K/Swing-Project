# Swing-Project
Vehicle Hiring System: Done using Swing and Oracle DB
For this project to run... You should have two tables named: usertable and vehicle.
UserTable:
Name                                      Null?    Type
 ----------------------------------------- -------- ----------------------------
 ID                                        NOT NULL NUMBER(30)
 NAME                                               VARCHAR2(20)
 PHONE                                              NUMBER(10)
 CITY                                               VARCHAR2(10)
 PASSWORD                                           VARCHAR2(10)
 USERNAME                                  NOT NULL VARCHAR2(10)


Vehicle Table:
Name                                           Type
 -----------------------------------------  ----------------------------
 NAME                                               VARCHAR2(10)
 ID                                                 VARCHAR2(10)
 COST                                               NUMBER(38)
 AC                                                 VARCHAR2(10)
 TV                                                 VARCHAR2(10)
 CHAREPORT                                          NUMBER(38)
 COMFORT                                            NUMBER(38)
 KM                                                 NUMBER(38)
 SEATCOUNT                                          NUMBER(38)
 BOOKED                                             NUMBER(1)
 BOOKEDDATE                                         DATE
