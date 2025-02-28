package com.xworkz.springproject.beans;

import lombok.*;
import org.springframework.stereotype.Component;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Component
public class ElectricKettle {

    private int id;
    private String brand;
    private int capacityInML;
    private String color;
    private double price;

}
