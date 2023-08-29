package com.vti.entity;

public class NhanVien extends CanBo{
    String congViec;
    public NhanVien(String name,int age,String gender,String address,String congViec)
    {
        super(name, age, gender, address);
        this.congViec = congViec;
    }
}
