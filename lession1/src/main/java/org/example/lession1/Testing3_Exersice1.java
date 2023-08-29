package org.example.lession1;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Random;
import java.util.Scanner;

public class Testing3_Exersice1 {
    public static void main (String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        // Tạo đối tượng Department
        Department hrDepartment = new Department(1, "HR");
        Department itDepartment = new Department(2, "IT");

        // Tạo đối tượng Position
        Position developerPosition = new Position(1, "Developer");
        Position designerPosition = new Position(2, "Designer");

        // Tạo đối tượng Group
        Group group1 = new Group(1, "Developers");
        Group group2 = new Group(2, "Designers");
        Account account1 = new Account(1, "john.doe@example.com", "john.doe", "John Doe",
                hrDepartment, developerPosition, LocalDateTime.of(2022, 1, 1,12,00,00), new Group[]{group1});
        question1(account1,scanner);
        question2();
        question3();
        question4(scanner);
        scanner.close();
    }
    public static void question1(Account account, Scanner scanner)
    {

        System.out.println("QUESTION1");
        System.out.println("Mời bạn nhập mức lương của account" );
        account.wage = scanner.nextFloat();
        System.out.println("Lương của Account là: "+ (int) account.wage);
    }
    public static void question2()
    {
        Random random = new Random();
        int a = random.nextInt(10000);
        String format = String.format("%05d", a);
        System.out.println("QUESTION2");
        System.out.println("Số ngẫu nhiên có năm chữ số: " + format);
    }
    public static void question3()
    {
        Random random = new Random();
        int a = random.nextInt(10000);
        int lastTwoDigits = a % 100;
        String format = String.format("%05d", a);
        System.out.println("QUESTION3");
        System.out.println("Số ngẫu nhiên có năm chữ số: " + format);
        System.out.println("Hai chữ số cuối cùng là: " + lastTwoDigits);
    }
    public static void question4(Scanner scanner)
    {
        System.out.println("QUESTION4");
        System.out.println("Mời bạn nhập vào số nguyên thứ nhất: ");
        int a = scanner.nextInt();
        System.out.println("Mời bạn nhập vào số nguyên thứ hai: ");
        int b = scanner.nextInt();
        if (b == 0)
        {
            System.out.println("Không thể chia cho 0");
        }
        else
        {
            float ketqua = (float) a/b;
            System.out.println("Thương của " + a + " và " + b + " là: " + ketqua);}
    }
}
