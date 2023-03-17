package org.example.service;

import org.example.model.User;

import java.util.List;

public interface UserService {
    void createTable();

    void dropTable();

    void addUser(String name, int age, String position, boolean isTopManager);

    void removeUserById(int id);

    User getUserById(int id);

    List<User> getAllUser();

    void cleanUserTable() ;
}
