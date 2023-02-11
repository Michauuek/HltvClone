package com.michau.hltvclone.match.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND, reason = "Matches not found")
public class MatchesNotFoundException extends RuntimeException{
    public MatchesNotFoundException() {
        super();
    }
}
