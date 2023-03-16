package org.example.service;

import org.example.dao.UserDAO;
import org.example.dao.UserDaoImpl;
import org.example.model.User;

import java.util.List;

public class UserServiceImpl implements UserService {
    private final UserDAO userDAO = new UserDaoImpl();

    @Override
    public void createTable() {
        userDAO.createTable();
    }

    @Override
    public void dropTable() {
        userDAO.dropTable();
    }

    @Override
    public void saveUser(String name, int age, String position, boolean isTopManager) {
        userDAO.saveUser(name, age, position, isTopManager);
    }

    @Override
    public void removeUserById(int id) {
        userDAO.removeUserById(id);
    }

    @Override
    public User getUserById(int id) {
        try {
            return userDAO.getUserById(id - 1);
        } catch (IndexOutOfBoundsException e) {
            System.out.print(" id не может быть меньше 1. Возврат   _");
        }
        return null;
    }

    @Override
    public List<User> getAllUser() {
        return userDAO.getAllUser();
    }

    @Override
    public void cleanUserTable() {
        userDAO.cleanUserTable();
    }
}
