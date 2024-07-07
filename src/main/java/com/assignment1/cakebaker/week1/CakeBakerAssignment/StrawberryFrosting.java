package com.assignment1.cakebaker.week1.CakeBakerAssignment;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name = "cake.frosting",havingValue = "strawberry")
public class StrawberryFrosting implements Frosting{
    @Override
    public String getFrosting() {
        return "Strawberry ";
    }
}
