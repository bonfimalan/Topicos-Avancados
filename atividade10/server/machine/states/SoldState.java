package server.machine.states;

import server.machine.GumballMachine;

public class SoldState implements State {
    private transient GumballMachine machine;

    public SoldState(GumballMachine machine) {
        this.machine = machine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("You can't insert a quarter, the machine is sold out");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Sorry, you already turned the crank");
    }

    @Override
    public void turnCrank() {
        System.out.println("Turning twice doesn't give you another gumball");
    }

    @Override
    public void dispense() {
        System.out.println("A gumball comes rolling out of the slot");
        machine.setCount(machine.getCount() - 1);
        
        if(machine.getCount() == 0) {
            System.out.println("Oops, out of gumballs");
            machine.setState(new SoldOutState(machine));
            return;
        }
        machine.setState(new NoQuarterState(machine));
    }
    
}
