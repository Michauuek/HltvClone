package com.michau.hltvclone.news;

import com.michau.hltvclone.news.model.NewsRequest;
import com.michau.hltvclone.news.model.NewsResponse;
import org.springframework.stereotype.Component;

@Component
public class NewsMapper {
    public News toNews(NewsRequest request) {
        return News
                .builder()
                .title(request.getTitle())
                .content(request.getContent())
                .uploadDate(request.getDate())
                .build();
    }

    public NewsResponse toResponse(News news) {
        return NewsResponse
                .builder()
                .newsId(news.getNewsId())
                .content(news.getContent())
                .title(news.getTitle())
                .date(news.getUploadDate())
                .build();
    }
}
