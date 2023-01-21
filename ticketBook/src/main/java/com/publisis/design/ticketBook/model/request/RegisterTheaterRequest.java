package com.publisis.design.ticketBook.model.request;

import org.springframework.lang.NonNull;

import lombok.Data;

@Data
public class RegisterTheaterRequest {

	@NonNull
	private String city;
	@NonNull
	private String theaterName;
}
