package com.xworkz.countryapp.politician;

import lombok.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Getter
@Setter
@NoArgsConstructor
@ToString
@Component
public class Address {

    @Value("1")
    private int id;
    @Value("Nagasandra")
    private String streetName;
    @Value("560073")
    private int pincode;

}
