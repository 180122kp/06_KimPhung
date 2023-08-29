package com.vti.backend;

import com.vti.entity.CanBo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class QLCB {
    private List<CanBo> danhSachCanBo;

    public QLCB() {
        danhSachCanBo = new ArrayList<>();
    }

    public void themMoiCanBo(CanBo canBo) {
        danhSachCanBo.add(canBo);
        System.out.println("Thêm mới cán bộ thành công.");
    }

    public void timKiemTheoHoTen(String hoTen) {
        boolean timThay = false;
        for (CanBo canBo : danhSachCanBo) {
            if (canBo.getName().equalsIgnoreCase(hoTen)) {
                canBo.printInfo();
                timThay = true;
            }
        }
        if (!timThay) {
            System.out.println("Không tìm thấy cán bộ với họ tên: " + hoTen);
        }
    }

    public void hienThiDanhSachCanBo() {
        for (CanBo canBo : danhSachCanBo) {
            canBo.printInfo();
        }
    }

    public void xoaCanBoTheoTen(String hoTen) {
        Iterator<CanBo> iterator = danhSachCanBo.iterator();
        boolean daXoa = false;
        while (iterator.hasNext()) {
            CanBo canBo = iterator.next();
            if (canBo.getName().equalsIgnoreCase(hoTen)) {
                iterator.remove();
                System.out.println("Xóa cán bộ thành công.");
                daXoa = true;
            }
        }
        if (!daXoa) {
            System.out.println("Không tìm thấy cán bộ với họ tên: " + hoTen);
        }
    }
}
