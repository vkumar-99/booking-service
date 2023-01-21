package com.publisis.design.ticketBook.repository;

import lombok.Data;

import java.sql.Date;
import java.sql.Time;

@Data
public class CompositeShowResponse {

    private String title;
    private String cinema_name;
    private Date show_date;
    private Time start_time;
    private Time end_time;
    private String city;
}
