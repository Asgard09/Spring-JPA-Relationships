package com.example.JPA.Model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Address {

    @Id
    //GenerationType.IDENTITY use to avoid generate the sequence table
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    private String location;

    //This field is not execute in database
    @OneToOne(mappedBy = "address")
    private Library library;
}
