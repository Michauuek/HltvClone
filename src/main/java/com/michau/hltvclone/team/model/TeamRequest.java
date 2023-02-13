package com.michau.hltvclone.team.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class TeamRequest {
    private String name;
    private String country;
    private String logoUrl;
    private long rankingPoints;
    private double avgPlayerAge;
}
