package ru.itis.itisrequestproject.service;

import ru.itis.itisrequestproject.dto.UserDto;

import java.util.List;

public interface UsersService {
    List<UserDto> getAllUsers();

    void deleteUser(Long userId);
}
