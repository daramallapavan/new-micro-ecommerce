package com.example.DesignPatterns.defaultmethods;

import io.micrometer.observation.Observation;

public interface Chat {

     default void chat() {

        System.out.println("print");
    }




}
