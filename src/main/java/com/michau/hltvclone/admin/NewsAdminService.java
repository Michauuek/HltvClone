package com.michau.hltvclone.admin;

import com.michau.hltvclone.news.NewsMapper;
import com.michau.hltvclone.news.NewsRepository;
import com.michau.hltvclone.news.model.NewsRequest;
import com.michau.hltvclone.news.model.NewsResponse;
import org.springframework.stereotype.Service;

@Service
public class NewsAdminService {
    private final NewsRepository newsRepository;
    private final NewsMapper newsMapper;

    public NewsAdminService(NewsRepository newsRepository, NewsMapper newsMapper) {
        this.newsRepository = newsRepository;
        this.newsMapper = newsMapper;
    }

    public NewsResponse addNews(NewsRequest newsRequest) {
        var newsEntity = newsRepository.save(newsMapper.toNews(newsRequest));
        return newsMapper.toResponse(newsEntity);
    }
}
