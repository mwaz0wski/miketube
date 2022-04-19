import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { FileSystemFileEntry } from 'ngx-file-drop';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class VideoService {

  constructor(private httpClient: HttpClient) { }

  uploadVideo(file: File): Observable<any> {
    const formData = new FormData();
    formData.append("file", file, file.name)
    formData.append("userId", "1995");
    return this.httpClient.post('http://localhost:8080/api/1.0/videos/upload', formData);
  }
}
