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
public class Trimmer {

    private int id;
    private String brand;
    private int rechargeTimeInMinutes;
    private String color;
    private double price;

    @Autowired
    public Trimmer(@Value("1") int id,@Value("Vega") String brand,@Value("90") int rechargeTimeInMinutes,@Value("White") String color,@Value("1409.00") double price) {
        this.id = id;
        this.brand = brand;
        this.rechargeTimeInMinutes = rechargeTimeInMinutes;
        this.color = color;
        this.price = price;
    }
}
