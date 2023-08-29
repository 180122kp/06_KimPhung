package org.example.TestingSystem_Assigment_5;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        // Tạo 10 học sinh và chia thành 3 nhóm
        for (int i = 0; i < 10; i++) {
            int group = i % 3 + 1;
            students.add(new Student(i + 1, "Nguyễn Văn " + (char) ('A' + i), group));
        }

        // Kêu gọi cả lớp điểm danh
        System.out.println("Điểm danh cả lớp:");
        for (Student student : students) {
            student.diemDanh();
        }

        // Gọi nhóm 1 đi học bài
        System.out.println("\nNhóm 1 đang học bài:");
        for (Student student : students) {
            if (student.getGroup() == 1) {
                student.hocBai();
            }
        }

        // Gọi nhóm 2 đi dọn vệ sinh
        System.out.println("\nNhóm 2 đi dọn vệ sinh:");
        for (Student student : students) {
            if (student.getGroup() == 2) {
                student.diDonVeSinh();
            }
        }
        // Gọi nhóm 2 đi dọn vệ sinh
        System.out.println("\nNhóm 3 điểm danh:");
        for (Student student : students) {
            if (student.getGroup() == 3) {
                student.diemDanh();
            }
        }
    }
}