CREATE DATABASE `VTI_Assigment2`;
USE `VTI_Assigment2`;
/* TẠO BẢNG TRAINEE */
DROP TABLE Trainee;
CREATE TABLE Trainee (
	TraineeID INT,				/* ĐỊNH DANH THỰC TẬP SINH */
    Full_Name VARCHAR(50),		/* TÊN ĐẦY ĐỦ THỰC TẬP SINH */
    Birth_Date DATE,			/* NGÀY SINH THỰC TẬP SINH */
    Gender ENUM('MALE', 'FEMALE', 'UNKNOW'),					/* GIỚI TÍNH CHỈ CÓ 3 GIÁ TRỊ */
    ET_IQ INT CHECK(ET_IQ <= 20),			/* ĐIỂM TEST IQ 0 -> 20 */
    ET_Gmath INT CHECK (ET_Gmath <= 20),		/* ĐIỂM GMATH 0 -> 20 */
    ET_English INT CHECK(ET_English <= 50),		/* ĐIỂM ENGLISH 0 -> 50 */
    Training_Class INT,			/* MÃ LỚP */
    Evaluation_Note TEXT,		/* ĐÁNH GIÁ FREE TEXT */
    /* TRƯỜNG VTI_ACCOUNT NOT NULL */
    VTI_Account INT NOT NULL,
    /* TRƯỜNG VTI_ACCOUNT UNIQUE */
    UNIQUE(VTI_Account)
);
/* EXERCISE2 */
CREATE TABLE `Exercise2` (
    ID INT AUTO_INCREMENT,
    NAME TEXT,
    CODE CHAR(5),
    MODIFIEDDATE DATETIME,
    PRIMARY KEY (ID)
);
/* EXCERCISE3 */
CREATE TABLE `Exercise3` (
    ID INT AUTO_INCREMENT,
    NAME TEXT,
    BIRTHDATE DATE,
    GENDER ENUM('MALE', 'FEMALE', 'UNKNOW'),
    ISDELETEDFLAG BOOL,
    PRIMARY KEY (ID)
);