package com.michau.hltvclone.event;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EventRepository extends JpaRepository<Event, Long> {

    @Query(
            value = "SELECT * " +
                    "FROM event " +
                    "ORDER BY start_date DESC " +
                    "LIMIT ?1",
            nativeQuery = true
    )
    List<Event> findLatestEvents(int numberOfEvents);
}
