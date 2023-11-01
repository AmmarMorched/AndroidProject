package com.esprit.androidproject.Entity;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
import androidx.room.RoomDatabase;
@Entity
public class User {

    @PrimaryKey(autoGenerate = true)
    private int id;
    @ColumnInfo
    private String full_name;
    @ColumnInfo
    private String password;
    @ColumnInfo
    private String email;
    @ColumnInfo
    private Long phone_num;

    public User() {

    }

    public User(int id, String full_name, String password, String email, Long phone_num) {
        this.id = id;
        this.full_name = full_name;
        this.password = password;
        this.email = email;
        this.phone_num = phone_num;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFull_name() {
        return full_name;
    }

    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getPhone_num() {
        return phone_num;
    }

    public void setPhone_num(Long phone_num) {
        this.phone_num = phone_num;
    }
}
