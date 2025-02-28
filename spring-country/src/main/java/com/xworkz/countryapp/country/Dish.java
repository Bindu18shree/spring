package com.xworkz.countryapp.country;

import com.xworkz.countryapp.politician.Ingredient;
import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Component
public class Dish {

    @Value("1")
    private int id;
    @Value("Upma")
    private String dishName;
    @Value("South Indian")
    private String dishType;
    @Autowired
    private Ingredient ingredient;
}
