package com.dave.pokemon.api.v1.model;

/**
 * User: Dave Harms
 * Date: 2/11/22
 * Time: 4:53 AM
 */
public class PokemonDto {

    private Long id;
    private String name;
    private int hitPoints;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }
}
