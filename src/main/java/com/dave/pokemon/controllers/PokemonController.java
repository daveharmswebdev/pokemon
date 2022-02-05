package com.dave.pokemon.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * User: Dave Harms
 * Date: 2/5/22
 * Time: 10:52 AM
 */
@RestController
@RequestMapping("/api/v1/pokemon")
public class PokemonController {

    @GetMapping
    public String getPokemon() {
        return "A whole bunch of pokemon";
    }
}
