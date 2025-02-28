package com.xworkz.countryapp;

import com.xworkz.countryapp.config.SpringConfiguration;
import com.xworkz.countryapp.country.*;
import com.xworkz.countryapp.dto.CountryDto;
import com.xworkz.countryapp.dto.DishDto;
import com.xworkz.countryapp.politician.Address;
import com.xworkz.countryapp.service.CountryService;
import com.xworkz.countryapp.service.DishService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Runner {

    public static void main(String[] args) {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfiguration.class);

//        CountryService countryService = applicationContext.getBean(CountryService.class);
//
//        CountryDto countryDto = new CountryDto();
//        countryDto.setName("Sri Lanka");
//        countryDto.setNoOfStates(9);
//        countryDto.setPopulation(14000L);
//
//        countryService.validateAndSave(countryDto);

        DishService dishService = applicationContext.getBean(DishService.class);

        DishDto dishDto = new DishDto();

        dishDto.setDishName("Masala Dosa");
        dishDto.setDishType("South Indian");

        dishService.validateAndSave(dishDto);

//        Dish dish = applicationContext.getBean(Dish.class);
//
//        System.out.println(dish);
//
//        Theatre theatre = applicationContext.getBean(Theatre.class);
//
//        System.out.println(theatre);
//
//        Library library = applicationContext.getBean(Library.class);
//
//        System.out.println(library);
//
//        Address address = applicationContext.getBean(Address.class);
//
//        System.out.println(address);
//
//        Husband husband = applicationContext.getBean(Husband.class);
//
//        System.out.println(husband);
//
//        Mobile mobile = applicationContext.getBean(Mobile.class);
//
//        System.out.println(mobile);
//
//        Tv tv = applicationContext.getBean(Tv.class);
//
//        System.out.println(tv);
//
//        Laptop laptop = applicationContext.getBean(Laptop.class);
//
//        System.out.println(laptop);
    }
}
