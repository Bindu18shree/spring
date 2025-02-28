package com.xworkz.springproject.beans;

import lombok.*;
import org.springframework.stereotype.Component;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Component
public class CoffeeMaker {

    private int id;
    private String brand;
    private String color;
    private double price;
    private int capacityInML;
    private int wattage;
    private int voltage;
}
