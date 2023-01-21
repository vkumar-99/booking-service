package com.publisis.design.ticketBook.service;

import com.publisis.design.ticketBook.model.Show;

import java.util.List;

public interface ShowService {

    List<Show> getShowsByTheaterId(Long theaterId);

    List<Show> getShowsByMovie(String movieName);
}
