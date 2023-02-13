package com.michau.hltvclone.team;

import com.michau.hltvclone.team.model.TeamResponse;
import com.michau.hltvclone.team.exception.TeamNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class TeamService {
    private final TeamRepository teamRepository;
    private final TeamMapper teamMapper;

    public TeamService(TeamRepository teamRepository, TeamMapper teamMapper) {
        this.teamRepository = teamRepository;
        this.teamMapper = teamMapper;
    }

    public TeamResponse getTeamByName(String name) {
        if(name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Name cannot be empty");
        }

        var team = teamRepository.findByName(name.toLowerCase());

        if(team == null){
            throw new TeamNotFoundException();
        }

        return teamMapper.toResponse(team);
    }
}
