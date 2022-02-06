package com.dave.pokemon.config;

import com.dave.pokemon.models.SecurityTrainer;
import com.dave.pokemon.models.Trainer;
import com.dave.pokemon.repository.TrainerRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * User: Dave Harms
 * Date: 2/6/22
 * Time: 7:42 AM
 */
@Service
public class PokemonTrainerUserDetails implements UserDetailsService {

    private final TrainerRepository trainerRepository;

    public PokemonTrainerUserDetails(TrainerRepository trainerRepository) {
        this.trainerRepository = trainerRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        List<Trainer> trainer = trainerRepository.findByEmail(username);
        if (trainer.size() == 0) {
            throw new UsernameNotFoundException("Trainer does not exist for email " + username);
        }
        return new SecurityTrainer(trainer.get(0));
    }
}
