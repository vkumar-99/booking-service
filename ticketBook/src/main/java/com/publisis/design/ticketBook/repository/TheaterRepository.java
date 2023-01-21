package com.publisis.design.ticketBook.repository;

import com.publisis.design.ticketBook.model.Theater;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TheaterRepository extends JpaRepository<Theater, Long> {

    List<Theater> findByLocationId(Long id);
    
    Theater findByName(String name);
}
