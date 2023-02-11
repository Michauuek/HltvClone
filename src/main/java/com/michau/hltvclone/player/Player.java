package com.michau.hltvclone.player;

import com.michau.hltvclone.team.Team;
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

    @Column(name = "COUNTRY")
    private String country;

    @Column(name ="BIRTH_DATE")
    private LocalDate birthDate;

    @ManyToOne
    @JoinColumns({
            @JoinColumn(name="TEAM_ID", referencedColumnName="TEAM_ID"),
            @JoinColumn(name="TEAM_NAME", referencedColumnName="TEAM_NAME")
    })
    private Team team;

    //previous teams


}
