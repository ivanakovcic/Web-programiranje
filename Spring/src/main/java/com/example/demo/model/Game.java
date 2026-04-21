package com.example.demo.model;

import jakarta.persistence.*;
import java.io.Serializable; // OVA LINIJA NEDOSTAJE
import java.util.HashSet;
import java.util.Set;

@Entity
public class Game implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String description;
    private String url; // Putanja za iframe
    private String thumbnailUrl;

    @ManyToOne
    private Category category;

    @OneToMany(mappedBy = "game")
    private Set<Statistics> stats = new HashSet<>();

    // Getteri i Setteri...
}