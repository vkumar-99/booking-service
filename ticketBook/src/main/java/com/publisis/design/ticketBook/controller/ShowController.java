package com.publisis.design.ticketBook.controller;

import com.publisis.design.ticketBook.exception.CinemaNotFoundException;
import com.publisis.design.ticketBook.model.Show;
import com.publisis.design.ticketBook.model.request.RegisterShow;
import com.publisis.design.ticketBook.repository.CompositeShowResponse;
import com.publisis.design.ticketBook.service.ShowService;
import lombok.RequiredArgsConstructor;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/v1/show")
@RequiredArgsConstructor
public class ShowController {

    private final ShowService showService;

    @GetMapping
    public List<Show> getShowsByTheater(Long theaterId) {
        return showService.getShowsByTheaterId(theaterId);
    }

    @GetMapping("/movie/{movie_name}")
    public List<CompositeShowResponse> getShowsByTheater(@PathVariable(value = "movie_name") String movieName) {
        return showService.getShowsByMovie(movieName);
    }
    
    @PostMapping
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void addShowsToCinema(@RequestBody RegisterShow request) throws CinemaNotFoundException {
    	showService.addShow(request);
    }


}
