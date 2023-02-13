package com.michau.hltvclone.event;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


/**
 * Add query and format like normal sql - in repo - DONE
 * Add eq api/v1/ to controllers -DONE
 * Add response entities
 * Add readme
 * Test code
 */
@RestController
@RequestMapping("/api/v1/event")
public class EventController {
    private final EventService eventService;

    public EventController(EventService eventService) {
        this.eventService = eventService;
    }
    @GetMapping("/{id}")
    public EventResponse getEventById(@PathVariable("id") Long id) {
        return eventService.getEventById(id);
    }

    @GetMapping("/siema")
    public ResponseEntity<String> siema(){
        return new ResponseEntity<>("Siema", HttpStatus.OK);
    }
}
