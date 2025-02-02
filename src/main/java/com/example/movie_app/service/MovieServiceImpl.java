package com.example.movie_app.service;

import com.example.movie_app.dto.MovieDto;
import com.example.movie_app.entity.Movie;
import com.example.movie_app.repository.MovieRepository;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Data
@Slf4j
public class MovieServiceImpl implements MovieService {
    private final MovieRepository movieRepository;

    @Autowired
    public MovieServiceImpl(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    @Override
    public Iterable<Movie> getAllMovies() {
        return movieRepository.findAll();
    }

    @Override
    public Movie getMovieItemById(Long id) {
        return movieRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Movie not found with id: " + id));
    }
    @Override
    public List<String> getPostersByMovieId(Long id) {
        return movieRepository.findPostersByMovieId(id);
    }

    @Override
    public Long addMovie(MovieDto movie) {
        Movie savedMovie = movieRepository.save(new ModelMapper().map(movie, Movie.class));
        return savedMovie.getId();
    }

    @Override
    public MovieDto updateMovie(Long id, MovieDto updatedData) {
        Movie movie = movieRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Movie not found with id: " + id)); // 영화가 없으면 예외 처리

        movie.setTitle(updatedData.getTitle());
        movie.setDirector(updatedData.getDirector());
        movie.setGenre(updatedData.getGenre());
        movie.setRating(updatedData.getRating());
//TODO: 파일 추가/제거하는 옵션

        movieRepository.save(movie);
        return new ModelMapper().map(movie, MovieDto.class);
    }

    @Override
    public void deleteMovie(Long id) {
        movieRepository.deleteById(id);
    }


}
