package com.michau.hltvclone.map.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class MapRequest {
    private String name;
    private String imageUrl;
}
