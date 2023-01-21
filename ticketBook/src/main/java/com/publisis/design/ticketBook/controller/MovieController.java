package com.publisis.design.ticketBook.controller;

import com.publisis.design.ticketBook.model.Movie;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/v1/movie")
public class MovieController {

    @GetMapping("/theater/{id}")
    public ResponseEntity<List<Movie>> getMoviesByTheater(@PathVariable(name = "id") Long theaterId) {
        return null;
    }
}
