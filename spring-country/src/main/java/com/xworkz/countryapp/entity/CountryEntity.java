package com.xworkz.countryapp.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "country_details")
public class CountryEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "country_id")
    private Integer id;
    @Column(name = "country_Name")
    private String name;
    @Column(name = "no_of_states")
    private Integer noOfStates;
    @Column(name = "population")
    private Long population;
}
