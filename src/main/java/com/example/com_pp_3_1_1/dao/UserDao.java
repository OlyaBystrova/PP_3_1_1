package com.example.com_pp_3_1_1.dao;

import com.example.com_pp_3_1_1.model.User;

import java.util.List;

public interface UserDao {

    User show(int id);

    void save(User user);

    void update(int id, User updatedUser);

    void delete(int id);

    List<User> getAllUsers();
}
