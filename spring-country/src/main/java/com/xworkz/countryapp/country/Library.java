package com.xworkz.countryapp.country;

import com.xworkz.countryapp.politician.Book;
import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Component
public class Library {

    @Value("1")
    private int id;
    @Value("City Central Library")
    private String libraryName;
    @Value("Malleshwaram")
    private String location;
    @Value("560003")
    private int pincode;
    @Autowired
    private Book book;
}
