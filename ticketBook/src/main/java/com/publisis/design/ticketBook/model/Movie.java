package com.publisis.design.ticketBook.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String description;
    private String duration;
    private String genre;
    @JsonProperty("cast")
    private String actingCast;
    private int releaseYear;
    @OneToMany
    private List<Show> shows;
}
