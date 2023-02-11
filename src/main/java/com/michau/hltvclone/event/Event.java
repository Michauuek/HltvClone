package com.michau.hltvclone.event;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long eventId;

    @Column(name = "EVENT_NAME")
    private String name;

    @Column(name = "ORGANIZER_NAME")
    private String organizer;

    @Column(name = "START_DATE")
    private LocalDate startDate;

    @Column(name = "END_DATE")
    private LocalDate endDate;

    @Column(name = "PRIZE_POOL")
    private long prizePool;

    @Column(name = "LOCATION")
    private String location;
}
