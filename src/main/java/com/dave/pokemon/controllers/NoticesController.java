package com.dave.pokemon.controllers;

import com.dave.pokemon.domain.Notice;
import com.dave.pokemon.repository.NoticesRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * User: Dave Harms
 * Date: 2/5/22
 * Time: 8:20 PM
 */
@RestController
@RequestMapping("/api/v1/notices")
public class NoticesController {

    private final NoticesRepository noticesRepository;

    public NoticesController(NoticesRepository noticesRepository) {
        this.noticesRepository = noticesRepository;
    }

    @GetMapping
    public List<Notice> getNotices() {

//        NoticeDto notice1 = new NoticeDto();
//        notice1.setId(1L);
//        notice1.setName("Notice 1");
//        notice1.setNotice("Hey this is a notice");
//
//        NoticeDto notice2 = new NoticeDto();
//        notice2.setId(2L);
//        notice2.setName("Notice 2");
//        notice2.setNotice("Hey this is another notice");


//        return Arrays.asList(notice1, notice2);
        return noticesRepository.findAll();
    }
}
