package com.michau.hltvclone.news.model;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;

@Data
@Builder
public class NewsRequest {
    private String title;
    private String content;
    private LocalDate date;
}
