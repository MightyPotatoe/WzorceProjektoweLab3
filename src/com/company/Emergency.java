package com.company;

public class Emergency extends Duty {
    private final Duty baseDuty;

    public Emergency(Duty baseDuty) {
        super(baseDuty.getDutyName(), baseDuty.getTimeNeeded(), baseDuty.getExecutionDay(), baseDuty.getPersonAssigned());
        this.baseDuty = baseDuty;
    }

    @Override
    public void execute() {
        System.out.println("WAŻNE!");
        super.execute();
    }
}
