package com.xworkz.springproject.beans;

import lombok.*;
import org.springframework.stereotype.Component;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Component
public class InductionCookTop {

    private int id;
    private String brand;
    private String color;
    private int powerConsumptionInWatt;
    private String materialType;
    private double price;


}
