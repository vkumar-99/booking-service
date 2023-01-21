package com.publisis.design.ticketBook.model;


import lombok.Data;

@Data
public class Seat {

    private Long id;
    private String seatName;
    private boolean booked;
}
