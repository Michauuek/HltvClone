package com.michau.hltvclone.team;

import org.springframework.stereotype.Service;

@Service
public class TeamService {
    private final TeamRepository teamRepository;

    public TeamService(TeamRepository teamRepository) {
        this.teamRepository = teamRepository;
    }

    public Team getTeamByName(String name) {
        return teamRepository.findByName(name.toLowerCase());
    }
}
