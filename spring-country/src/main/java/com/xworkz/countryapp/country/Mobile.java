package com.xworkz.countryapp.country;

import com.xworkz.countryapp.politician.SimCard;
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
public class Mobile {

    @Value("1")
    private int id;
    @Value("Apple")
    private String brand;
    @Value("16")
    private int version;
    @Value("76989.990")
    private double price;
    @Autowired
    private SimCard simCard;

}
