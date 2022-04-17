package com.mwazowski.miketube.model;

import lombok.Data;

import java.util.List;

@Data
public class Video {

    private String id;
    private String description;
    private String title;
    private String userId;
    private Integer likes;
    private Integer dislikes;
    private List<String> tags;
    private String url;
    private VideoStatus videoStatus;
    private Integer viewCount;
    private String thumbnailUrl;
    private List<Comment> comments;

}
