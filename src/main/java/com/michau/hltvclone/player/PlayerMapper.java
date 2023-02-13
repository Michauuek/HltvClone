package com.michau.hltvclone.player;

import com.michau.hltvclone.player.model.PlayerRequest;
import com.michau.hltvclone.player.model.PlayerResponse;
import org.springframework.stereotype.Component;

@Component
public class PlayerMapper {
    public Player toPlayer(PlayerRequest request) {
        return Player
                .builder()
                .firstName(request.getFirstName())
                .lastName(request.getLastName())
                .birthDate(request.getBirthDate())
                .country(request.getCountry())
                .nickname(request.getNickname())
                .build();
    }

    public PlayerResponse toResponse(Player player) {
        return PlayerResponse
                .builder()
                .id(player.getId())
                .firstName(player.getFirstName())
                .lastName(player.getLastName())
                .teamName(player.getTeam().getName())
                .nickname(player.getNickname())
                .birthDate(player.getBirthDate())
                .country(player.getCountry())
                .build();
    }
}
