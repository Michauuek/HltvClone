package com.michau.hltvclone.map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/map")
public class MapController {
    private final MapService mapService;

    public MapController(MapService mapService) {
        this.mapService = mapService;
    }

    @GetMapping("/{name}")
    public MapResponse getMapByName(@PathVariable("name") String name) {
        return mapService.getMapByName(name);
    }

    @GetMapping("/all")
    public List<MapResponse> getMapPool() {
        return mapService.getMapPool();
    }
}
