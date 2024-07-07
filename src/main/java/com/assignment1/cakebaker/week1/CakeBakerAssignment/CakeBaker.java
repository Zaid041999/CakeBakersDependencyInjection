package com.assignment1.cakebaker.week1.CakeBakerAssignment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CakeBaker {
    @Autowired
    private Syrup syrup;

    @Autowired
    private Frosting frosting;

    void bakeCake(){
        System.out.println("Making the cake of "+ frosting.getFrosting()+ "frosting and " + syrup.getSyrup()+"syrup");
    }

}
