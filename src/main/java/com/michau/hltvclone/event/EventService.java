package com.michau.hltvclone.event;

import com.michau.hltvclone.event.model.EventResponse;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventService {
    private final EventRepository eventRepository;
    private final EventMapper eventMapper;

    public EventService(EventRepository eventRepository, EventMapper eventMapper) {
        this.eventRepository = eventRepository;
        this.eventMapper = eventMapper;
    }

    public EventResponse getEventById(long id) {
        var event = eventRepository.findById(id);
        return null;
    }

    public List<EventResponse> getLatestEvents(Integer numberOfEvents) {
        if(numberOfEvents < 1) {
            throw new IllegalArgumentException("Number of events must be greater than 0");
        }

        var events = eventRepository.findLatestEvents(numberOfEvents);

        return events
                .stream()
                .map(eventMapper::toResponse)
                .toList();
    }
}
