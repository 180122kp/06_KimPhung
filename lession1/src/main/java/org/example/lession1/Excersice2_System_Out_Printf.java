package org.example.lession1;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Excersice2_System_Out_Printf {
    public static void main (String[] args)
    {
            // question 1
        question1(5);
            // question 2
        question2(10000000);
            // question 3
        question3(5.567098F);
            // question 4
        String a = "Nguyễn Văn A";
        question4(a);
            // question 5
        question5(LocalDateTime.now());
    }
    public static void question1(int a)
    {
        System.out.printf("Số nguyên là: %d", a);
    }
    public static void question2(int a)
    {
        System.out.printf("Số nguyên là: %,d", a);
    }
    public static void question3(float a)
    {
        System.out.printf("Số thực là: %.4f", a);
    }
    public static void question4(String a)
    {
        System.out.printf("Tên tôi là: \"%s\" và tôi đang độc thân", a);
    }
    public static void question5(LocalDateTime a)
    {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH'h':mm'p':ss's'");
        String formattedDateTime = now.format(formatter);

        System.out.printf("%s", formattedDateTime);
    }

}

