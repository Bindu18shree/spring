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
public class TableFan {

    @Value("1")
    private int id;
    @Value("Crompton")
    private String brand;
    @Value("High Flo Wave Plus")
    private String modelName;
    @Value("White")
    private String color;
    @Value("1799.90")
    private double price;
}
