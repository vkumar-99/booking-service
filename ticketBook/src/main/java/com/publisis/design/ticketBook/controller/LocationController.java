package com.publisis.design.ticketBook.controller;

import com.publisis.design.ticketBook.model.Location;
import com.publisis.design.ticketBook.service.LocationService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/v1/location")
@RequiredArgsConstructor
public class LocationController {

    private final LocationService locationService;

    @GetMapping
    public ResponseEntity<List<Location>> getAvailableCities() {
        List<Location> availableCities = locationService.getAvailableCities();
        return ResponseEntity.ok(availableCities);
    }
}
