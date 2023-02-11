package com.michau.hltvclone.result;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/result")
public class ResultController {
    private final ResultService resultService;

    public ResultController(ResultService resultService) {
        this.resultService = resultService;
    }

    @GetMapping("/{matchId}")
    public List<ResultResponse> getMatchResult(@PathVariable("matchId") long matchId) {
        return resultService.getMatchResult(matchId);
    }
}
