package com.michau.hltvclone.player.model;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;

@Data
@Builder
public class PlayerRequest {
    private String firstName;
    private String lastName;
    private String nickname;
    private String country;
    private LocalDate birthDate;
    private String teamName;
}
