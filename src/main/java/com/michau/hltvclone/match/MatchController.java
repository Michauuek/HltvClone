package com.michau.hltvclone.match;

import com.michau.hltvclone.match.model.MatchResponse;
import com.michau.hltvclone.match.model.MatchesDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/match")
public class MatchController {
    private final MatchService matchService;

    public MatchController(MatchService matchService) {
        this.matchService = matchService;
    }

    @GetMapping
    public ResponseEntity<MatchesDTO> getMatches(
            @RequestParam(name = "page", defaultValue = "1") Integer page) {

        return new ResponseEntity<>(matchService.getMatches(page), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<MatchResponse> getMatch(@PathVariable(name = "id") Long id) {
        return new ResponseEntity<>(matchService.getMatchById(id), HttpStatus.OK);
    }

    @GetMapping("/today")
    public ResponseEntity<List<MatchResponse>> getTodayMatches() {
        return new ResponseEntity<>(matchService.getTodayMatches(), HttpStatus.OK);
    }

}
