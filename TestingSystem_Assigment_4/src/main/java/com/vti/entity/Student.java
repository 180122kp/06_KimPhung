package com.vti.entity;

public class Student {
    private int id;
    private String name;
    private String hometown;
    private float score;
    public Student(String name,String hometown)
    {
        this.name = name;
        this.hometown = hometown;
        this.score = 0;
    }
    // Getter and Setter for id
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // Getter and Setter for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and Setter for hometown
    public String getHometown() {
        return hometown;
    }

    public void setHometown(String hometown) {
        this.hometown = hometown;
    }

    // Getter and Setter for score
    public float getScore() {
        return score;
    }
    public float addScore(float score)
    {
        return this.score += score;
    }

    public void setScore(float score) {
        this.score = score;
    }
    public void Information(Student student)
    {
        System.out.println("Information");
        System.out.println("Tên học sinh: "+ name);
        System.out.println("Quê Quán: " + hometown);
        if (score < 4.0) {System.out.println("Học lực Yếu");}
        else if (score >= 4.0 && score < 6.0) {System.out.println("Học lực Trung Bình");}
        else if (score >= 6.0 && score < 8.0) {System.out.println("Học lực Khá");}
        else if (score >= 8.0) {System.out.println("Học lực Giỏi");}
    }
}
