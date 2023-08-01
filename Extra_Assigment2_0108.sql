CREATE DATABASE `VTI_Assigment2`;
USE `VTI_Assigment2`;
/* TẠO BẢNG TRAINEE */
CREATE TABLE Trainee (
	TraineeID INT,				/* ĐỊNH DANH THỰC TẬP SINH */
    Full_Name VARCHAR(50),		/* TÊN ĐẦY ĐỦ THỰC TẬP SINH */
    Birth_Date DATE,			/* NGÀY SINH THỰC TẬP SINH */
    Gender BIT,					/* GIỚI TÍNH CHỈ CÓ 3 GIÁ TRỊ */
    ET_IQ INTEGER(20),			/* ĐIỂM TEST IQ 0 -> 20 */
    ET_Gmath INTEGER(20),		/* ĐIỂM GMATH 0 -> 20 */
    ET_English INTEGER(50),		/* ĐIỂM ENGLISH 0 -> 50 */
    Training_Class INT,			/* MÃ LỚP */
    Evaluation_Note TEXT,		/* ĐÁNH GIÁ FREE TEXT */
    /* TRƯỜNG VTI_ACCOUNT NOT NULL */
    VTI_Account INT NOT NULL,
    /* TRƯỜNG VTI_ACCOUNT UNIQUE */
    UNIQUE(VTI_Account)
);
/* EXERCISE2 */
CREATE TABLE `Exercise2` (
	ID INT AUTO_INCREMENT, 			/* MỖI LẦN INSERT TĂNG LÊN 1 */
    NAME TEXT,						/* CHỨA CHUỖI TIẾNG ANH */
    CODE CHAR(5),					/* CÓ 5 KÍ TỰ LÀ ALPHANUMERRIC CODE */
	MODIFIEDDATE DATETIME,			/* THỜI GIAN CẬP NHẬT */
    PRIMARY KEY (ID)				/* KHÓA CHÍNH */
);
/* EXCERCISE3 */
CREATE TABLE `Exercise3` (
	ID INT AUTO_INCREMENT,			/* MỖI LẦN INSERT TĂNG LÊN 1 */
    NAME TEXT,						/* CHỨA CHUỖI TIẾNG ANH */
    BIRTHDATE DATE,					/* NGÀY SINH NHẬT */
    GENDER BIT,						/* GỒM 3 GIÁ TRỊ */
    ISDELETEDFLAG BOOL,				/* CÓ 2 GIÁ TRỊ */
    PRIMARY KEY (ID)				/* KHÓA CHÍNH */
);