package com.michau.hltvclone.event;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/event")
public class EventController {
    private final EventService eventService;

    public EventController(EventService eventService) {
        this.eventService = eventService;
    }

    @GetMapping("/{id}")
    public EventResponse getEventById(@PathVariable("id") long id) {
        return eventService.getEventById(id);
    }

    @GetMapping("/siema")
    public ResponseEntity<String> siema(){
        return new ResponseEntity<>("Siema", HttpStatus.OK);
    }
}
