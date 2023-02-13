package com.michau.hltvclone.match;

import com.michau.hltvclone.match.model.MatchResponse;
import com.michau.hltvclone.match.exception.MatchesNotFoundException;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class MatchService {
    private final MatchRepository matchRepository;
    private final MatchMapper matchMapper;

    public MatchService(MatchRepository matchRepository, MatchMapper matchMapper) {
        this.matchRepository = matchRepository;
        this.matchMapper = matchMapper;
    }

    public List<MatchResponse> getTodayMatches() {
        var todayMatches = matchRepository.findAllByDate(LocalDate.now());

        if(todayMatches.isEmpty()) {
            throw new MatchesNotFoundException();
        }

        return todayMatches
                .stream()
                .map(matchMapper::toResponse)
                .toList();
    }
}
