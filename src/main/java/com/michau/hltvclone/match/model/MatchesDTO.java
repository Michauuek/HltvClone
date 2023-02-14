package com.michau.hltvclone.match.model;

import com.michau.hltvclone.result.model.ResultResponse;
import lombok.Data;
import org.springframework.data.domain.Page;

import java.util.List;

@Data
public class MatchesDTO {
    private List<MatchResponse> results;
    private long totalElements;
    private int totalPages;
    private int intCurrentPage;
    private boolean isFirst;
    private boolean isLast;


    public MatchesDTO(Page<MatchResponse> resultsPage){
        this.results = resultsPage.getContent();
        this.totalElements = resultsPage.getTotalElements();
        this.totalPages = resultsPage.getTotalPages();
        this.intCurrentPage = resultsPage.getNumber() + 1;
        this.isFirst = resultsPage.isFirst();
        this.isLast = resultsPage.isLast();
    }
}
