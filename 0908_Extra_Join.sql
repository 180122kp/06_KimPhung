USE VTI_assigment2;
CREATE TABLE Department(
	Department_Number INT AUTO_INCREMENT PRIMARY KEY,
    Department_Name NVARCHAR(50)
);
CREATE TABLE Employee_Table(
	Employee_Number INT PRIMARY KEY,
    Employee_Name NVARCHAR(50),
    Department_Number INT,
    FOREIGN KEY (Department_Number) REFERENCES Department(Department_Number)
);
CREATE TABLE Employee_Skill_Table (
	Employee_Number INT  ,
    Skill_Code NVARCHAR(50),
    Date_Registered DATE,
    FOREIGN KEY (Employee_Number) REFERENCES Employee_Table(Employee_Number)
);
INSERT INTO Department (Department_Name)
VALUES ('Rocket 38 HCM'),
('Rocket 37 HCM'),('Rocket 36 HCM'),('Rocket 35 HCM'),
('Rocket 34 HCM'),('Rocket 33 HCM'),('Rocket 32 HCM'),
('Rocket 31 HCM'),('Rocket 30 HCM'),('Rocket 29 HCM'),
('Rocket 28 HCM'),('Rocket 27 HCM'),('Rocket 26 HCM');
INSERT INTO Employee_Table(Employee_Number,Employee_Name,Department_Number)
VALUES (1900001,'Nguyen 1',1),(1900002,'Nguyen 2',1),
		(1900003,'Nguyen 3',1),(1900004,'Nguyen 4',1),
        (1900005,'Nguyen 5',5),(1900006,'Nguyen 6',6),
        (1900007,'Nguyen 7',7),(1900008,'Nguyen 8',8),
        (1900009,'Nguyen 9',9),(1900010,'Nguyen 10',10);
INSERT INTO Employee_Skill_Table(Employee_Number,Skill_Code,Date_Registered)
VALUES(1900001,'java core','2023-08-09'),(1900003,'python','2023-08-06'),
		(1900002,'C#','2023-08-07'),(1900004,'C++','2023-08-08'),
        (1900005,'PHP','2023-08-10'),(1900006,'C','2023-08-05');
DROP TABLE Employee_Skill_Table;
DROP TABLE Department;
/* QUERY QUESTION 3 */
SELECT E.Employee_Name
FROM Employee_Table E
JOIN Employee_Skill_Table EST ON E.Employee_Number = EST.Employee_Number
WHERE EST.Skill_Code = 'java core';
/* QUERY QUESTION 4 */
SELECT D.Department_Number, D.Department_Name, ET.Employee_Number
FROM Department D
JOIN Employee_Table ET ON D.Department_Number = ET.Department_Number
GROUP BY ET.Employee_Number
HAVING COUNT(ET.Employee_Number) > 3;
/* QUERY QUESTION 5 */
SELECT *
FROM Employee_Table ET
JOIN Employee_Skill_Table EST ON ET.Employee_Number = EST.Employee_Number
GROUP BY  ET.Employee_Number
HAVING COUNT(EST.Skill_Code)>1