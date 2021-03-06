DROP DATABASE ExamManagement;
CREATE DATABASE ExamManagement;
USE ExamManagement;
CREATE TABLE STUDENT(
    ID INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
    FIRSTNAME VARCHAR(40) NOT NULL,
    LASTNAME VARCHAR(40) NOT NULL,
    EMAIL VARCHAR(40) NOT NULL,
    PASSWORD VARCHAR(40) NOT NULL
);
CREATE TABLE ADMIN(
    USERNAME VARCHAR(40) PRIMARY KEY NOT NULL,
    FIRSTNAME VARCHAR(40) NOT NULL,
    LASTNAME VARCHAR(40) NOT NULL,
    EMAIL VARCHAR(40) NOT NULL,
    PASSWORD VARCHAR(40) NOT NULL,
    EPASSWORD VARCHAR(40) NOT NULL
);

CREATE TABLE EMAIL(
    EMAIL VARCHAR(40) NOT NULL,
    PASSWORD VARCHAR(40) NOT NULL
);

CREATE TABLE EXAMS(
    ID INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
    TITLE VARCHAR(200) NOT NULL,
    TOTALQUESTION INT NOt NULL
);

CREATE TABLE CURRENTEXAM(
    ID INT PRIMARY KEY,
    TIME INT
);

INSERT INTO ADMIN VALUES('admin','admin','admin','admin','admin','admin');
INSERT INTO EMAIL VALUES('admin','admin');



-- TESTS 

-- SELECT COUNT(*) FROM ADMIN WHERE USERNAME='ADMIN' AND PASSWORD='ADMIN';
-- SELECT * FROM ADMIN WHERE USERNAME='ADMIN' AND PASSWORD='ADMIN';
-- INSERT INTO EXAMS(TITLE,TOTALQUESTION) VALUES('JAVA',10);
-- DELETE FROM CURRENTEXAM;
-- INSERT INTO CURRENTEXAM VALUES(2,50);
-- INSERT INTO STUDENT(FIRSTNAME,LASTNAME,EMAIL,PASSWORD) values('BHARGAB','HAZARIKA','MAXY@HELL.COM','GGYYGUH');
-- SELECT * FROM EXAMS WHERE ID=2
-- UPDATE EXAMS SET TITLE='NEW TITLE',TOTALQUESTION=123 WHERE ID=1;
-- DELETE FROM EXAMS WHERE ID=7;
-- CREATE TABLE EXAM_1(ID INT PRIMARY KEY,Q VARCHAR(150),A VARCHAR(100),B VARCHAR(100),C VARCHAR(100),D VARCHAR(100),CA VARCHAR(5));
-- INSERT INTO EXAM_5 VALUES(1,'q','a','b','c','d','a');
