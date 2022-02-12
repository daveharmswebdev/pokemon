package com.dave.pokemon.services;

import com.dave.pokemon.api.v1.mapper.PokemonMapper;
import com.dave.pokemon.api.v1.mapper.PokemonMapperImpl;
import com.dave.pokemon.api.v1.model.PokemonDto;
import com.dave.pokemon.domain.Pokemon;
import com.dave.pokemon.repository.PokemonRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.Mockito.when;

/**
 * User: Dave Harms
 * Date: 2/11/22
 * Time: 8:06 AM
 */
public class PokemonServiceImplTest {

    PokemonService pokemonService;
    PokemonMapper pokemonMapper;

    @Mock
    PokemonRepository pokemonRepository;

    @BeforeEach
    public void setUp() throws Exception {
        MockitoAnnotations.openMocks(this);

        pokemonMapper = new PokemonMapperImpl();
        pokemonService = new PokemonServiceImpl(pokemonRepository, pokemonMapper);
    }

    @Test
    void getAllPokemon() throws Exception {
        List<Pokemon> pokemons = Arrays.asList(new Pokemon(), new Pokemon(), new Pokemon());

        when(pokemonRepository.findAll()).thenReturn(pokemons);

        List<PokemonDto> dtos = pokemonService.getAllPokemon();

        assertEquals(3, dtos.size());
    }

    @Test
    void getPokemonById() throws Exception {
        Pokemon pokemon = new Pokemon();
        pokemon.setId(1L);
        pokemon.setName("pikachu");
        pokemon.setHitPoints(100);

        when(pokemonRepository.findById(anyLong())).thenReturn(Optional.of(pokemon));

        PokemonDto pokemonDto = pokemonService.getPokemon(1L);

        assertEquals(1L, pokemonDto.getId());
        assertEquals("pikachu", pokemonDto.getName());
        assertEquals(100, pokemonDto.getHitPoints());
    }
}
