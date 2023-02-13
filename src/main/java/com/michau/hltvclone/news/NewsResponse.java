package com.michau.hltvclone.news;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;

@Data
@Builder
public class NewsResponse {
    private long newsId;
    private String title;
    private String content;
    private LocalDate date;
    private String country;
}
