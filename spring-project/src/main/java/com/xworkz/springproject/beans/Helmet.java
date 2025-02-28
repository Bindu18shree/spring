package com.xworkz.springproject.beans;

import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Helmet {

    private int id;
    private String brand;
    private String color;
    private double price;

}
