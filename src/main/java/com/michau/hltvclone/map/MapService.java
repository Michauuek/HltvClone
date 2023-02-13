package com.michau.hltvclone.map;

import com.michau.hltvclone.map.model.MapResponse;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MapService {
    private final MapRepository mapRepository;

    public MapService(MapRepository mapRepository) {
        this.mapRepository = mapRepository;
    }


    public MapResponse getMapByName(String name) {

        if(name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Name cannot be null or empty");
        }

        var map = mapRepository.findByName(name);

        return MapResponse
                .builder()
                .mapId(map.getMapId())
                .imageUrl(map.getImageUrl())
                .name(map.getName())
                .build();
    }

    public List<MapResponse> getMapPool() {
        var maps = mapRepository.findAll();

        return maps.stream().map(map ->
                MapResponse
                        .builder()
                        .mapId(map.getMapId())
                        .imageUrl(map.getImageUrl())
                        .name(map.getName())
                        .build()
                ).toList();
    }
}
