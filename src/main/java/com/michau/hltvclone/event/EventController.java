package com.michau.hltvclone.event;

import com.michau.hltvclone.event.model.EventResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


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
    public ResponseEntity<EventResponse> getEventById(@PathVariable("id") Long id) {
        return new ResponseEntity<>(
                eventService.getEventById(id), HttpStatus.OK);
    }

    @GetMapping("/latest/{amount}")
    public ResponseEntity<List<EventResponse>> getLatestEvents(@PathVariable("amount") Integer amount) {
        return new ResponseEntity<>(
                eventService.getLatestEvents(amount), HttpStatus.OK);
    }
}
