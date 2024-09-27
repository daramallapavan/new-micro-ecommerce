package com.example.MovieDatabaseCloning.user.controller;

import com.example.MovieDatabaseCloning.user.dto.LoginRequest;
import com.example.MovieDatabaseCloning.user.dto.LoginResponse;
import com.example.MovieDatabaseCloning.user.dto.UserSignUpRequest;
import com.example.MovieDatabaseCloning.user.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/user")
@CrossOrigin("*")
@Slf4j
public class UserController {
    private  final UserService userService;

    @PostMapping("/register")
    public ResponseEntity<?> registerUser(@RequestBody UserSignUpRequest request){

     String  response=   userService.createUser(request);

         return  new ResponseEntity<>( response, HttpStatus.CREATED );



    }


    @PostMapping("/login")
    public ResponseEntity<?> loginUser(@RequestBody LoginRequest loginRequest){

     Boolean loginResponse= userService.login(loginRequest);
     if (loginResponse){
         log.info( "Login Success" );
         return new ResponseEntity<>( "User Login Success",HttpStatus.OK );
     }
     log.info( "Login fail" );
     return new ResponseEntity<>( "Username And Password Incorrect" ,HttpStatus.NOT_FOUND);


    }
}
