package com.apress.dto;
import java.util.Collection;
import java.util.Map;

public class VoteResult {
    private int totalVotes;
    private Collection<OptionCount> results;

    public void setTotalVotes(int totalVotes) {
        this.totalVotes = totalVotes;
    }

    public int getTotalVotes(int totalVotes) {
       return totalVotes;
    }

    public void setResults(Collection<OptionCount> tempMap) {
        results = tempMap;
    }
    public Collection<OptionCount> getResults() {
        return results;
    }



}