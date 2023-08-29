package org.example.lession1;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Exercise3_DateFormat {
    public static void main(String[] args)
    {
        //khởi tạo dữ liệu cho exam
        Exam exam = new Exam(1,"Exam001","Java Exam",60, LocalDateTime.now());
        // Tạo đối tượng Department
        Department hrDepartment = new Department(1, "HR");
        Department itDepartment = new Department(2, "IT");
        // Tạo đối tượng Group
        Group group1 = new Group(1, "Developers");
        Group group2 = new Group(2, "Designers");
        // Tạo đối tượng Position
        Position developerPosition = new Position(1, "Developer");
        Position designerPosition = new Position(2, "Designer");
        //khởi tạo account
        Account account1 = new Account(1, "john.doe@example.com", "john.doe", "John Doe",
                hrDepartment, developerPosition, LocalDateTime.of(2022, 1, 1,12,00,00), new Group[]{group1});

        //question 1
        question1(exam);
        //question 2
        question2(exam);
        //question 3
        question3(exam);
        //question 3
        question4(exam);
        //question 3
        question5(exam);
    }
    public static void question1(Exam exam)
    {
        // Định dạng createDate theo định dạng tiếng Việt
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy", new Locale("vi", "VN"));
        String formattedCreateDate = exam.getCreateDate().format(formatter);
        System.out.println("Thông tin Exam thứ 1:");
        System.out.println("ID: " + exam.getId());
        System.out.println("Code: " + exam.getCode());
        System.out.println("Title: " + exam.getTitle());
        System.out.println("Duration: " + exam.getDuration() + " minutes");
        System.out.println("Account: " + exam.getAccount());
        System.out.println("Create Date: " + formattedCreateDate);
    }
    public static void question2(Exam exam)
    {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH'h':mm'p':ss's'");
        System.out.printf("%s",exam.createDate.format(formatter));
    }
    public static void question3(Exam exam)
    {
        System.out.printf("%s",exam.createDate.getYear()); //in ra năm
    }
    public static void question4(Exam exam)
    {
        System.out.printf("In ra năm: %s",exam.createDate.getYear());//in ra năm
        System.out.printf("In ra tháng: %s",exam.createDate.getMonth()); //in ra tháng
    }
    public static void question5(Exam exam)
    {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/yyyy");
        System.out.printf("%s",exam.createDate.format(formatter));
    }
}
