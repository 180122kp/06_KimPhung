package org.example.TestingSystem_Assigment_7.BackEnd;

public class MyMath {
    private final float pi = 3.14F;

    public static void Max(int a, int b) {
        try {
            if (a > b) {
                System.out.println(a);
            }
            System.out.println(b);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void Min(int a, int b) {
        try {
            if (a < b) {
                System.out.println(a);
            }
            System.out.println(b);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void Sum(int a, int b) {
        try {
            System.out.println(a + b);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void Sum_ex2(int a)
    {
        //không thay đổi được số pi
        System.out.println(a + pi);

    }

}
