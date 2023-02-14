package com.michau.hltvclone.team;

import com.michau.hltvclone.team.model.TeamResponse;
import com.michau.hltvclone.team.exception.TeamNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

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

    public List<TeamResponse> getTopTeams(Integer amount) {
        if(amount == null || amount < 1) {
            throw new IllegalArgumentException("Amount cannot be less than 1");
        }

        var topTeams = teamRepository.findBestTeams(amount);

        return topTeams
                .stream()
                .map(teamMapper::toResponse)
                .toList();
    }
}
