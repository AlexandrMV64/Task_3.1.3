package com.myasnikov.springbood.crud.spring_boot_crud.model;

import jakarta.persistence.*;
import jakarta.persistence.Entity;
import lombok.Data;
@Data
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    @Column
    private String surname;

    @Column
    private int age;

}