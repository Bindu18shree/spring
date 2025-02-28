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
public class LEDBulb {

    @Value("1")
    private int id;
    @Value("Philips")
    private String brand;
    @Value("Cool white")
    private String lightColor;
    @Value("14")
    private int powerConsumptionInWatt;
    @Value("280.00")
    private double price;

}
