package com.publisis.design.ticketBook.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class Location {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String city;
    @OneToMany
    private List<Theater> theaters;
}
