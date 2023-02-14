package com.michau.hltvclone.match;

import com.michau.hltvclone.map.Map;
import com.michau.hltvclone.match.model.MatchRequest;
import com.michau.hltvclone.match.model.MatchResponse;
import org.springframework.stereotype.Component;

@Component
public class MatchMapper {

    //TODO fix teamOne teamTwo
    public Match toMatch(MatchRequest request) {
        return Match
                .builder()
                .date(request.getDate())
                .time(request.getTime())
                .format(request.getFormat())
                .build();
    }


    public MatchResponse toResponse(Match match) {
        return MatchResponse
                .builder()
                .matchId(match.getMatchId())
                .date(match.getDate())
                .time(match.getTime())
                .format(match.getFormat())
                .status(match.getStatus())
                .mapsName(match
                        .getMaps()
                        .stream()
                        .map(Map::getName)
                        .toList())
                .teamOneName(match
                                .getTeams()
                                .isEmpty() ? null : match
                                .getTeams()
                                .stream()
                                .toList()
                                .get(0)
                                .getName())
                .teamTwoName(match
                                .getTeams()
                                .size() > 1 ? match
                                .getTeams()
                                .stream()
                                .toList()
                                .get(1)
                                .getName() : null)
                .build();
    }
}
