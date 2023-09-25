package com.dmdev;

import com.dmdev.database.dao.UserDao;

public class App {
    public static void main(String[] args) {
        UserDao userDao = new UserDao();
        userDao.findById(1L);
        System.out.println("Hello World!");
    }
}
