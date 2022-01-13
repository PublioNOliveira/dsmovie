package com.devsuperior.dsmovie.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperior.dsmovie.Repositories.MovieRepository;
import com.devsuperior.dsmovie.domain.entities.Movie;
import com.devsuperior.dsmovie.dto.MovieDTO;

@Service
public class MovieService {

	@Autowired
	private MovieRepository repository;
	
	// @Transactional Para garantir que o método irá resolver tudo que for da jpa de transação nessa camada de serviço
	// readOnly = true, diz que é um método só de leitura
	@Transactional(readOnly = true)
	public Page<MovieDTO> findAll(Pageable pageable){
		Page<Movie>	result = repository.findAll(pageable);
		Page<MovieDTO> page = result.map(x -> new MovieDTO(x));
		return page;
	}
	
	@Transactional(readOnly = true)
	public MovieDTO findById(Long id){
		Movie result = repository.findById(id).get();
		MovieDTO dto = new MovieDTO(result);
		return dto;
	}
	
}
