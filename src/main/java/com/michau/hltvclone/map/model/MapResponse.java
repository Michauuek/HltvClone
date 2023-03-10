package com.michau.hltvclone.map.model;

import jakarta.persistence.Column;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class MapResponse {
    private long mapId;
    private String name;
    private String imageUrl;
}
