package com.publisis.design.ticketBook.controller;

import com.publisis.design.ticketBook.model.Theater;
import com.publisis.design.ticketBook.model.request.RegisterTheaterRequest;
import com.publisis.design.ticketBook.service.TheaterService;
import lombok.RequiredArgsConstructor;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/v1/cinema")
@RequiredArgsConstructor
public class TheaterController {

    private final TheaterService theaterService;

    @GetMapping("/city/{id}")
    public ResponseEntity<List<Theater>> getCinemaByCity(@PathVariable(name = "id") Long cityId) {
        List<Theater> availableTheaters = theaterService.getCinemaByCity(cityId);
        return ResponseEntity.ok(availableTheaters);
    }
    
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void addTheater(@RequestBody RegisterTheaterRequest request) {
    	theaterService.addTheater(request);
    }
}
