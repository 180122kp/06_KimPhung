package org.example.lession1;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;

public class Exam {
    int id;
    String code;
    String title;
    CategoryQuestion[] categoryQuestion;
    int duration;
    Account[] account;
    LocalDateTime createDate;
    Question[] questions;
    public Exam(int id, String code, String title, int duration, LocalDateTime createDate)
    {
        this.id = id;
        this.code = code;
        this.title = title;
        this.duration=duration;
        this.createDate=createDate;
        this.account = new Account[0];
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public CategoryQuestion[] getCategoryQuestions() {
        return categoryQuestion;
    }

    public void setCategoryQuestions(CategoryQuestion[] categoryQuestions) {
        this.categoryQuestion = categoryQuestions;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public Account[] getAccount() {
        return account;
    }
    public void setAccounts(Account[] accounts) {
        this.account = accounts;
    }
    public LocalDateTime getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDateTime createDate) {
        this.createDate = createDate;
    }

    public Question[] getQuestions() {
        return questions;
    }

    public void setQuestions(Question[] questions) {
        this.questions = questions;
    }
}
