package com.xworkz.countryapp.politician;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Getter
@Setter
@NoArgsConstructor
@ToString
@Component
public class Movie {

    @Value("1")
    private int id;
    @Value("Pushpa 2")
    private String movieName;
    @Value("4.8")
    private float rating;
}
