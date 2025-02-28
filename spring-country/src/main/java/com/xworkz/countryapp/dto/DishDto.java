package com.xworkz.countryapp.dto;

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
public class DishDto {


    private Integer id;
    private String dishName;
    private String dishType;
}
