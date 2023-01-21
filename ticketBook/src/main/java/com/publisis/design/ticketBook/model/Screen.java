package com.publisis.design.ticketBook.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class Screen {

    @Id
    private Long id;
    private String name;

}
