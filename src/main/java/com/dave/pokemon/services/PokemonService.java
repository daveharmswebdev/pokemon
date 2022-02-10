package com.dave.pokemon.services;

import com.dave.pokemon.domain.Pokemon;

import java.util.List;

/**
 * User: Dave Harms
 * Date: 2/8/22
 * Time: 3:48 PM
 */
public interface PokemonService {

    List<Pokemon> getAllPokemon();

    Pokemon getPokemon(Long id);
}
