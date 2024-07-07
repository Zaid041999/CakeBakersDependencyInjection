package com.assignment1.cakebaker.week1.CakeBakerAssignment;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name = "cake.syrup",havingValue = "strawberry")
public class StrawberrySyrup implements Syrup{

    public String getSyrup(){
        return "Strawberry ";
    }
}
