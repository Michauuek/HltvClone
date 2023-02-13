package com.michau.hltvclone.event.model;

import jakarta.persistence.Column;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;

@Data
@Builder
public class EventResponse {
    private long eventId;
    private String name;
    private String organizer;
    private LocalDate startDate;
    private LocalDate endDate;
    private long prizePool;
    private String location;
}
