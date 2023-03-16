package org.example.dao;

import org.example.model.User;

import java.util.ArrayList;
import java.util.List;

public class UserDaoImpl implements UserDAO {
    List<User> userList;
    int id;

    @Override
    public void createTable() {
        userList = new ArrayList<>();
    }

    @Override
    public void dropTable() {
        userList = null;
    }

    @Override
    public void saveUser(String name, int age, String position, boolean isTopManager) {
        userList.add(new User(++id, name, age, position, isTopManager));
        System.out.println("User id:" + id + " с именем " + name + " добавлен в БД");
    }

    @Override
    public void removeUserById(int id) {
        for (int i = 0; i < userList.size(); i++) {
            if (userList.get(i).getId() == id) {
                userList.remove(i);
                return;
            }
        }

        System.out.println("Error user not found");
    }

    @Override
    public User getUserById(int id) {

        return userList.get(id);

    }

    @Override
    public List<User> getAllUser() {
        if (userList != null) {
            return userList;
        } else {
            System.out.println("Список userList пустой!");
        }
        return null;
    }

    @Override
    public void cleanUserTable() {
        userList.clear();
    }
}
