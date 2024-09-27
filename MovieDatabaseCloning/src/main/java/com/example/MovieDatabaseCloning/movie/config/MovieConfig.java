package com.example.MovieDatabaseCloning.movie.config;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class MovieConfig {


 private String accessToken="eyJhbGciOiJIUzI1NiJ9.eyJhdWQiOiJmZjM2YWNjYTQ2NzQ5OWFjNmFkZTU5N2I2MTlhMTg5MiIsIm5iZiI6MTcyMzc0NTQyNC44MTYxMDUsInN1YiI6IjY2YjdhOWM3MTljMTNhMjE1MjllZGU0NCIsInNjb3BlcyI6WyJhcGlfcmVhZCJdLCJ2ZXJzaW9uIjoxfQ.YYQPFMZJTLia3iFTCuOzMy2F2fsOkyUWBX-9z4SkmCU";

    @Bean
    public  RestTemplate restTemplate(){
        return new RestTemplateBuilder( rt-> rt.getInterceptors().add((request, body, execution) -> {
            request.getHeaders().add("Authorization", "Bearer "+accessToken);
            return execution.execute(request, body);
        })).build();
    }





}
