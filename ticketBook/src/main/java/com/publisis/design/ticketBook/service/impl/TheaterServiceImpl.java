package com.publisis.design.ticketBook.service.impl;

import com.publisis.design.ticketBook.model.Theater;
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

    @Override
    public List<Theater> getCinemaByCity(Long cityId) {
        return cinemaRepository.findByLocationId(cityId);
    }
}
