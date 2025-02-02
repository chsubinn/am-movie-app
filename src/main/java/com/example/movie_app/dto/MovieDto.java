package com.example.movie_app.dto;

import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Date;

@Data
public class MovieDto {
    private Long id;
    private String title;
    private String director;
    private Date releaseDate;
    private String genre;
    private BigDecimal rating;
    private String description;

}
