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
public class DryIron {

    private int id;
    private String brand;
    private float cableLengthInMeters;
    private int powerConsumptionInWatt;
    private double price;

    @Autowired
    public DryIron(@Value("1") int id,@Value("Havells") String brand,@Value("1.5f") float cableLengthInMeters,@Value("1000") int powerConsumptionInWatt,@Value("897.90") double price) {
        this.id = id;
        this.brand = brand;
        this.cableLengthInMeters = cableLengthInMeters;
        this.powerConsumptionInWatt = powerConsumptionInWatt;
        this.price = price;
    }
}
