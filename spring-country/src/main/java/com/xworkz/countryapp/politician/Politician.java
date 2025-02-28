package com.xworkz.countryapp.politician;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Politician {

    @Value("1")
    private int id;
    @Value("Thejasvi Surya")
    private String name;
}
