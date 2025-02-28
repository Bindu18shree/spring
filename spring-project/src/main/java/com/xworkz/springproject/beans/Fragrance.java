package com.xworkz.springproject.beans;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Getter
@Setter
@AllArgsConstructor
@ToString
@Component
public class Fragrance {

    private int id;
    private String brand;
    private double price;
    private int quantityInML;

    @Autowired
    public Fragrance(@Value("1") int id,@Value("2499.00") double price,@Value("Victoria Secret") String brand,@Value("250") int quantityInML) {
        this.id = id;
        this.price = price;
        this.brand = brand;
        this.quantityInML = quantityInML;
    }
}
