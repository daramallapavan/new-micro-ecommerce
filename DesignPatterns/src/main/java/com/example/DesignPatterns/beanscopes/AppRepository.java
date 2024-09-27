package com.example.DesignPatterns.beanscopes;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
@Scope(value = "prototype")
public class AppRepository {

    public List<String> getData(){
        List<String> list= Arrays.asList( "one","two","three","four","five" );

        return list;
    }


}
