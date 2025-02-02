package com.example.movie_app.service;

import com.example.movie_app.dto.MovieDto;
import com.example.movie_app.entity.Movie;

import java.util.List;
import java.util.Optional;

public interface MovieService {
    public Iterable<Movie> getAllMovies ();
    public Movie getMovieItemById(Long id);

    public Long addMovie(MovieDto movie);

    public MovieDto updateMovie(Long id, MovieDto updatedData);

    public void deleteMovie(Long id);

    List<String> getPostersByMovieId(Long id);
}
