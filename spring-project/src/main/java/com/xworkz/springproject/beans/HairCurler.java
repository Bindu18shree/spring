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
public class HairCurler {

    private int id;
    private String brand;
    private float cordLengthInMeters;
    private String color;
    private double price;

    @Autowired
    public HairCurler(@Value("1") int id,@Value("Alan Truman") String brand,@Value("1.9") float cordLengthInMeters,@Value("Copper") String color,@Value("7921.980") double price) {
        this.id = id;
        this.brand = brand;
        this.cordLengthInMeters = cordLengthInMeters;
        this.color = color;
        this.price = price;
    }
}
