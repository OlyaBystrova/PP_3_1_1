package com.example.com_pp_3_1_1.service;

import com.example.com_pp_3_1_1.model.User;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface UserService {
    User show(int id);

    void save(User user);

    void update(int id, User updatedUser);

    void delete(int id);

    List<User> getAllUsers();
}
