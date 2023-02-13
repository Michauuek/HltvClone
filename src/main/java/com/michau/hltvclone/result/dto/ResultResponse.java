package com.michau.hltvclone.result.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ResultResponse {
    private long resultId;
    private long teamOneScore;
    private long teamTwoScore;
    private long matchId;
}
