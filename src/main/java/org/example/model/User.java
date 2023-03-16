package org.example.model;

import java.util.Objects;

public class User {
    //    String name, int age, String position, boolean isTopManager
    private int id;
    private String name;
    private int age;
    private String position;
    private boolean isTopManager;

    public User(int id, String name, int age, String position, boolean isTopManager) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.position = position;
        this.isTopManager = isTopManager;
    }

    public User() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public boolean isTopManager() {
        return isTopManager;
    }

    public void setTopManager(boolean topManager) {
        isTopManager = topManager;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", position='" + position + '\'' +
                ", isTopManager=" + isTopManager +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id == user.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
