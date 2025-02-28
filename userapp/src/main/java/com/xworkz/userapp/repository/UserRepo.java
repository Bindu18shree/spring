package com.xworkz.userapp.repository;

import com.xworkz.userapp.dto.UserDto;
import com.xworkz.userapp.entity.UserEntity;

import java.util.List;

public interface UserRepo {

    boolean save(UserEntity userEntity);

    List<UserEntity> getAllUsers();

    void deleteById(Integer id);

    UserEntity getUserById(Integer id);

    boolean updateUser(UserEntity userEntity);
}
