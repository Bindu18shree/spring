package com.xworkz.coreproject.beans;

import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Getter
@Setter
@ToString
@NoArgsConstructor
@Component
public class Pen {

    private int id;
    private String brand;
    private double price;

    // another way of object creation
    @Autowired
    public Pen(@Value("2") int id,@Value("Renault") String brand,@Value("30.00") double price){
        this.id = id;
        this.brand = brand;
        this.price = price;
    }
}
