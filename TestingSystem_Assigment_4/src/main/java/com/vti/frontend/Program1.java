package com.vti.frontend;
import com.vti.entity.Account;
import com.vti.entity.Group;
import com.vti.entity.Position;
import com.vti.entity.Department;
import com.vti.backend.Exercise1;
import java.time.LocalDateTime;

public class Program1 {
    public static void main(String[] args) {
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
                        hrDepartment, developerPosition, LocalDateTime.of(2022, 1, 1, 12, 00, 00), new Group[]{group1}),
                new Account(2, "jane.smith@example.com", "jane.smith", "Jane Smith",
                        itDepartment, designerPosition, LocalDateTime.of(2022, 1, 1, 12, 00, 00), new Group[]{group1}),
                new Account(3, "alice@example.com", "alice", "Alice",
                        hrDepartment, designerPosition, LocalDateTime.of(2022, 1, 1, 12, 00, 00), new Group[]{group2}),
                new Account(4, "bob@example.com", "bob", "Bob",
                        itDepartment, developerPosition, LocalDateTime.of(2022, 1, 1, 12, 00, 00), new Group[]{group2})
        };
        // tạo mảng department
        Department[] department1 = {
                new Department(1, "Sale"),
                new Department(2, "Marketing")
        };
        Account account1 = new Account(1, "john.doe@example.com", "john.doe", "John Doe",
                hrDepartment, developerPosition, LocalDateTime.of(2022, 1, 1, 12, 00, 00), new Group[]{group1});
        Account account2 = new Account(2, "jane.smith@example.com", "jane.smith", "Jane Smith",
                itDepartment, designerPosition, LocalDateTime.of(2022, 1, 1, 12, 00, 00), new Group[]{group1});
        Account account3 = new Account(3, "alice@example.com", "alice", "Alice",
                hrDepartment, designerPosition, LocalDateTime.of(2022, 1, 1, 12, 00, 00), new Group[]{group2});
        Account account4 = new Account(4, "bob@example.com", "bob", "Bob",
                itDepartment, developerPosition, LocalDateTime.of(2022, 1, 1, 12, 00, 00), new Group[]{group2});
        // add Account vào group
        group1.addAccount(account1);
        group1.addAccount(account2);
        Exercise1.question1(account2);
    }
}
