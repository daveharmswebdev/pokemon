package com.dave.pokemon.repository;

import com.dave.pokemon.domain.Notice;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * User: Dave Harms
 * Date: 2/9/22
 * Time: 6:03 PM
 */
public interface NoticesRepository extends JpaRepository<Notice, Long> {
}
