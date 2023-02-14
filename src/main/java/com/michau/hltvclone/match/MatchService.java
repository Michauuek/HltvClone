package com.michau.hltvclone.match;

import com.michau.hltvclone.match.model.MatchResponse;
import com.michau.hltvclone.match.exception.MatchNotFoundException;
import com.michau.hltvclone.match.model.MatchesDTO;
import com.michau.hltvclone.team.Team;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
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
            throw new MatchNotFoundException();
        }
        todayMatches.forEach(match -> match.getTeams().forEach(Team::getName));
        return todayMatches
                .stream()
                .map(matchMapper::toResponse)
                .toList();
    }

    public MatchesDTO getMatches(Integer pageNumber) {
        int page = pageNumber < 1 ? 0 : pageNumber -1;
        Pageable pageable = PageRequest.of(page, 10, Sort.Direction.DESC);

        var results = matchRepository
                .findAll(pageable)
                .map(matchMapper::toResponse);

        return new MatchesDTO(results);
    }

    public MatchResponse getMatchById(Long id) {
        var match = matchRepository
                .findById(id)
                .orElseThrow(MatchNotFoundException::new);

        return matchMapper.toResponse(match);
    }
}
