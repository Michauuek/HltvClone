package com.michau.hltvclone.player;

import com.michau.hltvclone.player.dto.PlayerResponse;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PlayerService {
    private final PlayerRepository playerRepository;

    public PlayerService(PlayerRepository playerRepository) {
        this.playerRepository = playerRepository;
    }

    public List<PlayerResponse> getTeamPlayers(String teamName) {

        if(teamName == null || teamName.isEmpty()) {
            return null;
        }
        var playerEntity = playerRepository.findByTeamNameIgnoreCase(teamName.toLowerCase());

        return playerEntity
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
