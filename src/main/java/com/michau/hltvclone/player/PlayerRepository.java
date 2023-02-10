package com.michau.hltvclone.player;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PlayerRepository extends JpaRepository<Player, Long> {
    @Query(value = "SELECT * FROM player WHERE LOWER(team) = ?1", nativeQuery = true)
    List<Player> findByTeam(String team);
}
