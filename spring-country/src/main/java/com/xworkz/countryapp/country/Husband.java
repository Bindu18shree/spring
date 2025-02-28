package com.xworkz.countryapp.country;

import com.xworkz.countryapp.politician.Wife;
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
public class Husband {

    @Value("1")
    private int id;
    @Value("Yash")
    private String name;
    @Autowired
    private Wife wife;
}
