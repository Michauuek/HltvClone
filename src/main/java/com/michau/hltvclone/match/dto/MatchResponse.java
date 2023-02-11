package com.michau.hltvclone.match.dto;

import jakarta.persistence.Column;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalTime;

@Data
@Builder
public class MatchResponse {
    private long matchId;
    private LocalDate date;
    private LocalTime time;
    private String teamOneName;
    private String teamTwoName;
}
