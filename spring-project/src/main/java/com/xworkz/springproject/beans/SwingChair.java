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
public class SwingChair {

    @Value("1")
    private int id;
    @Value("Floor Decor")
    private String brand;
    @Value("17999.00")
    private double price;
    @Value("Black and Beige")
    private String color;

}
