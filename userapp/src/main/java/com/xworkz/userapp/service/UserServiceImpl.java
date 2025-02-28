package com.xworkz.userapp.service;

import com.xworkz.userapp.dto.UserDto;
import com.xworkz.userapp.entity.UserEntity;
import com.xworkz.userapp.repository.UserRepo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import java.util.*;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepo userRepo;

    @Override
    public boolean validateAndSave(UserDto userDto) {

        ValidatorFactory validatorFactory = Validation.buildDefaultValidatorFactory();
        Validator validator = validatorFactory.getValidator();
        Set<ConstraintViolation<UserDto>> violations = validator.validate(userDto);
        if (violations.isEmpty()) {
            violations.stream().forEach(error -> System.out.println(error.getMessage()));
        }

        UserEntity userEntity = new UserEntity();
        BeanUtils.copyProperties(userDto, userEntity);
        return userRepo.save(userEntity);
    }

    @Override
    public List<UserDto> getAllUsers() {

        List<UserDto> userDtos = new ArrayList<>();
        List<UserEntity> userEntities = userRepo.getAllUsers();

        Iterator<UserEntity> iterator = userEntities.iterator();
        while (iterator.hasNext()) {
            UserEntity user = iterator.next();
            UserDto userDto = new UserDto();
            BeanUtils.copyProperties(user, userDto);
            userDtos.add(userDto);

        }

        return userDtos;

    }

    @Override
    public void deleteById(Integer id) {
        userRepo.deleteById(id);
    }

    @Override
    public UserDto getUserById(Integer id) {

        UserDto userDto = new UserDto();
        UserEntity user=  userRepo.getUserById(id);
        BeanUtils.copyProperties(user, userDto);

        return userDto;
    }

    @Override
    public boolean updateUser(UserDto userDto) {
        boolean isUpdated = false;
        UserEntity userEntity = new UserEntity();
        if (userDto!=null){
            BeanUtils.copyProperties(userDto,userEntity);

            isUpdated= userRepo.updateUser(userEntity);
        }
        return isUpdated;
    }
}
