CREATE TABLE EMPLOYEES(	
    EMPLOYEE_ID NUMBER, 
	FIRST_NAME VARCHAR2(255), 
	LAST_NAME VARCHAR2(255), 
	EMAIL VARCHAR2(255), 
	PHONE_NUMBER VARCHAR2(255), 
	HIRE_DATE DATE, 
	JOB_ID VARCHAR2(100), 
	SALARY NUMBER, 
	COMMISSION_PCT NUMBER, 
	MANAGER_ID  NUMBER, 
	DEPARTMENT_ID NUMBER,
    PRIMARY KEY(EMPLOYEE_ID)
);