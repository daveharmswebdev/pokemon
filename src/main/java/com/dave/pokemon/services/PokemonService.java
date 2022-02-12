package com.dave.pokemon.services;

import com.dave.pokemon.api.v1.model.PokemonDto;

import java.util.List;

/**
 * User: Dave Harms
 * Date: 2/8/22
 * Time: 3:48 PM
 */
public interface PokemonService {

    List<PokemonDto> getAllPokemon();

    PokemonDto getPokemon(Long id);
}
