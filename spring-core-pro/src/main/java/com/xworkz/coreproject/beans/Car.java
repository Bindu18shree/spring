package com.xworkz.coreproject.beans;

import lombok.*;
import org.springframework.stereotype.Component;

@Getter
@Setter
@AllArgsConstructor
@ToString
@NoArgsConstructor
@Component
public class Car {

    private int id;
    private String name;
    private String color;
    private double price;
}
