package org.example.lession1;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

public class Testing3_Exersice2 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        question1(scanner);
        scanner.close();
    }
    public static void question1(Scanner scanner)
    {
        Account[] account = new Account[1];
        System.out.println("QUESTION1");
        for (int i = 0; i < account.length; i++)
        {
            System.out.println("Mời bạn nhập email");
            String email = scanner.nextLine() + (i +1);
            System.out.println("Mời bạn nhập User Name:");
            String username = scanner.nextLine() + ( i + 1);
            System.out.println("Mời bạn nhập Full Name: ");
            String fullname = scanner.nextLine() + ( i+1);
            System.out.print("Nhập ngày tháng năm (dd/mm/yyyy HH:mm:ss): ");
            String dateInput = scanner.nextLine();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
            LocalDateTime dateTime = LocalDateTime.parse(dateInput, formatter);
            account[i] = new Account(email,username,fullname,dateTime);
        }
        for (Account accounts : account)
        {
            System.out.println("Email: " + accounts.getEmail());
            System.out.println("Username: " + accounts.getUsername());
            System.out.println("Full Name: " + accounts.getFullname());
            System.out.println("Create Date: " + accounts.getCreateDate());
            System.out.println();
        }
    }
}
