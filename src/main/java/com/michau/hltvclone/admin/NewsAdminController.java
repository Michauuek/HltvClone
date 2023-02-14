package com.michau.hltvclone.admin;

import com.michau.hltvclone.news.model.NewsRequest;
import com.michau.hltvclone.news.model.NewsResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/admin/news")
public class NewsAdminController {
    private final NewsAdminService newsAdminService;

    public NewsAdminController(NewsAdminService newsAdminService) {
        this.newsAdminService = newsAdminService;
    }

    @PostMapping("/create")
    public ResponseEntity<NewsResponse> addNews(@RequestBody NewsRequest newsRequest) {
        return new ResponseEntity<>(
                newsAdminService.addNews(newsRequest), HttpStatus.CREATED);
    }
}
