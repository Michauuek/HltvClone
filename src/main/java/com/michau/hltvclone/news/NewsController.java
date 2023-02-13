package com.michau.hltvclone.news;

import com.michau.hltvclone.news.model.NewsResponse;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/news")
public class NewsController {
    private final NewsService newsService;

    public NewsController(NewsService newsService) {
        this.newsService = newsService;
    }

    public List<NewsResponse> getLatestNews(Integer lastDaysNum){
        return newsService.getLatestNews(lastDaysNum);
    }
}
