package com.michau.hltvclone.news;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Columns;

import java.time.LocalDate;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class News {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long newsId;

    @Column(name = "TITLE")
    private String title;

    @Column(name = "CONTENT")
    private String content;

    @Column(name = "UPLOAD_DATE")
    private LocalDate uploadDate;

}
