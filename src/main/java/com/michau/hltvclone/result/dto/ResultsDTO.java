package com.michau.hltvclone.result.dto;


import lombok.Builder;
import lombok.Data;
import org.springframework.data.domain.Page;

import java.util.List;

@Data
public class ResultsDTO {
    private List<ResultResponse> results;
    private long totalElements;
    private int totalPages;
    private int intCurrentPage;
    private boolean isFirst;
    private boolean isLast;


    public ResultsDTO(Page<ResultResponse> resultsPage){
        this.results = resultsPage.getContent();
        this.totalElements = resultsPage.getTotalElements();
        this.totalPages = resultsPage.getTotalPages();
        this.intCurrentPage = resultsPage.getNumber() + 1;
        this.isFirst = resultsPage.isFirst();
        this.isLast = resultsPage.isLast();
    }
}
