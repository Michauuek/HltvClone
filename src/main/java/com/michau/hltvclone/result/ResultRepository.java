package com.michau.hltvclone.result;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ResultRepository extends JpaRepository<Result, Long> {
    @Query(value = "SELECT * FROM result WHERE match_id = ?1", nativeQuery = true)
    List<Result> findAllByMatchId(long matchId);
}
