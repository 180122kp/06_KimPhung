package org.example.lession1;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public class Account {
    int id;
    String email;
    String username;
    String fullname;
    Department department;
    Position position;
    LocalDateTime createDate;
    Group[] groups;
    float wage;
    public Account(int id, String email, String username, String fullname,
                   Department department, Position position, LocalDateTime createDate, Group[] groups) {
        this.id = id;
        this.email = email;
        this.username = username;
        this.fullname = fullname;
        this.department = department;
        this.position = position;
        this.createDate = createDate;
        this.groups = groups;
    }

    public Account() {

    }

    public Account(String email, String username, String fullname, LocalDateTime dateTime) {
        this.email = email;
        this.username = username;
        this.fullname = fullname;
        this.createDate = dateTime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFullname() {
        return fullname ;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public LocalDateTime getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDateTime createDate) {
        this.createDate = createDate;
    }

    public Group[] getGroups() {
        return groups;
    }

    public void setGroups(Group[] groups) {
        this.groups = groups;
    }

    public float getWage() {
        return wage;
    }

    public void setWage(float wage) {
        this.wage = wage;
    }
}
