package org.example.lession1;

import java.util.Scanner;
import org.apache.commons.text.WordUtils;
public class Testing3_Exersice3 {
    public static void main (String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        Group[] groups = {new Group(1,"Java"),
                            new Group(2,"Python"),
                            new Group(3,"C#"),
                            new Group(4,"Java Python"),
        };
        //question1(scanner);
      //  question2(scanner);
      //  question3(scanner);
      //  question4(scanner);
      //  question5(scanner);
       // question6(scanner);
        //question7(scanner);
        question8(groups);
        scanner.close();
    }
    public static void question1(Scanner scanner)
    {
        System.out.println("QUESTION1");
        System.out.print("Nhập một xâu kí tự: ");
        String inputString = scanner.nextLine();
        String replace = inputString.replaceAll("\\s+", "");
        System.out.println("Số lượng từ trong xâu là: " + replace.length());
    }
    public static void question2(Scanner scanner)
    {
        System.out.println("QUESTION2");
        System.out.print("Nhập một xâu kí tự thứ nhất: ");
        String s1 = scanner.nextLine();
        System.out.print("Nhập một xâu kí tự thứ hai: ");
        String s2 = scanner.nextLine();
        String result = s1.concat(s2);
        System.out.println("Kết quả: "+ result);
    }
    public static void question3(Scanner scanner)
    {
        System.out.println("QUESTION3");
        System.out.print("Nhập tên của bạn: ");
        String name = scanner.nextLine();
        if (name == null || name.isEmpty())
        {
            System.out.println("Bạn đã nhập một chuỗi rỗng");
        }
        String capitalized = WordUtils.capitalize(name);
        System.out.println("Tên của bạn là: " + capitalized);
    }
    public static void question4(Scanner scanner)
    {
        System.out.println("QUESTION4");
        System.out.print("Nhập tên của bạn: ");
        String name = scanner.nextLine();
        String capitalized = WordUtils.capitalize(name);
        for (int i = 0; i < capitalized.length();i++)
        {
            char character = capitalized.charAt(i);
            System.out.println("Ký tự thứ " + (i + 1) + " là: " + character);
        }
    }
    public static void question5(Scanner scanner)
    {
        System.out.println("QUESTION5");
        System.out.print("Nhập họ của bạn: ");
        String s1 = scanner.nextLine();
        System.out.print("Nhập tên của bạn: ");
        String s2 = scanner.nextLine();
        String space = " ";
        String result = s1.concat(space).concat(s2);
        System.out.println("Họ tên của bạn là "+ result);
    }
    public static void question6(Scanner scanner)
    {
        System.out.println("QUESTION6");
        System.out.print("Nhập họ và tên đầy đủ: ");
        String fullName = scanner.nextLine();

        String[] nameParts = fullName.split("\\s+"); // tách chuỗi dựa trên khoảng trắng

        if (nameParts.length >= 2) {
            String lastName = nameParts[0];
            String firstName = nameParts[nameParts.length - 1];
            StringBuilder middleNameBuilder = new StringBuilder(); //xây dựng chuỗi tên đệm
            for (int i = 1; i < nameParts.length - 1; i++) { //bắt đầu sau họ và kết thúc trước tên
                middleNameBuilder.append(nameParts[i]); // thêm phần tử vào chuỗi tên đệm StringBuilder
                if (i < nameParts.length - 2) { //thêm khoảng trắng vào giữa tên đệm
                    middleNameBuilder.append(" ");
                }
            }
            String middleName = middleNameBuilder.toString();
            System.out.println("Họ là: " + lastName);
            System.out.println("Tên đệm là: " + middleName);
            System.out.println("Tên là: " + firstName);
        } else {
            System.out.println("Vui lòng nhập đúng định dạng Họ Tên Đệm Tên");
        }
    }
    public static void question7(Scanner scanner)
    {
        System.out.println("QUESTION7");
        System.out.print("Nhập họ và tên đầy đủ: ");
        String fullName = scanner.nextLine();
        String replaced = fullName.replaceAll("\\s+", ""); //Xóa khoảng cách
        String spaced = fullName.replaceAll("\\s+"," ");
        String capitalizied = WordUtils.capitalize(spaced);
        System.out.println("a: Tên người dùng sau khi xóa dấu cách: " + replaced);
        System.out.println("b: Viết hoa : " + capitalizied);
    }
    public static void question8(Group[] group)
    {
        for (Group groups : group)
        {
            if (groups.name.contains("Java"))
            {
                System.out.println("Group: " + groups.id);
            }
        }
    }
}
