package com.dave.pokemon.repository;

import com.dave.pokemon.models.Trainer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * User: Dave Harms
 * Date: 2/6/22
 * Time: 7:39 AM
 */
@Repository
public interface TrainerRepository extends CrudRepository<Trainer, Long> {

    List<Trainer> findByEmail(String email);

}
