package org.example.TestingSystem_Assigment_5;

public class News implements INews{
    private int id;
    private String Title;
    private String PublishDate;
    private String Author;
    private String Content;
    private float AverageRate;
    int[]  Rates = new int[3];
    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPublishDate() {
        return PublishDate;
    }

    public void setPublishDate(String publishDate) {
        PublishDate = publishDate;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public String getContent() {
        return Content;
    }

    public void setContent(String content) {
        Content = content;
    }

    public float getAverageRate() {
        return AverageRate;
    }

    @Override
    public void Display() {
        System.out.println("Title: " + Title);
        System.out.println("PublishDate: " + PublishDate);
        System.out.println("Author: " + Author);
        System.out.println("AverageRate: " + AverageRate);
    }

    @Override
    public float Calculate() {
        float total = 0;
        for(int rate : Rates)
        {
            total += rate;
        }
        AverageRate = total/Rates.length;
        return AverageRate;
    }
}

