package com.mwazowski.miketube.repository;

import com.mwazowski.miketube.model.Video;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface VideoRepository extends MongoRepository<Video, String> {
    List<Video> findByUserId(String userId);
}
