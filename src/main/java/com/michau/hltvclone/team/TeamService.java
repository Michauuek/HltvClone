package com.michau.hltvclone.team;

import com.michau.hltvclone.team.dto.TeamResponse;
import org.springframework.stereotype.Service;

@Service
public class TeamService {
    private final TeamRepository teamRepository;

    public TeamService(TeamRepository teamRepository) {
        this.teamRepository = teamRepository;
    }

    public TeamResponse getTeamByName(String name) {
        if(name == null || name.isEmpty()) {
            return null;
        }

        var team = teamRepository.findByName(name.toLowerCase());

        return TeamResponse
                .builder()
                .id(team.getId())
                .country(team.getCountry())
                .logoUrl(team.getLogoUrl())
                .avgPlayerAge(team.getAvgPlayerAge())
                .rankingPoints(team.getRankingPoints())
                .name(team.getName())
                .build();
    }
}
