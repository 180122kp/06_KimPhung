package org.example.TestingSystem_Assigment_4;

import java.time.LocalDate;

public class Group {
    int id;
    String name;
    String creator;
    Account[] accounts;
    LocalDate createDate;

    public Group() {
    }

    public Group(String name, String creator, Account[] accounts, LocalDate createDate) {
        this.name = name;
        this.creator = creator;
        this.accounts = accounts;
        this.createDate = createDate;
    }

    public Group(String groupName, String creator, String[] usernames, LocalDate createDate) {
        this.name = groupName;
        this.creator = creator;
        this.createDate = createDate;

        // Initialize accounts array using the usernames
        this.accounts = new Account[usernames.length];
        for (int i = 0; i < usernames.length; i++) {
            this.accounts[i] = new Account(usernames[i]);
        }
    }
}

