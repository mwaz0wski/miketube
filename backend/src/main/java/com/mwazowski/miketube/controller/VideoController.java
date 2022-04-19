package com.mwazowski.miketube.controller;

import com.mwazowski.miketube.dto.UploadVideoResponse;
import com.mwazowski.miketube.service.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RequestMapping("/api/1.0/videos")
@RestController
public class VideoController {

    @Autowired
    private VideoService videoService;

    @PostMapping("upload")
    @ResponseStatus(HttpStatus.CREATED)
    public UploadVideoResponse uploadVideo(@RequestParam("file") MultipartFile file, @RequestParam("userId") String userId) {
        return videoService.uploadVideo(file, userId);
    }

}



