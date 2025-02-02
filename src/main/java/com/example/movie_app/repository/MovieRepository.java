package com.example.movie_app.repository;

import com.example.movie_app.entity.Movie;
import com.example.movie_app.entity.Movie;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface MovieRepository extends CrudRepository<Movie, Long> {
    @Query("SELECT mp.posterUrl FROM MoviePoster mp WHERE mp.movieId = :movieId")
    List<String> findPostersByMovieId(@Param("movieId") Long movieId);
}
