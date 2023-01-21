package com.publisis.design.ticketBook.service.impl;

import com.publisis.design.ticketBook.model.Location;
import com.publisis.design.ticketBook.repository.LocationRepository;
import com.publisis.design.ticketBook.service.LocationService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class LocationServiceImpl implements LocationService {

    private final LocationRepository locationRepository;

    @Override
    public List<Location> getAvailableCities() {
        return locationRepository.findAll();
    }
}
