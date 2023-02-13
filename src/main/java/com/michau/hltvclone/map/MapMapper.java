package com.michau.hltvclone.map;

import com.michau.hltvclone.map.model.MapRequest;
import com.michau.hltvclone.map.model.MapResponse;
import org.springframework.stereotype.Component;

@Component
public class MapMapper {
    public Map toMap(MapRequest mapRequest) {
        return Map
                .builder()
                .name(mapRequest.getName())
                .imageUrl(mapRequest.getImageUrl())
                .build();
    }

    public MapResponse toResponse(Map map) {
        return MapResponse
                .builder()
                .mapId(map.getMapId())
                .name(map.getName())
                .imageUrl(map.getImageUrl())
                .build();
    }
}
