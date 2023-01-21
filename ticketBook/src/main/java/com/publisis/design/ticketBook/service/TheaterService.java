package com.publisis.design.ticketBook.service;

import com.publisis.design.ticketBook.model.Theater;
import com.publisis.design.ticketBook.model.request.RegisterTheaterRequest;

import java.util.List;

public interface TheaterService {

    List<Theater> getCinemaByCity(Long cityId);

	void addTheater(RegisterTheaterRequest request);
}
