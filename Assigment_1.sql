DROP DATABASE IF EXISTS `Testing_System_Assignment_1`; 	/*XÓA DATA*/
CREATE DATABASE `Testing_System_Assignment_1`; 			/* Tạo data */
USE `Testing_System_Assignment_1`; 						/* dùng data */
DROP TABLE IF EXISTS `Department`; 						/* xóa bảng */
CREATE TABLE `Department` (
	DepartmentID TINYINT PRIMARY KEY AUTO_INCREMENT,									/* định danh phòng ban */
    DepartmentName VARCHAR(15)							/* tên đầy đủ của phòng ban */ 
);
INSERT INTO `Department`(DepartmentName)
VALUES('Sale'),('Marketing'),('IT'),(N'Hành Chính'),(N'Tuyển Dụng');
CREATE TABLE `Position` (
	`PositionID` TINYINT PRIMARY KEY AUTO_INCREMENT,										/*định danh chức vụ*/
    PositionName ENUM('DEV','TEST','SCRUM MASTER','PM')							/*tên chức vụ*/
);
INSERT INTO `Position` (PositionName)
VALUES	('DEV'),('TEST'),('SCRUM MASTER'),('PM'),
		('DEV'),('TEST'),('SCRUM MASTER'),('PM'),
        ('DEV'),('TEST'),('SCRUM MASTER'),('PM'),
        ('DEV'),('TEST'),('SCRUM MASTER'),('PM');
DROP TABLE IF EXISTS `Account`;
CREATE TABLE `Account`(
	AccountID TINYINT PRIMARY KEY AUTO_INCREMENT,		/*định danh user*/					/*định danh của user*/
    Email VARCHAR(30),									/*email*/
    Username VARCHAR(10),								/*username*/
    Fullname NVARCHAR(50),								/*tên đầy đủ*/
    DepartmentID TINYINT NOT NULL,						/*phòng ban của user trong hệ thống*/
    `PositionID` TINYINT NOT NULL, 						/*chức vụ của user*/
    CreateDate DATE,									/*ngày tạo tài khoản*/
    FOREIGN KEY (PositionID) REFERENCES `Position`(PositionID),
    FOREIGN KEY (DepartmentID) REFERENCES `Department`(DepartmentID)
);
INSERT INTO `Account` (Email,Username,Fullname,DepartmentID,PositionID,CreateDate)
VALUES	('kimphung01@gmail.com','phung01','kimphung01',1,1,'2023-08-10'),
		('kimphung02@gmail.com','phung02','kimphung02',1,2,'2023-08-10'),
        ('kimphung03@gmail.com','phung03','kimphung03',2,1,'2023-08-09'),
        ('kimphung04@gmail.com','phung04','kimphung04',2,2,'2023-08-09'),
        ('kimphung05@gmail.com','phung05','kimphung05',2,1,'2023-08-09'),
        ('kimphung06@gmail.com','phung06','kimphung06',3,1,'2023-08-08'),
        ('kimphung07@gmail.com','phung07','kimphung07',3,1,'2023-08-07'),
        ('kimphung08@gmail.com','phung08','kimphung08',3,1,'2023-08-07'),
        ('kimphung09@gmail.com','phung09','kimphung09',3,4,'2023-08-06');
CREATE TABLE `Group` (
	GroupID TINYINT PRIMARY KEY AUTO_INCREMENT,			/*định danh group*/
    GroupName NVARCHAR(20),								/*tên nhóm*/
    CreatorID TINYINT NOT NULL UNIQUE ,							/*id người tạo*/
    CreatDate DATE										/*ngày tạo group*/
);
INSERT INTO `Group`(GroupName,CreatorID,CreatDate)
VALUES	(N'Nhóm 1',1,'2023-05-05'),
		(N'Nhóm 2',2,'2023-05-04'),
        (N'Nhóm 3',3,'2023-05-05'),
        (N'Nhóm 4',4,'2023-05-05');
CREATE TABLE `GroupAccount`( 
	GroupAccountID TINYINT PRIMARY KEY AUTO_INCREMENT,
	GroupID TINYINT,
    AccountID TINYINT,
    JoinDate DATE,
    FOREIGN KEY (AccountID) REFERENCES `Account`(AccountID),
    FOREIGN KEY (GroupID) REFERENCES `Group`(GroupID)
);
INSERT INTO `GroupAccount` (GroupID,AccountID,JoinDate)
VALUES	(1,1,'2023-08-10'),(1,2,'2023-08-10'),
        (2,3,'2023-08-10'),(2,4,'2023-08-10'),
        (3,5,'2023-08-10'),(3,6,'2023-08-10'),
        (4,7,'2023-08-10'),(4,8,'2023-08-10'),
        (4,9,'2023-08-10');
