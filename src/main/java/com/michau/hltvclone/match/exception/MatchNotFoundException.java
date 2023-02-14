package com.michau.hltvclone.match.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND, reason = "Match not found")
public class MatchNotFoundException extends RuntimeException{
    public MatchNotFoundException() {
        super();
    }
}
