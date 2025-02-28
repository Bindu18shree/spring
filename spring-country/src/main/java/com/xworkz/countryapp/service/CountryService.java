package com.xworkz.countryapp.service;

import com.xworkz.countryapp.dto.CountryDto;

public interface CountryService {

    boolean validateAndSave(CountryDto countryDto);
}
