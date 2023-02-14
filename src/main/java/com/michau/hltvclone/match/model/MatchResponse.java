package com.michau.hltvclone.match.model;

import com.michau.hltvclone.match.MatchFormat;
import com.michau.hltvclone.match.MatchStatus;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@Data
@Builder
public class MatchResponse {
    private long matchId;
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
