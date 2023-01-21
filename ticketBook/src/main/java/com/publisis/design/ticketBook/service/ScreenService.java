package com.publisis.design.ticketBook.service;

import com.publisis.design.ticketBook.model.Movie;

import java.util.List;

public interface ScreenService {

    List<Movie> getMovieByTheaterId(Long id);
}
