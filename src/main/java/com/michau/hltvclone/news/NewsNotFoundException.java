package com.michau.hltvclone.news;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND, reason = "News not found")
public class NewsNotFoundException extends RuntimeException {
    public NewsNotFoundException() {
        super();
    }
}
