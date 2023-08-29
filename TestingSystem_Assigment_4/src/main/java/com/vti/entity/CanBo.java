package com.vti.entity;

public class CanBo {
    private String name;
    private int age;

    public CanBo() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    private String gender;
    private String address;
    public CanBo(String name,int age,String gender,String address)
    {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
    }
    public void printInfo()
    {
        System.out.println("Họ tên cán bộ: " + name);
        System.out.println("Tuổi cán bộ: " + age);
        System.out.println("Giới tính cán bộ: " + gender);
        System.out.println("Địa chỉ cán bộ: " + address);
    }
}
