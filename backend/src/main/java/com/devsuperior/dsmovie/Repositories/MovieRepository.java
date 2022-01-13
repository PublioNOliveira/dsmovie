package com.devsuperior.dsmovie.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devsuperior.dsmovie.domain.entities.Movie;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Long>{

}
