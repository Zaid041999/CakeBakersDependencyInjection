package com.assignment1.cakebaker.week1.CakeBakerAssignment;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name = "cake.syrup",havingValue = "chocolate")
public class ChocolateSyrup implements Syrup {

   public String getSyrup(){
        return "Chocolate ";
    }



}
