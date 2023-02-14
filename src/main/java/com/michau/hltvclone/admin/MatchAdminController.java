package com.michau.hltvclone.admin;

import com.michau.hltvclone.match.model.MatchRequest;
import com.michau.hltvclone.match.model.MatchResponse;
import com.michau.hltvclone.news.model.NewsRequest;
import com.michau.hltvclone.news.model.NewsResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/admin/match")
public class MatchAdminController {
    private final MatchAdminService matchAdminService;

    public MatchAdminController(MatchAdminService matchAdminService) {
        this.matchAdminService = matchAdminService;
    }

    @PostMapping("/create")
    public ResponseEntity<MatchResponse> addMatch(@RequestBody MatchRequest matchRequest) {
        return new ResponseEntity<>(
                matchAdminService.addMatch(matchRequest), HttpStatus.CREATED);
    }
}
