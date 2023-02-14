package com.michau.hltvclone.team;

import com.michau.hltvclone.team.model.TeamResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.function.EntityResponse;

import java.util.List;

@RestController
@RequestMapping("/api/v1/team")
@CrossOrigin
public class TeamController {
    private final TeamService teamService;

    public TeamController(TeamService teamService) {
        this.teamService = teamService;
    }

    @GetMapping("/{name}")
    public ResponseEntity<TeamResponse> getTeam(@PathVariable("name") String name) {
        return new ResponseEntity<>(teamService.getTeamByName(name), HttpStatus.OK);
    }

    @GetMapping("/top/{amount}")
    public ResponseEntity<List<TeamResponse>> getTopTeams(@PathVariable("amount") Integer amount) {
        return new ResponseEntity<>(teamService.getTopTeams(amount), HttpStatus.OK);
    }
}
