package com.michau.hltvclone.event.model;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;

@Data
@Builder
public class EventRequest {
    private String name;
    private String organizer;
    private LocalDate startDate;
    private LocalDate endDate;
    private long prizePool;
    private String location;
}
