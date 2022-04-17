package com.mwazowski.miketube.model;

import lombok.Data;

@Data
public class Comment {

    private String id;
    private String text;
    private String author;
    private Integer likeCount;
    private Integer dislikeCount;

}
