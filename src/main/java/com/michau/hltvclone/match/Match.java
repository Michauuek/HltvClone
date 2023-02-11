package com.michau.hltvclone.match;

import com.michau.hltvclone.team.Team;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Set;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Match {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long matchId;
    @Column(name = "MATCH_DATE")
    private LocalDate date;
    @Column(name = "MATCH_TIME")
    private LocalTime time;
    @ManyToMany
    @JoinTable(
            name = "MATCH_TEAM",
            joinColumns =  @JoinColumn(name = "MATCH_ID"),
            inverseJoinColumns = @JoinColumn(name = "TEAM_ID"))
    private Set<Team> teams;

    //format - BO1

    //status

    //maps

}
