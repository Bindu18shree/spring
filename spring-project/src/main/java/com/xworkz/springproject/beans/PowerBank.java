package com.xworkz.springproject.beans;

import lombok.*;
import org.springframework.stereotype.Component;

@Getter
@Setter
@AllArgsConstructor
@ToString
@Component
public class PowerBank {

    public PowerBank(){
        System.out.println("Creating powerbank object...!");
    }

    private int id;
    private String brand;
    private int noOfPorts;
    private int noOfUSBPorts;
    private double price;
}
