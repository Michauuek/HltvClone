package com.michau.hltvclone.match.model;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalTime;

@Data
@Builder
public class MatchRequest {
    private LocalDate date;
    private LocalTime time;
    private String teamOneName;
    private String teamTwoName;
}
