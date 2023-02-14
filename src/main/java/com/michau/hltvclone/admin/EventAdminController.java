package com.michau.hltvclone.admin;

import com.michau.hltvclone.event.model.EventRequest;
import com.michau.hltvclone.event.model.EventResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/admin/event")
public class EventAdminController {
    private final EventAdminService adminService;

    public EventAdminController(EventAdminService adminService) {
        this.adminService = adminService;
    }

    @PostMapping("/create")
    public ResponseEntity<EventResponse> addEvent(@RequestBody EventRequest eventRequest) {
        return new ResponseEntity<>(adminService.addEvent(eventRequest), HttpStatus.CREATED);
    }
}
