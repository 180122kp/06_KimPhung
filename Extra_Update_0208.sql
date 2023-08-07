CREATE DATABASE `VTI_Assigment2`;
USE `VTI_Assigment2`;
/* TẠO BẢNG TRAINEE */
DROP TABLE Trainee;
CREATE TABLE Trainee (
    TraineeID TINYINT UNSIGNED PRIMARY KEY,				/* ĐỊNH DANH THỰC TẬP SINH */
    Full_Name NVARCHAR(50) NOT NULL,		/* TÊN ĐẦY ĐỦ THỰC TẬP SINH */
    Birth_Date DATE,			/* NGÀY SINH THỰC TẬP SINH */
    Gender ENUM('MALE', 'FEMALE', 'UNKNOWN'),					/* GIỚI TÍNH CHỈ CÓ 3 GIÁ TRỊ */
    ET_IQ TINYINT UNSIGNED CHECK(ET_IQ <= 20),			/* ĐIỂM TEST IQ 0 -> 20 */
    ET_Gmath TINYINT UNSIGNED CHECK (ET_Gmath <= 20),		/* ĐIỂM GMATH 0 -> 20 */
    ET_English TINYINT UNSIGNED CHECK(ET_English <= 50),		/* ĐIỂM ENGLISH 0 -> 50 */
    Training_Class INT,			/* MÃ LỚP */
    Evaluation_Note TEXT,		/* ĐÁNH GIÁ FREE TEXT */
    /* TRƯỜNG VTI_ACCOUNT NOT NULL */
    VTI_Account INT NOT NULL,
    /* TRƯỜNG VTI_ACCOUNT UNIQUE */
    UNIQUE(VTI_Account)
);
ALTER TABLE Trainee ADD COLUMN VTI_Account VARCHAR(30) NOT NULL UNIQUE;
/* EXERCISE2 */
CREATE TABLE `Exercise2` (
    `ID` TINYINT AUTO_INCREMENT,
    `NAME` VARCHAR(50),
    `CODE` CHAR(5),
    `MODIFIEDDATE` DATETIME DEFAULT NOW(),
    PRIMARY KEY (ID)
);
/* EXCERCISE3 */
CREATE TABLE `Exercise3` (
    `ID` TINYINT AUTO_INCREMENT,
    `NAME` TEXT,
    `BIRTHDATE` DATE,
    `GENDER` ENUM('0', '1', '2'),
    `ISDELETEDFLAG` ENUM('0','1'),
    PRIMARY KEY (ID)
);