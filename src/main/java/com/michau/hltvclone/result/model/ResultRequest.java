package com.michau.hltvclone.result.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ResultRequest {
    private long teamOneScore;
    private long teamTwoScore;
    private long matchId;
    private String mapName;
}
