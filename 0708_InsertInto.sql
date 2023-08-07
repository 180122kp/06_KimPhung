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
(3,'Nguyen Trinh Tra Giang', DATE '2001-01-18','FEMALE',20,20,50,07080001,'Lop hoc rat tot','ID03'),
(4,'Van Phuc Huy', DATE '2001-06-01','FEMALE',20,20,50,07080001,'Lop hoc rat tot','ID04'),
(5,'Nguyen Thi Kim', DATE '2001-06-01','FEMALE',20,20,50,07080001,'Lop hoc rat tot','ID05'),
(6,'Nguyen Thi Kim A', DATE '2001-06-01','FEMALE',20,20,50,07080001,'Lop hoc rat tot','ID06'),
(7,'Nguyen Thi Kim B', DATE '2001-06-01','FEMALE',20,20,50,07080001,'Lop hoc rat tot','ID07'),
(8,'Nguyen Thi Kim C', DATE '2001-06-01','FEMALE',20,20,50,07080001,'Lop hoc rat tot','ID058'),
(9,'Nguyen Thi Kim D', DATE '2001-06-01','FEMALE',20,20,50,07080001,'Lop hoc rat tot','ID09'),
(10,'Nguyen Thi Kim E', DATE '2001-06-01','FEMALE',20,20,50,07080001,'Lop hoc rat tot','ID10');