package com.xworkz.countryapp.country;

import com.xworkz.countryapp.politician.Stand;
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
public class Tv {

    @Value("1")
    private int id;
    @Value("Sony")
    private String brand;
    @Value("65.0f")
    private float sizeInInches;
    @Autowired
    private Stand stand;
}
