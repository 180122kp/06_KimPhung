package org.example.TestingSystem_Assigment_3;

import java.time.LocalDate;

public class Account {
        int id;
        String email;
        String username;
        String fullname;
        Department department;
        Position position;
        LocalDate createDate;
        Group[] groups;
        public Account(int id, String email, String username, String fullname,
                       Department department, Position position, LocalDate createDate, Group[] groups) {
            this.id = id;
            this.email = email;
            this.username = username;
            this.fullname = fullname;
            this.department = department;
            this.position = position;
            this.createDate = createDate;
            this.groups = groups;
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

        public LocalDate getCreateDate() {
            return createDate;
        }

        public void setCreateDate(LocalDate createDate) {
            this.createDate = createDate;
        }

        public Group[] getGroups() {
            return groups;
        }

        public void setGroups(Group[] groups) {
            this.groups = groups;
        }
    }
