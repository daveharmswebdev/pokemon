package com.dave.pokemon.api.v1.mapper;

import com.dave.pokemon.api.v1.model.PokemonDto;
import com.dave.pokemon.domain.Pokemon;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

/**
 * User: Dave Harms
 * Date: 2/11/22
 * Time: 4:57 AM
 */
@Mapper(componentModel = "spring")
public interface PokemonMapper {

    @Mapping(target = "id")
    PokemonDto pokemonToPokemonDto(Pokemon pokemon);

    @Mapping(target = "id")
    Pokemon pokemonDtoToPokemon(PokemonDto pokemonDto);
}
