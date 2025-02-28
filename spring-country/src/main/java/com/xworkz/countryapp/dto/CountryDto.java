package com.xworkz.countryapp.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@ToString
@AllArgsConstructor
public class CountryDto {

    private Integer id;
    private String name;
    private Integer noOfStates;
    private Long population;
}
