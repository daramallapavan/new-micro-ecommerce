package com.example.MovieDatabaseCloning.user.service;

import com.example.MovieDatabaseCloning.user.dto.LoginRequest;
import com.example.MovieDatabaseCloning.user.dto.LoginResponse;
import com.example.MovieDatabaseCloning.user.dto.UserSignUpRequest;
import com.example.MovieDatabaseCloning.user.entity.User;
import com.example.MovieDatabaseCloning.user.exception.UserNotFoundException;
import com.example.MovieDatabaseCloning.user.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService{


    private final UserRepository userRepository;


    @Override
    public String createUser(UserSignUpRequest request) {
        Optional<User> isUserExist= userRepository.findByEmail(request.getEmail());
        if (isUserExist.isPresent()){
            throw new UserNotFoundException("Failed to Create User, Email Already Exist....");
        }
        User createdUser= User.builder()
                .email( request.getEmail() )
                .name( request.getName() )
                .password( request.getPassword() )
                .build();

        User savedUser=userRepository.save( createdUser );


        return  "User Created Successfully";

    }

    @Override
    public Boolean login(LoginRequest loginRequest) {

      Optional<User> user=  userRepository.findByEmail( loginRequest.getEmail() );

      if (user.isPresent()){
          if (user.get().getEmail().equals( loginRequest.getEmail() ) &&
          user.get().getPassword().equals( loginRequest.getPassword() ))
          {
              return true;
          }
      }
        return false;
    }
}
