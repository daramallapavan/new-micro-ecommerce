package com.example.MovieDatabaseCloning.movie.service;

import com.example.MovieDatabaseCloning.movie.repository.MovieRepository;
import com.example.MovieDatabaseCloning.movie.dto.MovieResponseDto;
import com.example.MovieDatabaseCloning.movie.dto.Results;
import com.example.MovieDatabaseCloning.movie.entity.Movie;
import lombok.RequiredArgsConstructor;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MovieService {

   // private String movieUrl="https://api.themoviedb.org/3/movie/now_playing";

    private final MovieRepository movieRepository;

    private  final RestTemplate restTemplate;

    public List<Movie> getMoviesData(){
        return movieRepository.findAll();
    }


    public List<Results> getDataFromMovieApi(String movieUrl){
        HttpHeaders httpHeaders=new HttpHeaders();
        httpHeaders.setContentType( MediaType.APPLICATION_CBOR );

        HttpEntity<String> httpEntity=new HttpEntity<String>( httpHeaders );


        ResponseEntity<MovieResponseDto> movieResponse = restTemplate
                .exchange( movieUrl, HttpMethod.GET, httpEntity, MovieResponseDto.class );



        MovieResponseDto response = movieResponse.getBody();

        return response.getResults();
    }


    public String postMovieDataToDatabase(String url){


     List<Results> movieResponseData=   getDataFromMovieApi(url);


     for (Results response:movieResponseData){
        Movie savedMovie= Movie.builder()
                .id( response.getId() )
                .adult( response.isAdult() )
                .backdrop_path( response.getBackdrop_path() )
                .genre_ids( response.getGenre_ids() )
                .video( response.isVideo() )
                .title( response.getTitle() )
                .original_language( response.getOriginal_language() )
                .overview( response.getOverview() )
                .original_title( response.getOriginal_title() )
                .release_date( response.getRelease_date() )
                .popularity( response.getPopularity() )
                .vote_average( response.getVote_average() )
                .vote_count( response.getVote_count() )
                .poster_path( response.getPoster_path() )
                 .build();

        movieRepository.save( savedMovie );
     }

     return "data posted successfully....";

    }
}