CREATE TABLE `TypeQuestion` (
	TypeID TINYINT PRIMARY KEY AUTO_INCREMENT,			/*định danh loại câu hỏi */
    TypeName ENUM('Essay','Multiple-Choice')								/*tên loại câu hỏi*/
);
INSERT INTO `TypeQuestion`(TypeName)
VALUES	('Essay'),('Multiple-Choice'),
		('Essay'),('Multiple-Choice'),
        ('Essay'),('Multiple-Choice'),
        ('Essay'),('Multiple-Choice');
CREATE TABLE `CategoryQuestion` (
	CategoryID TINYINT PRIMARY KEY AUTO_INCREMENT,		/*định danh chủ đề câu hỏi*/
    CategoryName VARCHAR(50)							/*tên chủ đề câu hỏi*/
);
INSERT INTO `CategoryQuestion`(CategoryName)
VALUES(N'Tư duy'),(N'Chính trị'),(N'Toán cao cấp'),(N'Mac-LeNin');
CREATE TABLE `Question` (
	 QuestionID TINYINT PRIMARY KEY AUTO_INCREMENT,		/*định danh câu hỏi*/
     Content VARCHAR(150),
     CategoryID TINYINT,								/*định danh chủ đề câu hỏi*/
     TypeID TINYINT,									/*định danh loại câu hỏi*/
     CreatorID TINYINT,									/*định danh người tạo*/
     CreateDate DATE,									/*ngày tạo câu hỏi*/
     FOREIGN KEY (CategoryID) REFERENCES `CategoryQuestion`(CategoryID),
     FOREIGN KEY (TypeID) REFERENCES `TypeQuestion`(TypeID),
     FOREIGN KEY (CreatorID) REFERENCES `Group`(CreatorID)
);
INSERT INTO `Question`(Content,CategoryID,TypeID,CreatorID,CreateDate)
VALUES	(N'1+1=?',3,1,1,'2023-01-01'),
		(N'1+2=?',3,2,1,'2023-01-01'),
        (N'1+3=?',3,1,2,'2023-01-01'),
        (N'1+4=?',1,1,3,'2023-01-01'),
        (N'1+5=?',1,1,3,'2023-01-01'),
        (N'1+6=?',1,2,3,'2023-01-01'),
        (N'1+7=?',1,1,3,'2023-01-01');
CREATE TABLE `Answer` (
	AnswerID TINYINT PRIMARY KEY AUTO_INCREMENT,
    Content VARCHAR(150),
    QuestionID TINYINT,
    isCorrect ENUM('ĐÚNG','SAI'),
    FOREIGN KEY (QuestionID) REFERENCES `Question`(QuestionID)
);
INSERT INTO `Answer` (Content,QuestionID,isCorrect)
VALUES	(N'Bằng 1',1,'SAI'),(N'Bằng 2',1,'ĐÚNG'),
        (N'Bằng 2',2,'SAI'),(N'Bằng 3',2,'ĐÚNG'),
        (N'Bằng 4',3,'ĐÚNG'),(N'Bằng 1',3,'SAI'),
        (N'Bằng 5',4,'ĐÚNG'),(N'Bằng 4',4,'SAI'),
        (N'Bằng 6',5,'ĐÚNG'),(N'Bằng 1',5,'SAI'),
        (N'Bằng 5',6,'SAI'),(N'Bằng 7',6,'ĐÚNG'),
        (N'Bằng 7',7,'SAI'),(N'Bằng 8',7,'SAI');
