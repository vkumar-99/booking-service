package com.publisis.design.ticketBook.repository;

import com.publisis.design.ticketBook.model.Show;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ShowRepository extends JpaRepository<Show, Long> {

    @Query("select m.title,s.show_date,s.start_time,s.end_time,t.name as cinema_name,l.city from show s join movie m on s.movie_id=m.id join theater t on s.theater_id=t.id join location l on t.location_id=l.id where m.title=:movie_name")
    List<CompositeShowResponse> getShowListByMovie(@Param("movie_name") String movieName);
}
