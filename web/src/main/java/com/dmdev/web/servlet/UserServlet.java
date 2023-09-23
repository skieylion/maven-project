package com.dmdev.web.servlet;

import com.dmdev.service.service.UserService;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.function.Supplier;

@WebServlet("/users")
public class UserServlet extends HttpServlet {
    protected final UserService userService = new UserService();

    protected void doGet(HttpServletRequest request, HttpServletResponse response) {
        userService.getUser(1L);
    }
}
