package com.michau.hltvclone.team;

import com.michau.hltvclone.team.model.TeamRequest;
import com.michau.hltvclone.team.model.TeamResponse;
import org.springframework.stereotype.Component;

@Component
public class TeamMapper {
    public Team toTeam(TeamRequest request) {
        return Team
                .builder()
                .name(request.getName())
                .country(request.getCountry())
                .rankingPoints(request.getRankingPoints())
                .avgPlayerAge(request.getAvgPlayerAge())
                .logoUrl(request.getLogoUrl())
                .build();
    }

    public TeamResponse toResponse(Team team) {
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
