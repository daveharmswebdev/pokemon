package com.dave.pokemon.controllers;

import com.dave.pokemon.api.v1.model.PokemonDto;
import com.dave.pokemon.services.PokemonService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * User: Dave Harms
 * Date: 2/5/22
 * Time: 10:52 AM
 */
@RestController
@RequestMapping("/api/v1/pokemon")
public class PokemonController {

    private final PokemonService pokemonService;

    public PokemonController(PokemonService pokemonService) {
        this.pokemonService = pokemonService;
    }

    @GetMapping
    public List<PokemonDto> getPokemon() {
        List<PokemonDto> pokemons = pokemonService.getAllPokemon();
        return pokemons;
    }
}
