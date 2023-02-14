package com.michau.hltvclone.match;

import com.michau.hltvclone.map.Map;
import com.michau.hltvclone.result.Result;
import com.michau.hltvclone.team.Team;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

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
    @Column(name = "MATCH_FORMAT")
    @Enumerated(EnumType.STRING)
    private MatchFormat format;
    @Column(name = "MATCH_STATUS")
    @Enumerated(EnumType.STRING)
    private MatchStatus status;
    @ManyToMany
    @JoinTable(
            name = "MATCH_TEAM",
            joinColumns =  @JoinColumn(name = "MATCH_ID"),
            inverseJoinColumns = @JoinColumn(name = "TEAM_ID"))
    private List<Team> teams;
    @OneToMany(mappedBy = "match")
    private List<Result> results;

    @ManyToMany
    @JoinTable(
            name = "MATCH_MAP",
            joinColumns =  @JoinColumn(name = "MATCH_ID"),
            inverseJoinColumns = @JoinColumn(name = "MAP_ID"))
    private List<Map> maps;

}
