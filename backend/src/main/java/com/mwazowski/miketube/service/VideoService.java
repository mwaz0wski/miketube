package com.mwazowski.miketube.service;

import com.mwazowski.miketube.dto.UploadVideoResponse;
import com.mwazowski.miketube.model.Video;
import com.mwazowski.miketube.repository.VideoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class VideoService {

    @Autowired
    private S3Service s3Service;

    @Autowired
    private VideoRepository videoRepository;

    public UploadVideoResponse uploadVideo(MultipartFile file, String userId) {
        String url = s3Service.uploadFile(file);
        var video = Video.builder().userId(userId).url(url).build();
        videoRepository.save(video);
        return new UploadVideoResponse(video.getId(), url);
    }
}
