package org.example.lession1;

import java.util.Scanner;

public class Exercise5_InputFromConsole {
    public static void main(String[] args)
    {
        question1();
        question2();
        question3();
        question4();
    }
    public static void question1()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời bạn nhập vào số nguyên thứ nhất: ");
        int a = scanner.nextInt();
        System.out.println("Mời bạn nhập vào số nguyên thứ hai: ");
        int b = scanner.nextInt();
        System.out.println("Mời bạn nhập vào số nguyên thứ ba: ");
        int c = scanner.nextInt();
        System.out.println("Các số nguyên bạn đã nhập là: "+  a + b + c);
        scanner.close();
    }
    public static void question2()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời bạn nhập vào số thực thứ nhất: ");
        float a = scanner.nextFloat();
        System.out.println("Mời bạn nhập vào số thực thứ hai: ");
        float b = scanner.nextFloat();
        System.out.println("Các số nguyên bạn đã nhập là: "+  a + b );
        scanner.close();
    }
    public static void question3()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời bạn nhập họ: ");
        String a = scanner.nextLine();
        System.out.println("Mời bạn nhập tên: ");
        String b = scanner.toString();
        System.out.println("Họ tên của bạn là" + a.concat(b) );
        scanner.close();
    }
    public static void question4()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập ngày sinh nhật của bạn (theo định dạng yyyy-MM-dd): ");
        String a = scanner.nextLine();
        System.out.println("Ngày sinh nhật của bạn là: " + a);
        scanner.close();
    }
    public static void question5(Position position)
    {

    }
}
