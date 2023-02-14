package com.michau.hltvclone.admin;

import com.michau.hltvclone.player.PlayerMapper;
import com.michau.hltvclone.player.PlayerRepository;
import com.michau.hltvclone.player.model.PlayerRequest;
import com.michau.hltvclone.player.model.PlayerResponse;
import org.springframework.stereotype.Service;

@Service
public class PlayerAdminService {
    private final PlayerRepository playerRepository;
    private final PlayerMapper playerMapper;

    public PlayerAdminService(PlayerRepository playerRepository, PlayerMapper playerMapper) {
        this.playerRepository = playerRepository;
        this.playerMapper = playerMapper;
    }

    public PlayerResponse addPlayer(PlayerRequest playerRequest) {
        var player = playerRepository.save(playerMapper.toPlayer(playerRequest));
        return playerMapper.toResponse(player);
    }
}
