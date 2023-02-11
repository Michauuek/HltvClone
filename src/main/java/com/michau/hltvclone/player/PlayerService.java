package com.michau.hltvclone.player;

import com.michau.hltvclone.player.dto.PlayerResponse;
import com.michau.hltvclone.player.exception.PlayersNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlayerService {
    private final PlayerRepository playerRepository;

    public PlayerService(PlayerRepository playerRepository) {
        this.playerRepository = playerRepository;
    }

    public List<PlayerResponse> getTeamPlayers(String teamName) {

        if(teamName == null || teamName.isEmpty()) {
            throw new IllegalArgumentException("Name cannot be empty");
        }
        var teamPlayers = playerRepository.findByTeamNameIgnoreCase(teamName.toLowerCase());

        if(teamPlayers.isEmpty()){
            throw new PlayersNotFoundException();
        }

        return teamPlayers
                .stream()
                .map(player -> PlayerResponse
                        .builder()
                        .id(player.getId())
                        .firstName(player.getFirstName())
                        .lastName(player.getLastName())
                        .teamName(player.getTeam().getName())
                        .nickname(player.getNickname())
                        .birthDate(player.getBirthDate())
                        .country(player.getCountry())
                        .build()
                ).toList();
    }
}
