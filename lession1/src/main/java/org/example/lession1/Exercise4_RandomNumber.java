package org.example.lession1;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Random;

public class Exercise4_RandomNumber {
    public static void main(String[] args)
    {
        Random random = new Random();
        int randomNumber = random.nextInt(); // Số nguyên ngẫu nhiên

        System.out.println("Số nguyên ngẫu nhiên: " + randomNumber);

        float randomNumber1 = random.nextFloat(); // số thực ngẫu nhiên
        System.out.println("Số thực ngẫu nhiên: " + randomNumber1);

        String[] names = { "Alice", "Bob", "Charlie", "David", "Emily", "Frank", "Grace" };
        int randomIndex = random.nextInt(names.length); // Chọn ngẫu nhiên một chỉ số trong khoảng từ 0 đến độ dài của mảng

        String randomName = names[randomIndex];

        System.out.println("Tên ngẫu nhiên: " + randomName);

        int minday = (int) LocalDate.of(1995, 12,20).toEpochDay();
        int maxday = (int) LocalDate.of(1995,07,24).toEpochDay();

        long randomInt = minday + random.nextInt(maxday - minday);
        LocalDate randomDay = LocalDate.ofEpochDay(randomInt);

        System.out.println(randomDay);


        LocalDate currentDate = LocalDate.now();
        LocalDate oneYearAgo = currentDate.minusYears(1);
        //tính số ngày từ 1 năm trước đến ngày hiện tại
        long daysBetween = oneYearAgo.toEpochDay() - currentDate.toEpochDay();
        //
        long randomDays = random.nextLong() % daysBetween;
        LocalDate randomDate = LocalDate.ofEpochDay(currentDate.toEpochDay() - randomDays);

        System.out.println("Ngày ngẫu nhiên trong khoảng một năm trở lại đây: " + randomDate);
      }
    public static void question1(int max,int min)
    {
        Random random = new Random();
        int randomNumber = random.nextInt(max - min + 1) + min;
        System.out.println("Số nguyên ngẫu nhiên từ " + min + "đến " + max + "là: " + randomNumber);
    }
}
