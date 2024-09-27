package com.example.MovieDatabaseCloning.movie.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MovieResponseDto {

    private Dates dates;

    private int page;
    private List<Results> results;

    private long total_pages;

    private long total_results;
}
