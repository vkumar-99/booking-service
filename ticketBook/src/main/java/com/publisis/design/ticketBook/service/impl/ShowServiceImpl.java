package com.publisis.design.ticketBook.service.impl;

import com.publisis.design.ticketBook.model.*;
import com.publisis.design.ticketBook.repository.MovieRepository;
import com.publisis.design.ticketBook.repository.ScreenRepository;
import com.publisis.design.ticketBook.repository.ShowRepository;
import com.publisis.design.ticketBook.repository.TheaterRepository;
import com.publisis.design.ticketBook.service.ShowService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ShowServiceImpl implements ShowService {

    private final ShowRepository showRespository;
    private final ScreenRepository screenRepository;
    private final MovieRepository movieRepository;
    private final TheaterRepository theaterRepository;

    @Override
    public List<Show> getShowsByTheaterId(Long theaterId) {
       // List<Screen> screenList = screenRepository.findByTheaterId(theaterId);
       /* return screenList.stream().map(Screen::getId)
                .map(id -> showRespository.findByScreenId(id)).flatMap(List::stream)
                .collect(Collectors.toList());*/
        return null;
    }

    @Override
    public List<Show> getShowsByMovie(String movieName) {
        return null;
    }
}
