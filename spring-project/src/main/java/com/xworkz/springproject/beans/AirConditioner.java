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
public class AirConditioner {

    @Value("1")
    private int id;
    @Value("Blue Star")
    private String brand;
    @Value("1.5")
    private float capacityInTons;
    @Value("35990.90")
    private double price;
}
