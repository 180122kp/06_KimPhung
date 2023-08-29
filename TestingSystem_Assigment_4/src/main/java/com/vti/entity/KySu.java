package com.vti.entity;

public class KySu extends CanBo{
    private String NganhDaoTao;
    public KySu(String name,int age,String gender,String address,String nganhDaoTao)
    {
        super(name,age,gender,address);
        this.NganhDaoTao = nganhDaoTao;
    }
}
