package com.company;

public class DutyVisitor {

    public void executeDuties(Duty ... duties){
        for(Duty duty: duties){
            duty.accept(this);
        }
    }

    public void visitDuty(Duty duty){
            duty.execute();
    }
}
