package com.michau.hltvclone.result;

import com.michau.hltvclone.result.model.ResultResponse;
import com.michau.hltvclone.result.model.ResultsDTO;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class ResultService {
    private final ResultRepository resultRepository;
    private final ResultsMapper resultsMapper;

    public ResultService(
            ResultRepository resultRepository,
            ResultsMapper resultsMapper
    ) {
        this.resultRepository = resultRepository;
        this.resultsMapper = resultsMapper;
    }

    public ResultsDTO getResults(Integer pageNumber) {
        int page = pageNumber < 1 ? 0 : pageNumber -1;
        Pageable pageable = PageRequest.of(page, 10, Sort.Direction.DESC);

        var results = resultRepository
                .findAll(pageable)
                .map(resultsMapper::toResponse);

        return new ResultsDTO(results);
    }

    public List<ResultResponse> getMatchResult(long matchId) {
        var matchResults = resultRepository.findAllByMatchId(matchId);

        if (matchResults.isEmpty()) {
            return null;
        }
        return matchResults
                .stream()
                .map(resultsMapper::toResponse)
                .toList();
    }
}
