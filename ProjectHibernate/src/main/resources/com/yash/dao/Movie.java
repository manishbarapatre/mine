package com.yash.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "trn_movies")
public class Movie {

	@Id
	@GeneratedValue
	@Column(name = "movie_id")
	private Long movieId;

	@Column(name = "title")
	private String title;

	@Column(name = "release_year")
	private long releaseYear;

	@Column(name = "director")
	private String director;
	
	@Column(name = "actor")
	private String actor;

	public Long getMovieId() {
		return movieId;
	}

	public void setMovieId(Long movieId) {
		this.movieId = movieId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public long getReleaseYear() {
		return releaseYear;
	}

	public void setReleaseYear(long releaseYear) {
		this.releaseYear = releaseYear;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}
	
	public String getActor() {
		return actor;
	}

	public void setActor(String actor) {
		this.actor = actor;
	}

	public void tostring(){
		System.out.println("---------Movie------------");
		System.out.println("movieId		: "+this.movieId);
		System.out.println("director	: "+this.director);
		System.out.println("releaseYear	: "+this.releaseYear);
		System.out.println("title		: "+this.title);
		System.out.println("actor		: "+this.actor);
		System.out.println("--------------------------");
	}
	
	
	
}