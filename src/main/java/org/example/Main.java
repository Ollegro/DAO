package org.example;


import org.example.service.UserService;
import org.example.service.UserServiceImpl;


public class Main {
    public static void main(String[] args) {
        // Дописать 2 метода clean, userRemoveId
        // Создать подобное приложение но вместо model User использовать model Car с произвольными полями

        UserService userService = new UserServiceImpl();
        userService.createTable();
        userService.addUser("Max", 20, "CEO", true);
        userService.addUser("Artur", 25, "Manager", false);
        userService.addUser("Anna", 30, "Programming", false);
        userService.addUser("Oleg", 50, "Spielbracher", false);
        System.out.println();
        userService.removeUserById(2);
        userService.removeUserById(33);
        System.out.println();
        userService.getAllUser().forEach(System.out::println);
        System.out.println();
        // System.out.println(userService.getUserById(1));
        System.out.println(userService.getUserById(45));
        userService.getAllUser().forEach(System.out::println);
        userService.cleanUserTable();
        userService.getAllUser().forEach(System.out::println);
        userService.dropTable();
               try {
            userService.getAllUser().forEach(System.out::println);
        } catch (NullPointerException e) {
            System.out.println(e.getLocalizedMessage());
        }

    }
}