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
public class WeighingMachine {

    @Value("1")
    private int id;
    @Value("Eagle")
    private String brand;
    @Value("Tempered Glass")
    private String materialType;
    @Value("Silver")
    private String color;
    @Value("876.00")
    private double price;

}
