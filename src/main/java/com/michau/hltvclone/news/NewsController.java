package com.michau.hltvclone.news;

import com.michau.hltvclone.news.model.NewsResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/news")
@CrossOrigin
public class NewsController {
    private final NewsService newsService;

    public NewsController(NewsService newsService) {
        this.newsService = newsService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<NewsResponse> getNews(@PathVariable("id") Long id){
        return new ResponseEntity<>(newsService.getNewsById(id), HttpStatus.OK);
    }

    @GetMapping("/latest/{days}")
    public ResponseEntity<List<NewsResponse>> getLatestNews(
            @PathVariable("days") Integer lastDaysNum){

        return new ResponseEntity<>(newsService.getLatestNews(lastDaysNum), HttpStatus.OK);
    }
}
