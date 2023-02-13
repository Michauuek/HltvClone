package com.michau.hltvclone.team;

import com.michau.hltvclone.team.model.TeamResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/team")
public class TeamController {
    private final TeamService teamService;

    public TeamController(TeamService teamService) {
        this.teamService = teamService;
    }

    @GetMapping("/{name}")
    public TeamResponse getTeam(@PathVariable("name") String name) {
        return teamService.getTeamByName(name);
    }
}
