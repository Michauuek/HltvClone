package com.michau.hltvclone.news;

import com.michau.hltvclone.team.Team;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NewsRepository extends JpaRepository<News, Long> {
    @Query(
            value = "SELECT * " +
                    "FROM news " +
                    "ORDER BY upload_date DESC " +
                    "LIMIT ?1",
            nativeQuery = true
    )
    List<News> findLatestNews(int numOfDays);
}
