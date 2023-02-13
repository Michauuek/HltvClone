package com.michau.hltvclone.map;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1//map")
public class MapController {
    private final MapService mapService;

    public MapController(MapService mapService) {
        this.mapService = mapService;
    }

    @GetMapping("/{name}")
    @CrossOrigin
    public MapResponse getMapByName(@PathVariable("name") String name) {
        var map = new MapResponse(1, "Mirage", "dupa.png");
        /*return mapService.getMapByName(name)*/
        return map;
    }

    @GetMapping("/all")
    public List<MapResponse> getMapPool() {
        return mapService.getMapPool();
    }
}
