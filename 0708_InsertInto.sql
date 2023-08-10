use VTI_Assigment2;
/* TẠO BẢNG Fresher_management */
DROP TABLE Fresher_management;
CREATE TABLE Fresher_management (
    TraineeID TINYINT UNSIGNED PRIMARY KEY,				/* ĐỊNH DANH THỰC TẬP SINH */
    Full_Name NVARCHAR(50) NOT NULL,		/* TÊN ĐẦY ĐỦ THỰC TẬP SINH */
    Birth_Date DATE,			/* NGÀY SINH THỰC TẬP SINH */
    Gender ENUM('MALE', 'FEMALE', 'UNKNOWN'),					/* GIỚI TÍNH CHỈ CÓ 3 GIÁ TRỊ */
    ET_IQ TINYINT UNSIGNED CHECK(ET_IQ <= 20),			/* ĐIỂM TEST IQ 0 -> 20 */
    ET_Gmath TINYINT UNSIGNED CHECK (ET_Gmath <= 20),		/* ĐIỂM GMATH 0 -> 20 */
    ET_English TINYINT UNSIGNED CHECK(ET_English <= 50),		/* ĐIỂM ENGLISH 0 -> 50 */
    Training_Class INT,			/* MÃ LỚP */
    Evaluation_Note TEXT		/* ĐÁNH GIÁ FREE TEXT */
);

ALTER TABLE Fresher_management ADD COLUMN VTI_Account VARCHAR(30) NOT NULL UNIQUE;

INSERT INTO Fresher_management(TraineeID,Full_Name, Birth_Date,Gender,ET_IQ,ET_Gmath, ET_English,Training_Class,Evaluation_Note,VTI_Account)
VALUES (1,'Nguyen Thi Kim Phung', DATE '2001-06-01','FEMALE',20,20,50,07080001,'Lop hoc rat tot','ID01'),
(2,'Nguyen Thi Minh Phuoc', DATE '2001-12-22','FEMALE',20,20,50,07080001,'Lop hoc rat tot','ID02'),
(3,'Nguyen Trinh Tra Giang', DATE '2001-01-18','FEMALE',20,20,50,07080002,'Lop hoc rat tot','ID03'),
(4,'Van Phuc Huy', DATE '2001-06-01','FEMALE',20,20,50,07080002,'Lop hoc rat tot','ID04'),
(5,'Nguyen Thi Kim', DATE '2001-06-01','FEMALE',20,20,50,07080003,'Lop hoc rat tot','ID05'),
(6,'Nguyen Thi Kim 1', DATE '2001-06-01','FEMALE',20,20,50,07080003,'Lop hoc rat tot','ID06'),
(7,'Nguyen Thi Kim 2', DATE '2001-06-22','FEMALE',20,20,30,07080003,'Lop hoc rat tot','ID07'),
(8,'Nguyen Thi Kim 3', DATE '2001-04-01','FEMALE',20,20,30,07080004,'Lop hoc rat tot','ID08'),
(9,'Nguyen Thi Kim 4', DATE '2001-05-01','FEMALE',20,20,30,07080004,'Lop hoc rat tot','ID09'),
(10,'Nguyen Thi Kim 5', DATE '2001-08-01','FEMALE',20,20,40,07080004,'Lop hoc rat tot','ID10'),
(11,'Nguyen Thi Kim 6', DATE '2001-09-01','FEMALE',20,20,50,07080004,'Lop hoc rat tot','ID11'),
(12,'Nguyen Thi Kim 7', DATE '2001-10-01','FEMALE',20,20,50,07080004,'Lop hoc rat tot','ID12'),
(13,'Nguyen Thi Kim 8', DATE '2001-06-02','FEMALE',10,20,50,07080004,'Lop hoc rat tot','ID13'),
(14,'Nguyen Kim 9', DATE '2001-06-03','MALE',20,10,50,07080004,'Lop hoc rat tot','ID14'),
(15,'Nguyen Kim 10', DATE '2001-06-04','MALE',10,20,50,07080004,'Lop hoc rat tot','ID15'),
(16,'Nguyen Kim 11', DATE '2001-06-05','MALE',10,20,50,07080004,'Lop hoc rat tot','ID16'),
(17,'Nguyen Kim 12', DATE '2001-06-16','MALE',10,20,50,07080004,'Lop hoc rat tot','ID17'),
(18,'Nguyen Kim 13', DATE '2001-06-17','MALE',10,20,50,07080004,'Lop hoc rat tot','ID18'),
(19,'Nguyen Kim 14', DATE '2001-06-08','MALE',20,8,50,07080004,'Lop hoc rat tot','ID19'),
(20,'Nguyen Kim 15', DATE '2001-06-19','MALE',20,8,50,07080004,'Lop hoc rat tot','ID20');

/* QUESTION 2 */
SELECT COUNT(F.TraineeID) AS 'TONG SO HS DAU', MONTH(F.Birth_Date) AS 'THÁNG SINH', GROUP_CONCAT(F.Full_Name) AS 'LIST PASSED'
FROM fresher_management AS F
WHERE	(F.ET_IQ + F.ET_Gmath) >= 20 AND 
		F.ET_IQ >= 8 AND 
        F.ET_Gmath >= 8 AND 
        F.ET_English >= 18
GROUP BY F.Birth_Date;
 /* QUESTION 3 */
SELECT 	F.Full_Name, F.Gender,
		TIMESTAMPDIFF(YEAR, F.Birth_Date, CURDATE()) AS AGE
FROM fresher_management AS F
WHERE LENGTH(F.Full_Name) = (	SELECT MAX(LENGTH(F1.Full_Name))
								FROM fresher_management AS F1);
 /* QUESTION 4 */
SET sql_mode=(SELECT REPLACE(@@sql_mode,'ONLY_FULL_GROUP_BY','')); 
SELECT *
FROM fresher_management AS F
WHERE	(F.ET_IQ + F.ET_Gmath) >= 20 AND 
		F.ET_IQ >= 8 AND 
        F.ET_Gmath >= 8 AND 
        F.ET_English >= 18;
/* QUESTION 5 */
DELETE FROM Fresher_management WHERE TraineeID = 3;
/* QUESTION 6 */
UPDATE Fresher_management AS F
SET F.Training_Class = 2
WHERE TraineeID = 5;

