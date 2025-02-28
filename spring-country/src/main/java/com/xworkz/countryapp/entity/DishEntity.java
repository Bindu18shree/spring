package com.xworkz.countryapp.entity;

import lombok.*;

import javax.persistence.*;

@Data
@Entity
@Table(name = "dish_table")
public class DishEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "dish_name")
    private String dishName;
    @Column(name = "dish_type")
    private String dishType;
}
