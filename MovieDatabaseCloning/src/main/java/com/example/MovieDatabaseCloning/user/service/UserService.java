package com.example.MovieDatabaseCloning.user.service;

import com.example.MovieDatabaseCloning.user.dto.LoginRequest;
import com.example.MovieDatabaseCloning.user.dto.LoginResponse;
import com.example.MovieDatabaseCloning.user.dto.UserSignUpRequest;

public interface UserService {


    String createUser(UserSignUpRequest request);

    Boolean login(LoginRequest loginRequest);
}
