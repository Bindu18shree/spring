package com.xworkz.springproject.beans;

import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Getter
@Setter
@NoArgsConstructor
@ToString
@Component
public class HeadPhones {

    private int id;
    private String brand;
    private double price;
    private String color;

    @Autowired
    public HeadPhones(@Value("1") int id,@Value("Sony") String brand,@Value("2569.90") double price,@Value("White") String color) {
        this.id = id;
        this.brand = brand;
        this.price = price;
        this.color = color;
    }
}
