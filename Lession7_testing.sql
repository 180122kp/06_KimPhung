USE testing_system_assignment_1;
/* Question 1: Tạo trigger không cho phép người dùng nhập vào Group có ngày tạo  trước 1 năm trước */
DROP TRIGGER IF EXISTS QA01;
DELIMITER //
CREATE TRIGGER QA01
BEFORE INSERT ON `Group`
FOR EACH ROW
BEGIN 
	IF (NEW.CreateDate< DATE_SUB(CURRENT_DATE, INTERVAL 1 YEAR)) THEN
			SIGNAL SQLSTATE '14500'
            SET MESSAGE_TEXT = 'Ko add được';
		END IF;
END //
DELIMITER ;

INSERT INTO `Group`	(  GroupName, CreatorID	, CreateDate)
VALUE 				(N'Testing System',12,'2019-03-05');
SELECT * FROM `Group`;

-- Question 2: Tạo trigger Không cho phép người dùng thêm bất kỳ user nào vào
-- department "Sale" nữa, khi thêm thì hiện ra thông báo "Department "Sale" cannot add
-- more user"
DROP TRIGGER IF EXISTS QA02;
DELIMITER //
	CREATE TRIGGER QA02
    BEFORE INSERT ON `Department`
    FOR EACH ROW
    BEGIN
			IF (NEW.DepartmentName = 'Sale') THEN
				SIGNAL SQLSTATE '14500'
				SET MESSAGE_TEXT = 'Department "Sale" cannot add more user';
			END IF;
    END//
DELIMITER ;
INSERT INTO Department	(DepartmentName)
VALUE					(N'Sale');
-- Question 3: Cấu hình 1 group có nhiều nhất là 5 user.
DROP TRIGGER IF EXISTS QA03;
DELIMITER //
CREATE TRIGGER QA03
BEFORE INSERT ON `ExamQuestion`
FOR EACH ROW
BEGIN
		IF (SELECT 	GroupID FROM GroupAccount GROUP BY GroupID HAVING Count(AccountID) >= 5) THEN
			SIGNAL SQLSTATE '14500'
			SET MESSAGE_TEXT = 'Một group có nhiều nhất 5 User';
        END IF;
END //
DELIMITER ;

INSERT INTO `GroupAccount`	(  GroupID	, AccountID	, JoinDate	 )
VALUE (	1, 1,'2019-03-05');
-- Question 5: Tạo trigger không cho phép người dùng xóa tài khoản có email là
-- admin@gmail.com (đây là tài khoản admin, không cho phép user xóa), còn lại các tài
-- khoản khác thì sẽ cho phép xóa và sẽ xóa tất cả các thông tin liên quan tới user đó
DROP TRIGGER IF EXISTS QA05;
DELIMITER //
CREATE TRIGGER QA05
BEFORE DELETE ON `Account`
FOR EACH ROW
BEGIN
	IF OLD.Email = 'admin@gmail.com'
    THEN
		SIGNAL SQLSTATE '14500'
        SET MESSAGE_TEXT = 'Cannot delete data';
	END IF;

END //
DELIMITER ;

INSERT INTO `Account`(Email				, Username			, FullName				, DepartmentID	, PositionID, CreateDate)
VALUE 				('admin@gmail.com'	, 'dangblacky'		,'Nguyen Hai Dang'		,   '5'			,   '1'		,'2020-03-05');

DELETE
FROM `Account`
WHERE Email = 'admin@gmail.com';