package com.example.MovieDatabaseCloning.movie.repository;

import com.example.MovieDatabaseCloning.movie.entity.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie,Long> {
}
