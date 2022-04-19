package com.mwazowski.miketube.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

@Document(value = "Videos")
@AllArgsConstructor
@Builder
@Data
public class Video {
    private String id;
    private String description;
    private String title;
    private String userId;
    private AtomicInteger likes;
    private AtomicInteger dislikes;
    private List<String> tags;
    private String url;
    private VideoStatus videoStatus;
    private AtomicInteger viewCount;
    private String thumbnailUrl;
    private List<Comment> comments;
}
