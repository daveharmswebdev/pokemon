package com.dave.pokemon.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * User: Dave Harms
 * Date: 2/5/22
 * Time: 8:20 PM
 */
@RestController
@RequestMapping("/api/v1/notices")
public class NoticesController {

    @GetMapping
    public String getNotices() {
        return "A Whole bunch of notices";
    }
}
