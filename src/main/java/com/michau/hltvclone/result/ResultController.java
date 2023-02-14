package com.michau.hltvclone.result;

import com.michau.hltvclone.result.model.ResultResponse;
import com.michau.hltvclone.result.model.ResultsDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity<ResultsDTO> getResultsPage(
            @RequestParam(name = "page", defaultValue = "1") Integer page){
        return new ResponseEntity<>(resultService.getResults(page), HttpStatus.OK);
    }

    @GetMapping("/{matchId}")
    public ResponseEntity<List<ResultResponse>> getMatchResult(
            @PathVariable("matchId") Long matchId) {
        return new ResponseEntity<>(resultService.getMatchResult(matchId), HttpStatus.OK);
    }
}
