package com.dave.pokemon.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * User: Dave Harms
 * Date: 2/5/22
 * Time: 8:17 PM
 */
@RestController
@RequestMapping("/api/v1/trainer")
public class TrainerController {

    @GetMapping
    public String getTrainers() {
        return "Whole bunch of trainers!";
    }
}
