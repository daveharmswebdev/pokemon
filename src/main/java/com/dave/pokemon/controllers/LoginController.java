package com.dave.pokemon.controllers;

import com.dave.pokemon.models.Trainer;
import com.dave.pokemon.repository.TrainerRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
import java.util.List;

/**
 * User: Dave Harms
 * Date: 2/7/22
 * Time: 5:46 PM
 */
@RestController
public class LoginController {

    private final TrainerRepository trainerRepository;

    public LoginController(TrainerRepository trainerRepository) {
        this.trainerRepository = trainerRepository;
    }

    @GetMapping("/api/v1/login")
    public Trainer getTrainerDetailsAfterLogin(Principal trainer) {
        List<Trainer> trainers = trainerRepository.findByEmail(trainer.getName());

        if (trainers.size() > 0) {
            return trainers.get(0);
        } else {
            return null;
        }
    }
}
