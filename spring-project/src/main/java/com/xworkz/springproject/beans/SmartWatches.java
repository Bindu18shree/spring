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
public class SmartWatches {

    private int id;
    private String brand;
    private String color;
    private boolean isWaterResistant;
    private int batteryLifeDays;
    private double price;

    @Autowired
    public SmartWatches(@Value("1") int id,@Value("FireBolt") String brand,@Value("Olive Green") String color,@Value("true") boolean isWaterResistant,@Value("7") int batteryLifeDays,@Value("4600.00") double price) {
        this.id = id;
        this.brand = brand;
        this.color = color;
        this.isWaterResistant = isWaterResistant;
        this.batteryLifeDays = batteryLifeDays;
        this.price = price;
    }
}
