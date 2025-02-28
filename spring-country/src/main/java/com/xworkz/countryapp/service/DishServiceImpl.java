package com.xworkz.countryapp.service;

import com.xworkz.countryapp.dto.CountryDto;
import com.xworkz.countryapp.dto.DishDto;
import com.xworkz.countryapp.entity.CountryEntity;
import com.xworkz.countryapp.entity.DishEntity;
import com.xworkz.countryapp.repositary.CountryRepo;
import com.xworkz.countryapp.repositary.DishRepo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import java.util.Set;

@Component
public class DishServiceImpl implements DishService {

    @Autowired
    private DishRepo dishRepo;

    @Override
    public boolean validateAndSave(DishDto dishDto) {

        boolean dishSave = false;

        ValidatorFactory validatorFactory = Validation.buildDefaultValidatorFactory();
        Validator validator = validatorFactory.getValidator();
        Set<ConstraintViolation<DishDto>> violations = validator.validate(dishDto);
        if (!violations.isEmpty()) {
            violations.stream().forEach(error -> System.out.println(error.getMessage()));

        }
        DishEntity dishEntity = new DishEntity();

        BeanUtils.copyProperties(dishDto, dishEntity);
        dishSave = dishRepo.save(dishEntity);
        return dishSave;
    }
}
