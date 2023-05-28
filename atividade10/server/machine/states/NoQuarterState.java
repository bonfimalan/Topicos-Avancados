package server.machine.states;

import server.machine.GumballMachine;

public class NoQuarterState implements State {
    private transient GumballMachine machine;

    public NoQuarterState(GumballMachine machine) {
        this.machine = machine;
    }

    @Override
    public void insertQuarter() {
        machine.setState(new HasQuarterState(machine));
        System.out.println("You inserted a quarter");
    }

    @Override
    public void ejectQuarter() {
        machine.setState(new HasQuarterState(machine));
        System.out.println("You haven't inserted a quarter");
    }

    @Override
    public void turnCrank() {
        System.out.println("You turned but there's no quarter");
    }

    @Override
    public void dispense() {
        machine.setState(new HasQuarterState(machine));
        System.out.println("You have to pay first");
    }
    
}
