package com.michau.hltvclone.news;

import com.michau.hltvclone.news.model.NewsResponse;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NewsService {
    private final NewsRepository newsRepository;
    private final NewsMapper newsMapper;

    public NewsService(NewsRepository newsRepository, NewsMapper newsMapper) {
        this.newsRepository = newsRepository;
        this.newsMapper = newsMapper;
    }

    public List<NewsResponse> getLatestNews(Integer lastDaysNum) {
        if(lastDaysNum < 1) {
            throw new IllegalArgumentException("LastDaysNum must be grater than 0");
        }
        var news = newsRepository.findLatestNews(lastDaysNum);

        return news
                .stream()
                .map(newsMapper::toResponse)
                .toList();
    }

    public NewsResponse getNewsById(Long newsId) {
        var news = newsRepository.
                findById(newsId)
                .orElseThrow(NewsNotFoundException::new);
        return newsMapper.toResponse(news);
    }
}
