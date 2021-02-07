package com.company;

public class DutyBuilder {

    private final String dutyName;
    private double timeNeeded = 0;
    private int executionDay = -1;
    private String personAssigned = "";

    public DutyBuilder(String dutyName, double timeNeeded, int executionDay, String personAssigned) {
        this.dutyName = dutyName;
        this.timeNeeded = timeNeeded;
        this.executionDay = executionDay;
        this.personAssigned = personAssigned;
    }

    public DutyBuilder(String dutyName) {
        this.dutyName = dutyName;
    }

    public DutyBuilder setTimeNeeded(double timeNeeded) {
        if(timeNeeded >= 0){
            this.timeNeeded = timeNeeded;
        }
        else {
            System.out.println("Czas wykonania musi być większy od 0");
            System.out.println("Ustawiono domyśną wartość (0)");
        }
        return this;
    }

    public DutyBuilder setExecutionDay(int executionDay) {
        if(executionDay >= 1 && executionDay <= 31){
            this.executionDay = executionDay;
        }
        else {
            System.out.println("Dzień wykonania musi wskazywać na dzień w grudniu");
            System.out.println("Ustawiono domyślną wartość (-1)");
        }
        return this;
    }

    public DutyBuilder setPersonAssigned(String personAssigned) {
        this.personAssigned = personAssigned;
        return this;
    }

    public Duty build(){
        return new Duty(dutyName, timeNeeded, executionDay, personAssigned);
    }
}
