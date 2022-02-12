package com.dave.pokemon.api.v1.model;

/**
 * User: Dave Harms
 * Date: 2/9/22
 * Time: 4:46 PM
 */
public class NoticeDto {

    private Long id;
    private String name;
    private String notice;

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

    public String getNotice() {
        return notice;
    }

    public void setNotice(String notice) {
        this.notice = notice;
    }
}
