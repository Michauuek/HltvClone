package com.michau.hltvclone.player;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Player {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "PLAYER_ID")
    private long id;

    @Column(name = "NAME")
    private String firstName;

    @Column(name = "LAST_NAME")
    private String lastName;

    @Column(name = "NICKNAME")
    private String nickname;

    @Column(name ="BIRTH_DATE")
    private LocalDate birthDate;

    //current team
    @Column(name = "TEAM")
    private String team;

    //previous teams


}
