package com.Q7;

public class Movi {

	int movieId;
	String movieName;
	int rating;
	public Movi(int movieId, String movieName, int rating) {
		super();
		this.movieId = movieId;
		this.movieName = movieName;
		this.rating = rating;
		
	}
	@Override
	public String toString() {
		return "Movie [movieId=" + movieId + ", movieName=" + movieName + ", rating=" + rating + "]";
	}

	
}
