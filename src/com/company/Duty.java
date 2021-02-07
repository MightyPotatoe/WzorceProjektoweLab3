package com.company;

import java.time.DayOfWeek;

public class Duty{

    private final String dutyName;
    private double timeNeeded;
    private int executionDay;
    private String personAssigned;

    public Duty(String dutyName) {
        this.dutyName = dutyName;
    }

    public Duty(String dutyName, double timeNeeded, int executionDay, String personAssigned) {
        this.dutyName = dutyName;
        this.timeNeeded = timeNeeded;
        this.executionDay = executionDay;
        this.personAssigned = personAssigned;
    }

    public String getDutyName() {
        return dutyName;
    }

    public double getTimeNeeded() {
        return timeNeeded;
    }

    public int getExecutionDay() {
        return executionDay;
    }

    public String getPersonAssigned() {
        return personAssigned;
    }

    public void execute(){
        System.out.println(dutyName + " - WYKONANO");
    }

    //Wizytor
    public void accept(DutyVisitor visitor){
        if(executionDay == 24){
            visitor.visitDuty(this);
        }
    }
}
