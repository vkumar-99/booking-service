package com.publisis.design.ticketBook.service;

import com.publisis.design.ticketBook.model.Theater;

import java.util.List;

public interface TheaterService {

    public List<Theater> getCinemaByCity(Long cityId);
}
