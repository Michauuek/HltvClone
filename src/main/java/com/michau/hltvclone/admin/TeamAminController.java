package com.michau.hltvclone.admin;

import com.michau.hltvclone.team.model.TeamRequest;
import com.michau.hltvclone.team.model.TeamResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/admin/team")
public class TeamAminController {
    private final TeamAdminService teamAdminService;

    public TeamAminController(TeamAdminService teamAdminService) {
        this.teamAdminService = teamAdminService;
    }

    @PostMapping("/create")
    public ResponseEntity<TeamResponse> addTeam(@RequestBody TeamRequest teamRequest) {
        return new ResponseEntity<>(
                teamAdminService.addTeam(teamRequest), HttpStatus.CREATED);
    }
}
