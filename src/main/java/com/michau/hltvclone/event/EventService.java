package com.michau.hltvclone.event;

import com.michau.hltvclone.event.model.EventResponse;
import org.springframework.stereotype.Service;

@Service
public class EventService {
    private final EventRepository eventRepository;

    public EventService(EventRepository eventRepository) {
        this.eventRepository = eventRepository;
    }

    public EventResponse getEventById(long id) {
        var event = eventRepository.findById(id);
        return null;
    }
}
