package com.michau.hltvclone.map;


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
public class Map {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long mapId;

    @Column(name = "MAP_NAME")
    private String name;

    @Column(name = "IMG_URL")
    private String imageUrl;
}
