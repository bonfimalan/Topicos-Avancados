package server.machine.states;

import server.machine.GumballMachine;

public class WinnerState implements State {
    private transient GumballMachine machine;

    public WinnerState(GumballMachine machine) {
        this.machine = machine;
    }

    @Override
    public void insertQuarter() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'insertQuarter'");
    }

    @Override
    public void ejectQuarter() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'ejectQuarter'");
    }

    @Override
    public void turnCrank() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'turnCrank'");
    }

    @Override
    public void dispense() {
        System.out.println("YOU'RE A WINNER! You get two gumballs for your quarter");
        if(machine.getCount() == 0) {
            machine.setState(new SoldOutState(machine));
            return;
        }
        
        machine.releaseBall();

        if(machine.getCount() > 0) {
            machine.setState(new NoQuarterState(machine));
            return;
        }
        
        machine.setState(new SoldOutState(machine));
    }
    
}
