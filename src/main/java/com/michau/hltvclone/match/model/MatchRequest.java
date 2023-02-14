package com.michau.hltvclone.match.model;

import com.michau.hltvclone.match.MatchFormat;
import com.michau.hltvclone.match.MatchStatus;
import jakarta.persistence.Column;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@Data
@Builder
public class MatchRequest {
    private LocalDate date;
    private LocalTime time;
    private String teamOneName;
    private String teamTwoName;
    private List<String> mapsName;
    /*@Enumerated(EnumType.STRING)*/
    private MatchFormat format;
    /*@Enumerated(EnumType.STRING)*/
    private MatchStatus status;
}
