package com.ccgg.stereotype;

import org.springframework.stereotype.Component;

@Component
public class HistoryBook implements Book{
    @Override
    public String toString() {
        return "This is the History Book!";
    }
}
