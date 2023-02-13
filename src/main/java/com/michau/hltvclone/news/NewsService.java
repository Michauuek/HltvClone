package com.michau.hltvclone.news;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NewsService {
    private final NewsRepository newsRepository;

    public NewsService(NewsRepository newsRepository) {
        this.newsRepository = newsRepository;
    }

    public List<NewsResponse> getLatestNews(Integer lastDaysNum) {
        return null;
    }
}
