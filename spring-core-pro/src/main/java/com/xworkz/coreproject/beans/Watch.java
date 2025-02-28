package com.xworkz.coreproject.beans;

import lombok.*;
import org.springframework.stereotype.Component;

@Getter
@Setter
@AllArgsConstructor
@ToString
@NoArgsConstructor
@Component
public class Watch {

    private int id;
    private String brand;
    private double price;
}
