package com.publisis.design.ticketBook.model.request;

import java.sql.Date;
import java.sql.Time;

import com.publisis.design.ticketBook.model.Movie;

import lombok.Data;

@Data
public class RegisterShow {

	private Date showDate;
	private Time startTime;
	private Time endTime;
	private String theaterName;
	private Movie movie;
}
