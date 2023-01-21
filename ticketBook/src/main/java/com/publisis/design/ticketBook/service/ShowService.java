package com.publisis.design.ticketBook.service;

import com.publisis.design.ticketBook.exception.CinemaNotFoundException;
import com.publisis.design.ticketBook.model.Show;
import com.publisis.design.ticketBook.model.request.RegisterShow;
import com.publisis.design.ticketBook.repository.CompositeShowResponse;

import java.util.List;

public interface ShowService {

    List<Show> getShowsByTheaterId(Long theaterId);

    List<CompositeShowResponse> getShowsByMovie(String movieName);

	void addShow(RegisterShow request) throws CinemaNotFoundException;
}
