package com.devsuperior.dsmovie.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devsuperior.dsmovie.domain.entities.Score;
import com.devsuperior.dsmovie.domain.entities.ScorePK;

@Repository
public interface ScoreRepository extends JpaRepository<Score, ScorePK>{

}
