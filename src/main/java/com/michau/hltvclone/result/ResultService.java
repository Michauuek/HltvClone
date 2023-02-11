package com.michau.hltvclone.result;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ResultService {
    private final ResultRepository resultRepository;

    public ResultService(ResultRepository resultRepository) {
        this.resultRepository = resultRepository;
    }

    public List<ResultResponse> getMatchResult(long matchId) {
        var matchResults = resultRepository.findAllByMatchId(matchId);

        if (matchResults.isEmpty()) {
            return null;
        }
        return matchResults
                .stream()
                .map(result -> ResultResponse
                        .builder()
                        .resultId(result.getResultId())
                        .teamOneScore(result.getTeamOneScore())
                        .teamTwoScore(result.getTeamTwoScore())
                        .matchId(result.getMatch().getMatchId())
                        .build())
                .toList();
    }
}
