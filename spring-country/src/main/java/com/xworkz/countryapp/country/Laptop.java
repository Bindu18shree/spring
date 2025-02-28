package com.xworkz.countryapp.country;

import com.xworkz.countryapp.politician.HardDisk;
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
public class Laptop {

    @Value("1")
    private int id;
    @Value("Dell")
    private String brand;
    @Value("85900.00")
    private double price;
    @Autowired
    private HardDisk hardDisk;
}
