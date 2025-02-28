package com.xworkz.countryapp.country;

import com.xworkz.countryapp.politician.Movie;
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
public class Theatre {

    @Value("1")
    private int id;
    @Value("Prasanna Theatre")
    private String theatreName;
    @Value("Rajajinagar")
    private String location;
    @Autowired
    private Movie movie;
}
