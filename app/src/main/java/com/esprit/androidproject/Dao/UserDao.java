package com.esprit.androidproject.Dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import com.esprit.androidproject.Entity.User;

import java.util.List;

@Dao
public interface UserDao {

    @Query("select * from user")
    public List<User> getall();
    @Insert
    public void adduser(User user);
    @Delete
    void delete(User user);





}
