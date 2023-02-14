package com.michau.hltvclone.admin;

import com.michau.hltvclone.event.EventMapper;
import com.michau.hltvclone.event.EventRepository;
import com.michau.hltvclone.event.model.EventRequest;
import com.michau.hltvclone.event.model.EventResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EventAdminService {
    private final EventRepository eventRepository;
    private final EventMapper eventMapper;

    public EventResponse addEvent(EventRequest eventRequest) {
        var event = eventRepository.save(eventMapper.toEvent(eventRequest));
        return eventMapper.toResponse(event);
    }
}
