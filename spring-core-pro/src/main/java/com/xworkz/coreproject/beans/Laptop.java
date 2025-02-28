package com.xworkz.coreproject.beans;

import lombok.*;
import org.springframework.stereotype.Component;

@Getter
@Setter
@AllArgsConstructor
@ToString
@Component
public class Laptop {

    public Laptop(){

        System.out.println("Laptop Object is created");
    }

    private int id;
    private String brand;
    private double price;


}
