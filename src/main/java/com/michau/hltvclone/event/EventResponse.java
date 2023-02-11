package com.michau.hltvclone.event;

import jakarta.persistence.Column;

import java.time.LocalDate;

public class EventResponse {
    private long eventId;
    private String name;
    private String organizer;

    private LocalDate startDate;

    private LocalDate endDate;

    private long prizePool;

    private String location;
}
