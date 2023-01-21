package com.publisis.design.ticketBook.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class Theater {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @OneToMany
    private List<Show> shows;
    @ManyToOne
    private Location location;
    
    
	public Theater(String name, Location location) {
		super();
		this.name = name;
		this.location = location;
	}
}
