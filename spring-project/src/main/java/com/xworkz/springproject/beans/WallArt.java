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
public class WallArt {

    private int id;
    private String theme;
    private double price;
    private String shape;

    @Autowired
    public WallArt(@Value("1") int id,@Value("Leaf") String theme ,@Value("775.00") double price,@Value("Rectangular") String shape) {
        this.id = id;
        this.theme = theme;
        this.price = price;
        this.shape = shape;
    }
}
