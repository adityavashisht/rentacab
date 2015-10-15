package com.indasil.rentacab.service;


import org.springframework.stereotype.Component;

/**
 * Created by vashishta on 10/15/15.
 */
@Component
public class MainService {


    @Log
    public void rent() {
        System.out.println("Main Service called");

    }
}
