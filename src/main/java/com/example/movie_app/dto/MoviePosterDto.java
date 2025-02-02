package com.example.movie_app.dto;

import com.example.movie_app.entity.Movie;
import jakarta.persistence.*;
import lombok.Data;

@Data
public class MoviePosterDto {
    private Long posterId;
    private Long movieId;
    private String posterUrl;
}
