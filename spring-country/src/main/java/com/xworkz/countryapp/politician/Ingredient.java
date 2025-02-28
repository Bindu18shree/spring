package com.xworkz.countryapp.politician;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Getter
@Setter
@NoArgsConstructor
@ToString
@Component
public class Ingredient {

    @Value("1")
    private int id;
    @Value("Sooji Rava")
    private String name;

}
