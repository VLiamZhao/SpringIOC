package com.ccgg.stereotype;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class TravelBook implements Book{
    @Override
    public String toString(){
        return "This is the Travel Book!";
    }
}
