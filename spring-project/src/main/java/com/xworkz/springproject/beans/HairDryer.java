package com.xworkz.springproject.beans;

import lombok.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Component
public class HairDryer {

    @Value("1")
    private int id;
    @Value("Philips")
    private String brand;
    @Value("2")
    private int noOfSpeed;
    @Value("Black")
    private String color;
    @Value("1599.00")
    private double price;
}
