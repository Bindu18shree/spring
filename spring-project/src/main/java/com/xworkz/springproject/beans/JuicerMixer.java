package com.xworkz.springproject.beans;

import lombok.*;
import org.springframework.stereotype.Component;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Component
public class JuicerMixer {

    private int id;
    private String brand;
    private double capacityInL;
    private int noOfJars;
    private double price;
}
