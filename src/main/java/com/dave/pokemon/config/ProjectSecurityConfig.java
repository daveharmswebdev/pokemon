package com.dave.pokemon.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * User: Dave Harms
 * Date: 2/5/22
 * Time: 11:11 AM
 */
@Configuration
public class ProjectSecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .authorizeRequests()
                    .antMatchers("/api/v1/pokemon").authenticated()
                    .antMatchers("/api/v1/trainer").authenticated()
                    .antMatchers("/api/v1/notices").permitAll()
                .and()
                    .formLogin().and().httpBasic();
    }
}
