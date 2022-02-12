package com.dave.pokemon.repository;

import com.dave.pokemon.domain.Battle;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * User: Dave Harms
 * Date: 2/9/22
 * Time: 6:12 PM
 */
public interface BattleRepository extends JpaRepository<Battle, Long> {
}
