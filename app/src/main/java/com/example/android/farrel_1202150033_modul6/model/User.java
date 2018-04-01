package com.example.android.farrel_1202150033_modul6.model;

/**
 * Created by TOSHIBA on 4/1/2018.
 */

public class User {

    String userId;
    String username;
    String email;

    public User() {
    }

    public User(String userId, String username, String email) {
        this.userId = userId;
        this.username = username;
        this.email = email;
    }

    public String getUserId() {
        return userId;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }
}