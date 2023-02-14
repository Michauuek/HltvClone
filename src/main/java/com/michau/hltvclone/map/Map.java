package com.michau.hltvclone.map;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.michau.hltvclone.match.Match;
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
public class Map {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long mapId;
    @Column(name = "MAP_NAME")
    private String name;
    @Column(name = "IMG_URL")
    private String imageUrl;

    @ManyToMany(mappedBy = "maps")
    @JsonIgnore
    private Set<Match> matches;
}
