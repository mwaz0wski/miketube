package com.mwazowski.miketube.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class UploadVideoResponse {
    private String videoId;
    private String fileName;
}
