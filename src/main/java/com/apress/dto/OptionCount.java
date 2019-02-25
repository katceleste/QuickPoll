package com.apress.dto;

public class OptionCount {
    private Long optionId;
    private int count;

    public void setOptionId(Long id) {
        optionId = id;
    }

    public int getCount() {
        return count;
    }

    public int setCount(int count) {
        this.count = count;
        // Change return object here!!!
        return count;
    }
}
