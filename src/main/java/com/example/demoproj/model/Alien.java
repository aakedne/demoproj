package com.example.demoproj.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Alien {

    // create object
    @Autowired
    Laptop lap;

    //method
    public void code()
    {
        lap.compile();
    }
}
