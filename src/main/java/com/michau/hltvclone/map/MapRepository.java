package com.michau.hltvclone.map;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface MapRepository extends JpaRepository<Map, Long> {

    @Query(
            value = "SELECT * " +
                    "FROM map " +
                    "WHERE LOWER(name) = ?1",
            nativeQuery = true
    )
    Map findByName(String name);
}
