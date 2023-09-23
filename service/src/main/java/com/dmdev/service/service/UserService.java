package com.dmdev.service.service;

import com.dmdev.database.dao.UserDao;
import com.dmdev.service.dto.UserDto;

import java.util.Optional;

public class UserService {
    private final UserDao userService = new UserDao();

    public Optional<UserDto> getUser(long id) {
        return userService.findById(id).map(u -> new UserDto());
    }
}
