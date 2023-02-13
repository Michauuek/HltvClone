package com.michau.hltvclone.event;


import com.michau.hltvclone.event.model.EventRequest;
import com.michau.hltvclone.event.model.EventResponse;
import org.springframework.stereotype.Component;

@Component
public class EventMapper {

    public Event toEvent(EventRequest request) {
        return Event.
                builder()
                .name(request.getName())
                .location(request.getLocation())
                .endDate(request.getEndDate())
                .startDate(request.getStartDate())
                .organizer(request.getOrganizer())
                .prizePool(request.getPrizePool())
                .build();
    }

    public EventResponse toResponse(Event event) {
        return EventResponse
                .builder()
                .eventId(event.getEventId())
                .name(event.getName())
                .location(event.getLocation())
                .endDate(event.getEndDate())
                .startDate(event.getStartDate())
                .organizer(event.getOrganizer())
                .prizePool(event.getPrizePool())
                .build();
    }
}
