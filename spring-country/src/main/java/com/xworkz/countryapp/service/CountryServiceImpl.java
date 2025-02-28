package com.xworkz.countryapp.service;

import com.xworkz.countryapp.dto.CountryDto;
import com.xworkz.countryapp.entity.CountryEntity;
import com.xworkz.countryapp.repositary.CountryRepo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import java.util.Set;

@Component
public class CountryServiceImpl implements CountryService {

    @Autowired
    private CountryRepo countryRepo;

    @Override
    public boolean validateAndSave(CountryDto countryDto) {

        boolean countrySave = false;

        ValidatorFactory validatorFactory = Validation.buildDefaultValidatorFactory();
        Validator validator = validatorFactory.getValidator();
        Set<ConstraintViolation<CountryDto>> violations = validator.validate(countryDto);
        if (!violations.isEmpty()) {
            violations.stream().forEach(error -> System.out.println(error.getMessage()));

        }
        CountryEntity countryEntity = new CountryEntity();

        BeanUtils.copyProperties(countryDto, countryEntity);
        countrySave = countryRepo.save(countryEntity);
        return countrySave;

    }
}
