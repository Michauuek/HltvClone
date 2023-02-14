package com.michau.hltvclone.admin;

import com.michau.hltvclone.match.MatchMapper;
import com.michau.hltvclone.match.MatchRepository;
import com.michau.hltvclone.match.model.MatchRequest;
import com.michau.hltvclone.match.model.MatchResponse;
import org.springframework.stereotype.Service;

@Service
public class MatchAdminService {
    private final MatchMapper matchMapper;
    private final MatchRepository matchRepository;

    public MatchAdminService(MatchMapper mapRepository, MatchRepository matchRepository) {
        this.matchMapper = mapRepository;
        this.matchRepository = matchRepository;
    }

    public MatchResponse addMatch(MatchRequest matchRequest) {
        var match = matchRepository.save(matchMapper.toMatch(matchRequest));
        return matchMapper.toResponse(match);
    }
}
