package com.michau.hltvclone.result;

import com.michau.hltvclone.result.dto.ResultResponse;
import org.springframework.stereotype.Component;


@Component
public class ResultsMapper {
    public ResultResponse toResponse(Result result) {
        return ResultResponse
                .builder()
                .resultId(result.getResultId())
                .teamOneScore(result.getTeamOneScore())
                .teamTwoScore(result.getTeamTwoScore())
                .matchId(result.getMatch().getMatchId())
                .build();
    }
}
