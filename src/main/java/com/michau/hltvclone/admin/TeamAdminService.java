package com.michau.hltvclone.admin;

import com.michau.hltvclone.team.TeamMapper;
import com.michau.hltvclone.team.TeamRepository;
import com.michau.hltvclone.team.model.TeamRequest;
import com.michau.hltvclone.team.model.TeamResponse;
import org.springframework.stereotype.Service;

@Service
public class TeamAdminService {
    private final TeamRepository teamRepository;
    private final TeamMapper teamMapper;

    public TeamAdminService(TeamRepository teamRepository, TeamMapper teamMapper) {
        this.teamRepository = teamRepository;
        this.teamMapper = teamMapper;
    }

    public TeamResponse addTeam(TeamRequest teamRequest) {
        var team = teamRepository.save(teamMapper.toTeam(teamRequest));
        return teamMapper.toResponse(team);
    }
}
