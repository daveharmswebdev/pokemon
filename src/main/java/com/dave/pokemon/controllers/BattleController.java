package com.dave.pokemon.controllers;

import com.dave.pokemon.domain.Battle;
import com.dave.pokemon.repository.BattleRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * User: Dave Harms
 * Date: 2/9/22
 * Time: 4:09 PM
 */
@RestController
@RequestMapping("/api/v1/battle")
public class BattleController {

    private final BattleRepository battleRepository;

    public BattleController(BattleRepository battleRepository) {
        this.battleRepository = battleRepository;
    }

    @GetMapping
    public List<Battle> getBattles() {
//        BattleDto battle1 = new BattleDto();
//        battle1.setId(1L);
//        battle1.setName("What a fight");
//        battle1.setLocation("That place");
//
//        BattleDto battle2 = new BattleDto();
//        battle1.setId(2L);
//        battle1.setName("What a donnybrook");
//        battle1.setLocation("That place again");
//        List<BattleDto> battles = Arrays.asList(
//                battle1, battle2
//        );

        return battleRepository.findAll();
    }
}
