package com.xworkz.countryapp.repositary;

import com.xworkz.countryapp.entity.CountryEntity;

public interface CountryRepo {

    boolean save(CountryEntity countryEntity);
}
