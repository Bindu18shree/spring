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
public class Speakers {

    @Value("1")
    private int id;
    @Value("JBL")
    private String brand;
    @Value("4")
    private float rating;
    @Value("26789.00")
    private double price;
    @Value("Black")
    private String color;
    @Value("2")
    private int noOfWarrantYears;
}
