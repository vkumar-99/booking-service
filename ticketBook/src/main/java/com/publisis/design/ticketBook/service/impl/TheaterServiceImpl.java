package com.publisis.design.ticketBook.service.impl;

import com.publisis.design.ticketBook.model.Location;
import com.publisis.design.ticketBook.model.Theater;
import com.publisis.design.ticketBook.model.request.RegisterTheaterRequest;
import com.publisis.design.ticketBook.repository.LocationRepository;
import com.publisis.design.ticketBook.repository.TheaterRepository;
import com.publisis.design.ticketBook.service.TheaterService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class TheaterServiceImpl implements TheaterService {

    private final TheaterRepository cinemaRepository;
    private final LocationRepository locationRepository;

    @Override
    public List<Theater> getCinemaByCity(Long cityId) {
        return cinemaRepository.findByLocationId(cityId);
    }
    
    @Override
    public void addTheater(RegisterTheaterRequest request) {
    	Location location = locationRepository.save(new Location(request.getCity()));
    	cinemaRepository.save(new Theater(request.getTheaterName(), location));
    }
}
