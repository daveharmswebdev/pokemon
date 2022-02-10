package com.dave.pokemon.domain;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * User: Dave Harms
 * Date: 2/6/22
 * Time: 7:30 AM
 */
public class SecurityTrainer implements UserDetails {

    private final Trainer trainer;

    public SecurityTrainer(Trainer trainer) {
        this.trainer = trainer;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        List<GrantedAuthority> authorities = new ArrayList<>();
        authorities.add(new SimpleGrantedAuthority(trainer.getRole()));
        return authorities;
    }

    @Override
    public String getPassword() {
        return trainer.getPassword();
    }

    @Override
    public String getUsername() {
        return trainer.getEmail();
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
