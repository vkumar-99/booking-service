package com.publisis.design.ticketBook.repository;

import com.publisis.design.ticketBook.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Long> {

    Movie findByTitleAndReleaseYear(String title, int year);
}
