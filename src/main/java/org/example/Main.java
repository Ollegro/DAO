package org.example;


import org.example.service.UserService;
import org.example.service.UserServiceImpl;


public class Main {
    public static void main(String[] args) {
        // Дописать 2 метода clean, userRemoveId
        // Создать подобное приложение но вместо model User использовать model Car с произвольными полями

        UserService userService = new UserServiceImpl();
        userService.createTable();
        userService.saveUser("Max", 20, "CEO", true);
        userService.saveUser("Artur", 25, "Manager", false);
        userService.saveUser("Anna", 30, "Programming", false);
        userService.saveUser("Oleg", 50, "Spielbracher", false);

        userService.removeUserById(2);
        System.out.println(userService.getUserById(1));
        userService.getAllUser().forEach(System.out::println);
        userService.getUserById(2);
        userService.dropTable();


        try {
            userService.cleanUserTable();
            userService.getAllUser().forEach(System.out::println);
        } catch (Exception e) {
            System.out.println("Причина ошибки _ " + e.getCause());

            e.printStackTrace();


        }


    }
}