package com.example.JPA.Model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable=false)
    private String title;

    @ManyToOne
    @JoinColumn(name="library_id")
    private Library library;

    @ManyToMany(mappedBy = "books")
    private List<Author> authors;
}
