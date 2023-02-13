package com.michau.hltvclone.player;

import com.michau.hltvclone.player.model.PlayerResponse;
import com.michau.hltvclone.player.exception.PlayersNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlayerService {
    private final PlayerRepository playerRepository;
    private final PlayerMapper playerMapper;

    public PlayerService(PlayerRepository playerRepository, PlayerMapper playerMapper) {
        this.playerRepository = playerRepository;
        this.playerMapper = playerMapper;
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
                .map(playerMapper::toResponse)
                .toList();
    }
}
