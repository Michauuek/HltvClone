package com.michau.hltvclone.result;

import com.michau.hltvclone.result.model.ResultResponse;
import com.michau.hltvclone.result.model.ResultsDTO;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/result")
public class ResultController {
    private final ResultService resultService;

    public ResultController(ResultService resultService) {
        this.resultService = resultService;
    }


    @GetMapping
    public ResultsDTO getResultsPage(@RequestParam(name = "page", defaultValue = "1") Integer page){
        return resultService.getResults(page);
    }

    @GetMapping("/{matchId}")
    public List<ResultResponse> getMatchResult(@PathVariable("matchId") Long matchId) {
        return resultService.getMatchResult(matchId);
    }
}
