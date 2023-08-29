package com.vti.entity;

import java.time.LocalDate;
import java.util.Arrays;

public class Group {
        int id;
        String name;
        Account[] accounts;
        LocalDate createDate;
        public Group(int id, String name) {
            this.id = id;
            this.name = name;
            this.accounts = new Account[0];
        }

        public void addAccount(Account account) {
            Account[] newAccounts = Arrays.copyOf(accounts, accounts.length + 1);
            newAccounts[accounts.length] = account;
            accounts = newAccounts;
        }
        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public LocalDate getCreateDate() {
            return createDate;
        }

        public void setCreateDate(LocalDate createDate) {
            this.createDate = createDate;
        }

        public Account[] getAccounts() {
            return accounts;
        }

        public void setAccounts(Account[] accounts) {
            this.accounts = accounts;
        }
    }


