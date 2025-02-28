package com.xworkz.countryapp.service;

import com.xworkz.countryapp.dto.CountryDto;
import com.xworkz.countryapp.dto.DishDto;

public interface DishService {

    boolean validateAndSave(DishDto dishDto);
}
