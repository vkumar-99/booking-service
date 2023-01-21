package com.publisis.design.ticketBook.service.impl;

import com.publisis.design.ticketBook.model.Movie;
import com.publisis.design.ticketBook.model.Screen;
import com.publisis.design.ticketBook.repository.MovieRepository;
import com.publisis.design.ticketBook.repository.ScreenRepository;
import com.publisis.design.ticketBook.service.ScreenService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Slf4j
@RequiredArgsConstructor
public class ScreenServiceImpl implements ScreenService {

    private final ScreenRepository screenRepository;
    private final MovieRepository movieRepository;

    @Override
    public List<Movie> getMovieByTheaterId(Long id) {
        /*List<Screen> screens = screenRepository.findByTheaterId(id);
        List<Long> movieList = screens.stream().map(Screen::getMovieId).collect(Collectors.toList());
        return movieList.stream().map(x -> movieRepository.findById(x).orElse(null)).collect(Collectors.toList());*/
        return null;
    }
}
