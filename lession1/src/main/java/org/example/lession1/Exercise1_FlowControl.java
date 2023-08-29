package org.example.lession1;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exercise1_FlowControl {
    public static void main (String[] args)
    {
        // Tạo đối tượng Department
        Department hrDepartment = new Department(1, "HR");
        Department itDepartment = new Department(2, "IT");

        // Tạo đối tượng Position
        Position developerPosition = new Position(1, "Developer");
        Position designerPosition = new Position(2, "Designer");

        // Tạo đối tượng Group
        Group group1 = new Group(1, "Developers");
        Group group2 = new Group(2, "Designers");

        // Tạo mảng các tài khoản cho Group
        Account[] group1Accounts = {
                new Account(1, "john.doe@example.com", "john.doe", "John Doe",
                        hrDepartment, developerPosition, LocalDateTime.of(2022, 1, 1,12,00,00), new Group[]{group1}),
                new Account(2, "jane.smith@example.com", "jane.smith", "Jane Smith",
                        itDepartment, designerPosition, LocalDateTime.of(2022, 1, 1,12,00,00), new Group[]{group1}),
                new Account(3, "alice@example.com", "alice", "Alice",
                        hrDepartment, designerPosition, LocalDateTime.of(2022, 1, 1,12,00,00), new Group[]{group2}),
                new Account(4, "bob@example.com", "bob", "Bob",
                        itDepartment, developerPosition, LocalDateTime.of(2022, 1, 1,12,00,00), new Group[]{group2})
        };
        // tạo mảng department
        Department[] department1 = {
                new Department(1,"Sale"),
                new Department(2,"Marketing")
        };
        Account account1 = new Account(1, "john.doe@example.com", "john.doe", "John Doe",
                hrDepartment, developerPosition,LocalDateTime.of(2022, 1, 1,12,00,00), new Group[]{group1});
        Account account2 = new Account(2, "jane.smith@example.com", "jane.smith", "Jane Smith",
                itDepartment, designerPosition,LocalDateTime.of(2022, 1, 1,12,00,00), new Group[]{group1});
        Account account3 = new Account(3, "alice@example.com", "alice", "Alice",
                hrDepartment, designerPosition,LocalDateTime.of(2022, 1, 1,12,00,00), new Group[]{group2});
        Account account4 = new Account(4, "bob@example.com", "bob", "Bob",
                itDepartment, developerPosition,LocalDateTime.of(2022, 1, 1,12,00,00), new Group[]{group2});
            // add Account vào group
        group1.addAccount(account1);
        group1.addAccount(account2);
            // question 1
        question1(account2);
            // question 2
        question2(account2);
            // question 3
        question3(account2);
            //question 4
        question4(account1);
            // question 5
        question5(group1);
            // question 6
        question6(account2);
            // question 7
        question7(account1);
            // question 8
        question8(account1);
            // question 9
        question9(hrDepartment);
            // question 10
        question10(group1Accounts);
            // question 11
        question11(department1);
            // question 13
        question13(group1Accounts);
        // question 14
        question14(group1Accounts);
            // tạo mảng int
        int[] i = {1,2,3,4,5,6,7,14,15,16,17,17,20};
            // question 15
        question15();
    }
    public static void question1(Account account)
    {
            if (account.department.getId() == 0 )
            {
                System.out.println("Nhân viên này chưa có phòng ban");
            }
            else System.out.println("Phòng ban của nhân viên này là " + account.department.getName());

        }
    public static int countGroupsForAccount(Account account)
    {
        Group[] groups = account.getGroups();
        return groups.length;
    }
    public static void question2(Account account)
    {
        if(countGroupsForAccount(account) == 0)
        {
            System.out.println("Nhân viên này chưa có group");
        }
        else if (countGroupsForAccount(account) >= 1 || countGroupsForAccount(account) <= 2)
        {
            System.out.println("Group của nhân viên này là Deverloper và Designer " );
        }
        else if (countGroupsForAccount(account) == 3)
        {
            System.out.println("Nhân viên này là người quan trọng,tham gia nhiều group");
        }
        else if (countGroupsForAccount(account) >= 4)
        {
            System.out.println("nhân viên này là người hóng chuyện, tham gia tất cả các group");
        }
    }
    public static void question3(Account account)
    {
        System.out.println(account.department.getId() == 0 ? "Nhân viên này chưa có phòng ban" : "Phòng ban của nhân viên này là " + account.department.getName());
    }
    public static void question4(Account account)
    {
        System.out.println(account.position.getName() == "Developer" ? "Đây là Developer" : "Người này không phải là Developer");
    }

    public static int countAccountForGroup(Group group)
    {
        Account[] accounts = group.getAccounts();
        return accounts.length;
    }
    public static void question5(Group group)
    {
        switch (countAccountForGroup(group))
        {
            case 1 : System.out.println("Nhóm có 1 thành viên"); break;
            case 2 : System.out.println("Nhóm có 2 thành viên"); break;
            case 3 : System.out.println("Nhóm có 3 thành viên"); break;
            default: System.out.println("Nhóm có nhiều thành viên"); break;
        }
    }
    public static void question6(Account account)
    {
        switch (countGroupsForAccount(account)) {
            case 0:
                System.out.println("Nhân viên này chưa có group");
                break;
            case 1: case 2:
                System.out.println("Group của nhân viên này là Deverloper và Designer ");
                break;
            case 3:
                System.out.println("Nhân viên này là người quan trọng,tham gia nhiều group");
                break;
            default:
                System.out.println("nhân viên này là người hóng chuyện, tham gia tất cả các group");
                break;
        }
    }
    public static void question7(Account account)
    {
        switch (account.position.getName())
        {
            case "Developer": System.out.println("Đây là Developer"); break;
            default: System.out.print("Người này không phải Developer");
        }
    }
    public static void question8(Account account)
    {
        System.out.println("Account: " + account.id + "\nFullName: "+ account.fullname + "\nEmail: " + account.email + "\nPhòng ban: " + account.department.getName());
    }
    public static void question9(Department department)
    {
        System.out.println("ID: " + department.id + " Tên phòng ban: " + department.name);
    }
    public static void question10(Account[] account)
    {
        for (Account account1 : account)
        {
            System.out.println("Account: " + account1.id + "\nFullName: "+ account1.fullname + "\nEmail: " + account1.email + "\nPhòng ban: " + account1.department.getName());
        }
    }
    public static void question11(Department[] departments)
    {
        for(Department department : departments)
        {
            for (int i = department.id ; i <= 2; i++)
            {
                System.out.println("ID: " + department.id + "\nTên phòng ban: " + department.name);
            }
        }
    }
    public static void question13(Account[] account)
    {
        for (Account account1 : account)
        {
            if(account1.id == 2)
            {
                continue;
            }
            System.out.println("Account: " + account1.id + "\nFullName: "+ account1.fullname + "\nEmail: " + account1.email + "\nPhòng ban: " + account1.department.getName());
        }
    }
    public static void question14(Account[] account)
    {
        for(Account account1 : account)
        {
            for(int i = account1.id; i < 4; i++)
            {
                System.out.println("Account: " + account1.id + "\nFullName: "+ account1.fullname + "\nEmail: " + account1.email + "\nPhòng ban: " + account1.department.getName());
            }
        }
    }
    public static void question15()
    {

            for(int i = 2; i < 20; i += 2)
            {
                System.out.println(i);
            }
    }
    }
