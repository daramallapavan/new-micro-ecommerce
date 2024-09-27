package com.example.MovieDatabaseCloning.movie.controller;

import com.example.MovieDatabaseCloning.movie.entity.Movie;
import com.example.MovieDatabaseCloning.movie.dto.Results;
import com.example.MovieDatabaseCloning.movie.service.MovieService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/movie")
@RequiredArgsConstructor
public class MovieController {

    private final  MovieService movieService;

    @GetMapping("/get")
    public List<Results> dataFromMovieDatabase(@RequestParam  String url){
       return movieService.getDataFromMovieApi(url);
    }
    @GetMapping("/data")
    public List<Movie> dataFromLocal(){
        return movieService.getMoviesData();
    }
    @PostMapping("/post")
    public String postDataToLocalDb(@RequestParam String url){
        return movieService.postMovieDataToDatabase(url);
    }


}
