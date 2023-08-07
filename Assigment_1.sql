DROP DATABASE IF EXISTS `Testing_System_Assignment_1`; 	/*XÓA DATA*/
CREATE DATABASE `Testing_System_Assignment_1`; 			/* Tạo data */
USE `Testing_System_Assignment_1`; 						/* dùng data */
DROP TABLE IF EXISTS `Department`; 						/* xóa bảng */
CREATE TABLE `Department` (
	DepartmentID TINYINT PRIMARY KEY,									/* định danh phòng ban */
    DepartmentName VARCHAR(15)							/* tên đầy đủ của phòng ban */ 
);
CREATE TABLE `Position` (
	`PositionID` TINYINT PRIMARY KEY,										/*định danh chức vụ*/
    PositionName VARCHAR(20)							/*tên chức vụ*/
);
DROP TABLE IF EXISTS `Account`;
CREATE TABLE `Account`(
	AccountID TINYINT PRIMARY KEY,							/*định danh của user*/
    Email VARCHAR(30),									/*email*/
    Username VARCHAR(10),								/*username*/
    Fullname NVARCHAR(50),								/*tên đầy đủ*/
    DepartmentID TINYINT NOT NULL,						/*phòng ban của user trong hệ thống*/
    `PositionID` TINYINT NOT NULL, 						/*chức vụ của user*/
    CreateDate DATE,									/*ngày tạo tài khoản*/
    FOREIGN KEY (PositionID) REFERENCES `Position`(PositionID),
    FOREIGN KEY (DepartmentID) REFERENCES `Department`(DeparmentID)
);
CREATE TABLE `Group` (
	GroupID TINYINT PRIMARY KEY,
    GroupName NVARCHAR(20),
    CreatorID TINYINT NOT NULL,
    CreatDate DATE
);
CREATE TABLE `GroupAccount`( 
	GroupID TINYINT,
    AccountID TINYINT,
    JoinDate DATE,
    FOREIGN KEY (AccountID) REFERENCES `Account`(AccountID),
    FOREIGN KEY (GroupID) REFERENCES `Group`(GroupID)
);
CREATE TABLE `TypeQuestion` (
	TypeID TINYINT PRIMARY KEY,
    TypeName VARCHAR(20)
);
CREATE TABLE `CategoryQuestion` (
	CategoryID TINYINT PRIMARY KEY,
    CategoryName VARCHAR(50)
);
CREATE TABLE `Question` (
	 QuestionID TINYINT PRIMARY KEY,
     Content VARCHAR(150),
     CategoryID TINYINT,
     TypeID TINYINT,
     CreatorID int,
     CreateDate DATE
);
CREATE TABLE `Answer` (
	AnswerID int,
    Content varchar(150),
    QuestionID int,
    isCorrect int
);
CREATE TABLE `Exam` (
	ExamID int,
    `Code` int,
    Title varchar(30),
    CategoryID int,
    Duration DATE,
    CreatorID int,
    CreateDate date
);
CREATE TABLE `ExamQuestion` (
	ExamID int,
    QuestionID int
);
