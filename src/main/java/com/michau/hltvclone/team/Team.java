package com.michau.hltvclone.team;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Team {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "TEAM_ID")
    private long id;

    @Column(name = "TEAM_NAME")
    private String name;

    @Column(name = "COUNTRY")
    private String country;

    @Column(name = "LOGO_URL")
    private String logoUrl;

    @Column(name = "WORLD_RANKING")
    private long worldRanking;

    @Column(name = "AVG_PLAYER_AGE")
    private double avgPlayerAge;
}
