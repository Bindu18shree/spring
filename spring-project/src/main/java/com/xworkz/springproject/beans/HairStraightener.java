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
public class HairStraightener {

    private int id;
    private String brand;
    private float cordLengthInMeters;
    private String color;
    private double price;

    @Autowired
    public HairStraightener(@Value("1") int id,@Value("Ikonic") String brand,@Value("1.7") float cordLengthInMeters,@Value("Black and Gold") String color,@Value("3799.00") double price) {
        this.id = id;
        this.brand = brand;
        this.cordLengthInMeters = cordLengthInMeters;
        this.color = color;
        this.price = price;
    }
}
