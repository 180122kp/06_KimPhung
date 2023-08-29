package com.vti.frontend;
import com.vti.entity.Student;
public class Encapsulation {
    public static void main(String[] args)
    {
        Student student = new Student("Kim Phụng","Bình Phước");
        student.setScore(6.0f);
        student.Information(student);
    }
}
