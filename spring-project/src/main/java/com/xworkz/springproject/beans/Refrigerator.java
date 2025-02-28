package com.xworkz.springproject.beans;

import lombok.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Component
public class Refrigerator {

    @Value("1")
    private int id;
    @Value("Haier")
    private String brand;
    @Value("602")
    private int capacityInLitres;
    @Value("Black Steel")
    private String color;


}
