package com.michau.hltvclone.team;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TeamRepository extends JpaRepository<Team, Long> {
    @Query(
            value =
                    "SELECT * " +
                    "FROM team " +
                    "WHERE LOWER(team_name) = ?1",
            nativeQuery = true
    )
    Team findByName(String name);


    @Query(
            value = "SELECT * " +
                    "FROM team " +
                    "ORDER BY ranking_points DESC " +
                    "LIMIT ?1",
            nativeQuery = true
    )
    List<Team> findBestTeams(int numberOfTeams);
}
