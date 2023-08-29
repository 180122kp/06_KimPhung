package org.example.TestingSystem_Assigment_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /* Question 1:
Viết chương trình nhập vào một số thực. Đơn vị tính cho số này là centimet
(cm).
Hãy in ra số tương đương tính bằng foot (số thực, có 2 số lẻ thập phân) và inch
(số thực, có 2 số lẻ thập phân).
Với 1 inch = 2.54 cm và 1 foot = 12 inches. */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời bạn nhập vào một số thực");
        float cm = scanner.nextFloat();
        float inch = (float) (cm/2.54);
        System.out.printf("Với " + cm + "cm, ta được: " + inch/12 + " feet");
         /* Question 2:
Viết chương trình nhập vào số giây từ 0 tới 68399, đổi số giây này thành dạng
[giờ:phút:giây], mỗi thành phần là một số nguyên có 2 chữ số.*/
        System.out.println("Mời bạn nhập vào số giây 0 -> 68399");
        int s = scanner.nextInt();
        if (s > 0 && s< 68399)
        {
            System.out.printf("Giờ: " + s/3600 + "Phút: " + (s%3600)/60 + "Giây: " + s%60);
        }
        else System.out.print("Bạn nhập không đúng");
    }
/* Question 3:
Viết chương trình nhập vào 4 số nguyên.
Hiển thị ra số lớn nhất và nhỏ nhất
Ví dụ:
nhập vào 4 số 1,2,3,4 thì kết quả là:
Số lớn nhất là: 4
Số nhỏ nhất là: 1 */
}