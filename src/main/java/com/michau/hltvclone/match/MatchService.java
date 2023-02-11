package com.michau.hltvclone.match;

import com.michau.hltvclone.match.dto.MatchResponse;
import com.michau.hltvclone.match.exception.MatchesNotFoundException;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class MatchService {
    private MatchRepository matchRepository;

    public MatchService(MatchRepository matchRepository) {
        this.matchRepository = matchRepository;
    }


    public List<MatchResponse> getTodayMatches() {
        var todayMatches = matchRepository.findAllByDate(LocalDate.now());

        if(todayMatches.isEmpty()) {
            throw new MatchesNotFoundException();
        }

        //TODO check if match contains 2 teams
        //sometimes matches can be without teams
        return todayMatches
                .stream()
                .map(match -> MatchResponse
                        .builder()
                        .matchId(match.getMatchId())
                        .date(match.getDate())
                        .time(match.getTime())
                        .teamOneName(match
                                .getTeams()
                                .stream()
                                .toList()
                                .get(0)
                                .getName())
                        .teamTwoName(match
                                .getTeams()
                                .stream()
                                .toList()
                                .get(1)
                                .getName())
                        .build()
                ).toList();
    }
}
