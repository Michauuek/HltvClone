package com.michau.hltvclone.result;

import com.michau.hltvclone.result.model.ResultRequest;
import com.michau.hltvclone.result.model.ResultResponse;
import org.springframework.stereotype.Component;


@Component
public class ResultsMapper {

    public Result toResult(ResultRequest request) {
        return Result
                .builder()
                .teamTwoScore(request.getTeamTwoScore())
                .teamOneScore(request.getTeamOneScore())
                .build();
    }
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
