package com.michau.hltvclone.result;

import com.michau.hltvclone.match.Match;
import com.michau.hltvclone.team.Team;
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
public class Result {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long resultId;
    @Column(name = "TEAM_ONE_SCORE")
    private long teamOneScore;
    @Column(name = "TEAM_TWO_SCORE")
    private long teamTwoScore;
    @ManyToOne
    @JoinColumn(name="MATCH_ID")
    private Match match;
    @Column(name = "MAP_NAME")
    private String mapName;
}
