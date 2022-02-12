package com.dave.pokemon.services;

import com.dave.pokemon.api.v1.mapper.PokemonMapper;
import com.dave.pokemon.api.v1.model.PokemonDto;
import com.dave.pokemon.repository.PokemonRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * User: Dave Harms
 * Date: 2/8/22
 * Time: 3:49 PM
 */
@Service
public class PokemonServiceImpl implements PokemonService {

    private final PokemonRepository pokemonRepository;
    private final PokemonMapper pokemonMapper;

    public PokemonServiceImpl(PokemonRepository pokemonRepository, PokemonMapper pokemonMapper) {
        this.pokemonRepository = pokemonRepository;
        this.pokemonMapper = pokemonMapper;
    }

    @Override
    public List<PokemonDto> getAllPokemon() {
        return pokemonRepository.findAll()
                .stream()
                .map(pokemonMapper::pokemonToPokemonDto).collect(Collectors.toList());
    }

    @Override
    public PokemonDto getPokemon(Long id) {
        return pokemonRepository.findById(id)
                .map(pokemonMapper::pokemonToPokemonDto)
                .orElseThrow(ResourceNotFoundException::new);
    }
}
