package com.dave.pokemon.services;

import com.dave.pokemon.models.Pokemon;
import com.dave.pokemon.repository.PokemonRepository;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * User: Dave Harms
 * Date: 2/8/22
 * Time: 3:49 PM
 */
@Service
public class PokemonServiceImpl implements PokemonService {

    private final PokemonRepository pokemonRepository;

    public PokemonServiceImpl(PokemonRepository pokemonRepository) {
        this.pokemonRepository = pokemonRepository;
    }

    @Override
    public List<Pokemon> getAllPokemon() {
        List<Pokemon> pokemons = pokemonRepository.findAll();
        return pokemons;
    }

    @Override
    public Pokemon getPokemon(Long id) {
        return pokemonRepository.getById(id);
    }
}
