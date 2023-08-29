package com.vti.entity;

public class CongNhan extends CanBo{
    private String bac;
    public CongNhan(String name,int age,String gender,String address, String bac)
    {
        super(name, age, gender, address);
        this.bac = bac;
    }
}
