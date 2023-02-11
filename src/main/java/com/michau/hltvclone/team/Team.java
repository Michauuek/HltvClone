package com.michau.hltvclone.team;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.michau.hltvclone.match.Match;
import com.michau.hltvclone.player.Player;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

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

    @Column(name = "RANKING_POINTS")
    private long rankingPoints;

    @Column(name = "AVG_PLAYER_AGE")
    private double avgPlayerAge;

    @OneToMany(mappedBy = "team", cascade = CascadeType.ALL)
    @JsonIgnore
    private Set<Player> players;

    @ManyToMany(mappedBy = "teams")
    @JsonIgnore
    private Set<Match> matches;
}
