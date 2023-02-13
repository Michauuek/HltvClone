package com.michau.hltvclone.player;

import com.michau.hltvclone.player.model.PlayerResponse;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/player")
public class PlayerController {
    private final PlayerService playerService;
    public PlayerController(PlayerService playerService) {
        this.playerService = playerService;
    }

    @RequestMapping("/team/{teamName}")
    public List<PlayerResponse> getTeamPlayers(@PathVariable("teamName") String teamName) {
        return playerService.getTeamPlayers(teamName);
    }
}
