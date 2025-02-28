package com.xworkz.userapp.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "user_table")
@NamedQuery(name = "getAllData", query = "select entity from UserEntity entity")
@NamedQuery(name = "deleteById", query = "delete from UserEntity user where user.id=:id")
@NamedQuery(name = "getUserById", query = "select user from UserEntity user where user.id=:id")
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "first_Name")
    private String firstName;
    @Column(name = "last_Name")
    private String lastName;
    @Column(name = "email")
    private String email;
    @Column(name = "phone_Number")
    private Long phoneNumber;
}
