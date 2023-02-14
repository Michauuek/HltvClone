package com.michau.hltvclone.map;

import com.michau.hltvclone.map.model.MapResponse;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/map")
public class MapController {
    private final MapService mapService;

    public MapController(MapService mapService) {
        this.mapService = mapService;
    }

    @GetMapping("/{name}")
    @CrossOrigin
    public MapResponse getMapByName(@PathVariable("name") String name) {
        return null;
    }

    @GetMapping("/all")
    public List<MapResponse> getMapPool() {
        return mapService.getMapPool();
    }
}
