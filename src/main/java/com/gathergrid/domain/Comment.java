package com.gathergrid.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Objects;

@Entity
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String comment;
    private Integer rating;

    public Comment() {
    }

    public Comment(Long id, String comment, Integer rating) {
        this.id = id;
        this.comment = comment;
        this.rating = rating;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Comment comment1 = (Comment) o;
        return Objects.equals(comment, comment1.comment) && Objects.equals(rating, comment1.rating);
    }

    @Override
    public int hashCode() {
        return Objects.hash(comment, rating);
    }

    @Override
    public String toString() {
        return "Comment{" +
                "id=" + id +
                ", comment='" + comment + '\'' +
                ", rating=" + rating +
                '}';
    }
}
