package com.example.movie_app.controller;

import com.example.movie_app.dto.MovieDto;
import com.example.movie_app.dto.MoviePosterDto;
import com.example.movie_app.entity.Movie;
import com.example.movie_app.entity.MoviePoster;
import com.example.movie_app.service.MovieServiceImpl;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/movie")
public class MovieController {

    private final MovieServiceImpl movieServiceImpl;
    @Autowired
    public MovieController(MovieServiceImpl movieServiceImpl) {
        this.movieServiceImpl = movieServiceImpl;
    }

    @GetMapping("/home")
    public String selectAll (Model model) {
        Iterable<Movie> movieList = movieServiceImpl.getAllMovies();
        List<MovieDto> movies = new ArrayList<>();
        movieList.forEach( v->{
            movies.add(new ModelMapper().map(v, MovieDto.class));
        });
        model.addAttribute("movies", movies);
        return "list";
    }
    @GetMapping("/{id}")
    public String selectMovie (@PathVariable Long id, Model model) {
        Movie searched = movieServiceImpl.getMovieItemById(id);
        MovieDto movieDto = new ModelMapper().map(searched, MovieDto.class);
        model.addAttribute("movie", movieDto);
        System.out.println(movieDto.getReleaseDate());
        List<String> posterUrls = movieServiceImpl.getPostersByMovieId(id);
        model.addAttribute("posters", posterUrls);

        return "detail";
    }
    @PostMapping("/new")
    public String addNew(@RequestBody MovieDto newData) {
        movieServiceImpl.addMovie(newData);
        return "redirect:/movie/home";
    }
    @GetMapping("/{id}/update")
    public String updateMovieForm(@PathVariable Long id, Model model){
        Movie searched = movieServiceImpl.getMovieItemById(id);
        MovieDto movieDto = new ModelMapper().map(searched, MovieDto.class);
        model.addAttribute("movie", movieDto);
        return "edit";
    }
    @PostMapping("/{id}/update")
    public String updateMovie(@PathVariable Long id, @RequestBody MovieDto updatedData){
        MovieDto updatedMovie = movieServiceImpl.updateMovie(id, updatedData);
        return "redirect:/movie/" + updatedMovie.getId(); // 해당 영화 상세 페이지로 리다이렉트
    }
    @PostMapping ("/{id}/delete")
    public String deleteMovie (@PathVariable Long id) {
        movieServiceImpl.deleteMovie(id);
        return "redirect:/movie/home"; // 삭제 후 영화 목록 페이지로 리다이렉트
    }


}
