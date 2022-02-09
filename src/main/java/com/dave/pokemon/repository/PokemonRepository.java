package com.dave.pokemon.repository;

import com.dave.pokemon.models.Pokemon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * User: Dave Harms
 * Date: 2/8/22
 * Time: 3:42 PM
 */
@Repository
public interface PokemonRepository extends JpaRepository<Pokemon, Long> {
}
