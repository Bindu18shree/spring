package com.xworkz.userapp.service;

import com.xworkz.userapp.dto.UserDto;

import java.util.List;

public interface UserService {

    boolean validateAndSave(UserDto userDto);

    List<UserDto> getAllUsers();

    void deleteById(Integer id);


    UserDto getUserById(Integer id);

    boolean updateUser(UserDto userDto);
}
