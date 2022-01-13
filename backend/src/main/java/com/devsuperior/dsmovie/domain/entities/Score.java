package com.devsuperior.dsmovie.domain.entities;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tb_score")
public class Score {
	
	//Quando se tem chave primária composta que no caso aqui é id do movie e o id do user, temos que criar
	//uma classe auxiliar que vamos chamar de ScorePK
	//Quando se faz a chave composta, deve-se dar o new para garantir que a chave será iniciada
	//@EmbeddedId pq é chave composta
	@EmbeddedId
	private ScorePK id = new ScorePK();
	
	private Double value;
	
	public Score(){
	}
	
	//Serve para informar o filme e associá-lo com o score, para associar deve-ser jogar o filme dentro do scorePK
	public void setMovie(Movie movie) {
		id.setMovie(movie);
	}
	
	// A mesma coisa do filme
	public void setUser(User user) {
		id.setUser(user);
	}

	public ScorePK getId() {
		return id;
	}

	public void setId(ScorePK id) {
		this.id = id;
	}

	public Double getValue() {
		return value;
	}

	public void setValue(Double value) {
		this.value = value;
	}
		
}
