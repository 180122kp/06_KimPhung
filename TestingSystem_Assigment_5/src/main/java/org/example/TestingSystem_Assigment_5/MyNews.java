package org.example.TestingSystem_Assigment_5;

import java.util.ArrayList;
import java.util.Scanner;

public class MyNews {
    public static void main(String[] args)
    {
        ArrayList<News> newsList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("*******************************************");
        System.out.println("**       Mời bạn chọn chức năng          **");
        System.out.println("**      1. Insert news                   **");
        System.out.println("**      2. View list news                **");
        System.out.println("**      3. AverageRate                   **");
        System.out.println("**      4. Exit                          **");
        System.out.println("*******************************************");
        int a = scanner.nextInt();

        switch (a)
        {
            case 1:
                News news = new News();
                System.out.println("Title: ");
                news.setTitle(scanner.nextLine());
                System.out.println("PublishDate: ");
                news.setPublishDate(scanner.nextLine());
                System.out.println("Author: ");
                news.setAuthor(scanner.nextLine());
                System.out.println("Content: ");
                news.setAuthor(scanner.nextLine());
                for (int i = 0; i < 3; i++)
                {
                    System.out.println("Enter Rate" + (i + 1) + ": ");
                    news.Rates[i] = Integer.parseInt(scanner.nextLine());
                }
                newsList.add(news);
                System.out.println("News inserted successfully ");
                break;
            case 2:
                for (News n  : newsList)
                {
                    n.Display();
                }
                break;
            case 3:
                for(News n : newsList)
                {
                    n.Calculate();
                    n.Display();
                }
                break;
            case 4:
                System.out.println("Exiting the program...");
                scanner.close();
                System.exit(0);
            default: System.out.println("Invalid choice");
        }
    }
}
