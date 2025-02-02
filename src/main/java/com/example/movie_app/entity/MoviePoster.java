package com.example.movie_app.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "MoviePosters")
public class MoviePoster {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "poster_id")
    private Long posterId; // 포스터 고유 식별자

    @Column(name = "movie_id", nullable = false)
    private Long movieId; // 영화 ID (외래 키로 사용되는 영화 ID)

    @Column(name = "poster_url", nullable = false)
    private String posterUrl; // 포스터 URL

//    @Column(name = "created_at", nullable = false, updatable = false)
//    private LocalDateTime createdAt; // 생성 시각
}