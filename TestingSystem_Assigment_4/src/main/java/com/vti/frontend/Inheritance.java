package com.vti.frontend;

import com.vti.backend.QLCB;
import com.vti.entity.CanBo;

import java.util.Scanner;

public class Inheritance {
    public static void main(String[] args) {
        QLCB qlcb = new QLCB();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Chọn chức năng:");
            System.out.println("1. Thêm mới cán bộ");
            System.out.println("2. Tìm kiếm theo họ tên");
            System.out.println("3. Hiển thị thông tin danh sách cán bộ");
            System.out.println("4. Xóa cán bộ theo tên");
            System.out.println("5. Thoát");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    CanBo canbo = new CanBo();
                    System.out.println("Nhập họ và tên cán bộ");
                    String name = scanner.nextLine();
                    System.out.println("Nhập tuổi cán bộ");
                    int age = scanner.nextInt();
                    System.out.println("Nhập giới tính cán bộ");
                    String gender = scanner.nextLine();
                    System.out.println("Nhập địa chỉ cán bộ");
                    String address = scanner.nextLine();
                    canbo.setName(name);
                    canbo.setAge(age);
                    canbo.setGender(gender);
                    canbo.setAddress(address);
                    qlcb.themMoiCanBo(canbo);
                    break;
                case 2:
                    String searchname = "Nguyễn";
                    qlcb.timKiemTheoHoTen(searchname);
                    break;
                case 3:
                    qlcb.hienThiDanhSachCanBo();
                    break;
                case 4:
                    String delName = "An";
                    qlcb.xoaCanBoTheoTen(delName);
                    break;
                case 5:
                    System.out.println("Đã thoát khỏi chương trình.");
                    System.exit(0);
                default:
                    System.out.println("Chọn không hợp lệ. Vui lòng chọn lại.");
            }
        }
    }
}