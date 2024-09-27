package com.example.MovieDatabaseCloning.movie.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Results {

    private boolean adult;

    private  String backdrop_path;

    private List<Integer> genre_ids;

    private Long id;


    private String original_language;


    private String original_title;

    private String overview;


    private double popularity;

    private String poster_path;


    private Date release_date;

    private String title;

    private boolean video;

    private double vote_average;

    private long vote_count;

}
