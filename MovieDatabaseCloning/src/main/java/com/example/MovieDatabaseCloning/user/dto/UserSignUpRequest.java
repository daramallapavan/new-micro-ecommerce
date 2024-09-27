package com.example.MovieDatabaseCloning.user.dto;

import lombok.Data;

@Data
public class UserSignUpRequest {


    private String name;

    private String email;
    private String password;

}
