package com.publisis.design.ticketBook.service.impl;

import com.publisis.design.ticketBook.exception.CinemaNotFoundException;
import com.publisis.design.ticketBook.model.*;
import com.publisis.design.ticketBook.model.request.RegisterShow;
import com.publisis.design.ticketBook.repository.CompositeShowResponse;
import com.publisis.design.ticketBook.repository.MovieRepository;
import com.publisis.design.ticketBook.repository.ShowRepository;
import com.publisis.design.ticketBook.repository.TheaterRepository;
import com.publisis.design.ticketBook.service.ShowService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

@Service
@RequiredArgsConstructor
public class ShowServiceImpl implements ShowService {

    private final ShowRepository showRespository;
    private final MovieRepository movieRepository;
    private final TheaterRepository theaterRepository;

    @Override
    public List<Show> getShowsByTheaterId(Long theaterId) {
        return null;
    }

    @Override
    public List<CompositeShowResponse> getShowsByMovie(String movieName) {
        return showRespository.getShowListByMovie(movieName);
    }

	@Override
	public void addShow(RegisterShow request) throws CinemaNotFoundException {
		Theater theater = theaterRepository.findByName(request.getTheaterName());
		if(Objects.isNull(theater)) {
			throw new CinemaNotFoundException(request.getTheaterName()+ " theater not found. Please register your theater first");
		}
		Movie movie = movieRepository.findByTitleAndReleaseYear(request.getMovie().getTitle(), LocalDate.now().getYear());
		if(Objects.isNull(movie)) {
			movieRepository.save(request.getMovie());
		}
		Show show = new Show(request.getShowDate(), request.getStartTime(), request.getEndTime(), movie, theater);
		showRespository.save(show);
	}
}
