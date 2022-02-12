package com.dave.pokemon.api.v1.mapper;

import com.dave.pokemon.api.v1.model.PokemonDto;
import com.dave.pokemon.domain.Pokemon;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * User: Dave Harms
 * Date: 2/11/22
 * Time: 7:49 AM
 */
public class PokemonMapperTest {

    PokemonMapper pokemonMapper;

    @BeforeEach
    public void setUp() throws Exception {
        pokemonMapper = new PokemonMapperImpl();
    }

    @Test
    public void pokemonToPokemonDto() throws Exception {
        Pokemon pokemon = new Pokemon();
        pokemon.setId(1L);
        pokemon.setName("pikachu");
        pokemon.setHitPoints(100);

        PokemonDto pokemonDto = pokemonMapper.pokemonToPokemonDto(pokemon);

        assertEquals(1L, pokemonDto.getId());
        assertEquals("pikachu", pokemonDto.getName());
        assertEquals(100, pokemonDto.getHitPoints());
    }

    @Test
    public void pokemonDtoToPokemon() throws Exception {
        PokemonDto dto = new PokemonDto();
        dto.setId(1L);
        dto.setName("pikachu");
        dto.setHitPoints(100);

        Pokemon pokemon = pokemonMapper.pokemonDtoToPokemon(dto);

        assertEquals(1L, pokemon.getId());
        assertEquals("pikachu", pokemon.getName());
        assertEquals(100, pokemon.getHitPoints());
    }
}
