package com.michau.hltvclone.match;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface MatchRepository extends JpaRepository<Match, Long> {
    @Query(
            value = "SELECT * " +
                    "FROM match " +
                    "WHERE match_date = ?1",
            nativeQuery = true
    )
    List<Match> findAllByDate(LocalDate date);
}
