package com.example.instogramm.dto;

import lombok.Data;

import java.util.Set;

@Data
public class PostDTO {
    private long id;
    private String title;
    private String caption;
    private String location;
    private String username;
    private Integer likes;
    private Set<String> likedUser;
}
