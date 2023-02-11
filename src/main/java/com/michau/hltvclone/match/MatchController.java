package com.michau.hltvclone.match;

import com.michau.hltvclone.match.dto.MatchResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/match")
public class MatchController {
    private MatchService matchService;

    public MatchController(MatchService matchService) {
        this.matchService = matchService;
    }

    @GetMapping("/today")
    public List<MatchResponse> getTodayMatches() {
        return matchService.getTodayMatches();
    }

}