CREATE TABLE `Exam` (
	ExamID TINYINT PRIMARY KEY AUTO_INCREMENT,
    `Code` CHAR(10),
    Title VARCHAR(100),
    CategoryID TINYINT,
    Duration FLOAT,
    CreatorID TINYINT,
    CreateDate DATE,
    FOREIGN KEY (CategoryID) REFERENCES `CategoryQuestion`(CategoryID),
     FOREIGN KEY (CreatorID) REFERENCES `Group`(CreatorID)
);
INSERT INTO `Exam` (`Code`,Title,CategoryID,Duration,CreatorID,CreateDate)
VALUES	('DT01',N'Thi Giữa Kỳ',1,30,1,'2023-04-01'),
		('DT02',N'Thi Đầu Vào',2,30,2,'2023-04-02'),
        ('DT03',N'Thi Cuối Kỳ',3,30,3,'2023-04-03'),
        ('DT04',N'Kiểm tra 45 phút',4,30,4,'2023-04-01');
CREATE TABLE `ExamQuestion` (
	ExamQuestion TINYINT PRIMARY KEY AUTO_INCREMENT,
    ExamID TINYINT,				
    QuestionID TINYINT,
    FOREIGN KEY (ExamID) REFERENCES `Exam`(ExamID),
    FOREIGN KEY (QuestionID) REFERENCES `Question`(QuestionID)
);
INSERT INTO `ExamQuestion`(ExamID,QuestionID)
VALUES	(1,1),(1,2),
		(2,2),(1,3),
        (3,1),(1,5),
        (4,4),(1,6);

/*-------------------------------------------------------------------*/
-- QUERY QUESTION 1 --
SELECT A.UserName AS `Tên User`, D.DepartmentName AS 'Phòng Ban'
FROM `Account` A 
JOIN `Department` D ON A.DepartmentID = D.DepartmentID;
-- QUERT QUESTION 2 --
SELECT *
FROM Account A 
WHERE A.CreateDate > '2010-10-20';
-- QUERY QUESTION 3 --
SELECT A.UserName AS `Tên User`
FROM Account A 
JOIN Position P ON A.PositionID = P.PositionID
WHERE P.PositionName = 'DEV';
-- QUERY QUESTION 4 --
SET sql_mode=(SELECT REPLACE(@@sql_mode,'ONLY_FULL_GROUP_BY','')); 
SELECT D.DepartmentName AS 'Phòng Ban Có 3 Nhân Viên'
FROM `Account` A 
JOIN `Department` D ON A.DepartmentID = D.DepartmentID
GROUP BY A.DepartmentID
HAVING COUNT(A.AccountID) > 3;
-- QUERY QUESTION 5 --
SELECT 		Q.QuestionID, Q.Content, Q.CategoryID, Q.TypeID, Q.CreatorID, Q.CreateDate, Count(Q.Content) AS 'SO LUONG'
FROM		Question Q
INNER JOIN 	ExamQuestion EQ ON Q.QuestionID = EQ.QuestionID
GROUP BY	Q.Content
HAVING		COUNT(Q.Content) = (SELECT	MAX(CountQ)
								FROM	(SELECT 		COUNT(Q.QuestionID) AS CountQ
										FROM			ExamQuestion EQ
										INNER JOIN 		Question Q ON EQ.QuestionID = Q.QuestionID
										GROUP BY		Q.QuestionID) AS MaxContent);
-- QUERY QUESTION 6 --
SELECT COUNT(Q.QuestionID) AS 'List QuestionName', CG.CategoryName
FROM Question Q
JOIN CategoryQuestion CG ON Q.CategoryID = CG.CategoryID
GROUP BY CG.CategoryID;
-- QUERY QUESTION 7 --
/* LESSION 6*/
-- QUERY QUESTION 01 --
CREATE OR REPLACE VIEW QA01 AS
SELECT *
FROM Account A 
WHERE DepartmentID = 1;
-- SELECT DATA QUESTION 01 --
SELECT *
FROM QA01;
-- QUERY QUESTION 02 --
CREATE OR REPLACE VIEW QA02 AS
SELECT A.*, COUNT(A.AccountID) AS 'SO LUONG'
FROM Account A 
GROUP BY DepartmentID
HAVING COUNT(A.AccountID) = ( SELECT COUNT(A1.AccountID)
								FROM Account A1
                                GROUP BY A1.AccountID
								ORDER BY COUNT(A1.AccountID) DESC);
SET sql_mode=(SELECT REPLACE(@@sql_mode,'ONLY_FULL_GROUP_BY',''));
SELECT * 
FROM QA02;
-- QUERY QUESTION 03 --
CREATE OR REPLACE VIEW QA03 AS
SELECT *
FROM QUESTION 
WHERE LENGTH(Content) > 5;
-- select data--
SELECT *
FROM QA03;
