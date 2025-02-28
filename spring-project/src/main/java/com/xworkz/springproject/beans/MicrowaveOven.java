package com.xworkz.springproject.beans;

import lombok.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Component
public class MicrowaveOven {

    @Value("1")
    private int id;
    @Value("IFB")
    private String brand;
    @Value("30")
    private int sizeInLitres;
    @Value("Convection")
    private String heatingMethod;
}
