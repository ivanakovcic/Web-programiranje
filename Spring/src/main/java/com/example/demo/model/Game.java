package com.example.demo.model;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Game implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String description;
    private String url;
    private String thumbnailUrl;
    private java.time.LocalDateTime dateAdded;
    private boolean active;

    @ManyToOne
    private Category category;

    @OneToMany(mappedBy = "game")
    private Set<Statistics> stats = new HashSet<>();

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public String getUrl() { return url; }
    public void setUrl(String url) { this.url = url; }

    public String getThumbnailUrl() { return thumbnailUrl; }
    public void setThumbnailUrl(String thumbnailUrl) { this.thumbnailUrl = thumbnailUrl; }

    public Category getCategory() { return category; }
    public void setCategory(Category category) { this.category = category; }

    public java.time.LocalDateTime getDateAdded() { return dateAdded; }
    public void setDateAdded(java.time.LocalDateTime dateAdded) { this.dateAdded = dateAdded; }

    public boolean isActive() { return active; }
    public void setActive(boolean active) { this.active = active; }

    public Set<Statistics> getStats() { return stats; }
    public void setStats(Set<Statistics> stats) { this.stats = stats; }

    @OneToMany(mappedBy = "game", cascade = CascadeType.ALL)
    private Set<Achievement> achievements = new HashSet<>();

    public Set<Achievement> getAchievements() { return achievements; }

    public void setAchievements(Set<Achievement> achievements) { this.achievements = achievements; }

    @OneToMany(mappedBy = "game", cascade = CascadeType.ALL)
    private Set<Review> reviews = new HashSet<>();

    public Set<Review> getReviews() { return reviews; }
    public void setReviews(Set<Review> reviews) { this.reviews = reviews; }
}