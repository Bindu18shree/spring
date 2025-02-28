package com.xworkz.springproject.beans;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Getter
@Setter
@NoArgsConstructor
@ToString
@Component
public class DiningTable {

    private int id;
    private String brand;
    private int size;
    private String material;
    private String color;

    @Autowired
    public DiningTable(@Value("1") int id,@Value("FURNITURE WALLET") String brand,@Value("6") int size,@Value("Sheesham Wood") String material,@Value("Walnut") String color) {
        this.id = id;
        this.brand = brand;
        this.size = size;
        this.material = material;
        this.color = color;
    }
}
