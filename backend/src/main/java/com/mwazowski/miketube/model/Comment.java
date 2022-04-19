package com.mwazowski.miketube.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;

@AllArgsConstructor
@Builder
@Data
public class Comment {

    @Id
    private String id;
    private String text;
    private String author;
    private Integer likeCount;
    private Integer dislikeCount;

}
