package org.example.dao;

import org.example.model.User;

import java.util.ArrayList;
import java.util.List;

public class UserDaoImpl implements UserDAO {
    private List<User> userList;
    private int id;

    @Override
    public void createTable() {
        userList = new ArrayList<>();
    }

    @Override
    public void dropTable() {
        userList = null;
    }

    @Override
    public void addUser(String name, int age, String position, boolean isTopManager) {
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
        for (int i = 0; i < userList.size(); i++) {
            if (userList.get(i).getId() == id)
                return userList.get(i);
        }
        System.out.print("Индекса " + id + " нет !  ");
        return null;
    }

    @Override
    public List<User> getAllUser() {
        if (userList == null) {
            System.out.println("БД отсутствует!");
            return null;
        } else if (userList.isEmpty()) {
            System.out.println("БД есть, но пуста !");
            return userList;
        } else {
            System.out.println();
            return userList;
        }
    }

    @Override
    public void cleanUserTable() {
        userList.clear();
    }
}
