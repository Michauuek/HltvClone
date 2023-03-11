package com.michau.hltvclone.admin;

import com.michau.hltvclone.player.model.PlayerRequest;
import com.michau.hltvclone.player.model.PlayerResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/admin/player")
public class PlayerAdminController {
    private final PlayerAdminService playerService;

    public PlayerAdminController(PlayerAdminService playerService) {
        this.playerService = playerService;
    }

    @PostMapping("/create")
    public ResponseEntity<PlayerResponse> addPlayer(@RequestBody PlayerRequest playerRequest) {
        return new ResponseEntity<>(
                playerService.addPlayer(playerRequest), HttpStatus.CREATED);
    }

}
