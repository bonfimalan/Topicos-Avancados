package server.machine.states;

import java.util.Random;

import server.machine.GumballMachine;

public class HasQuarterState implements State {
    private Random random = new Random(System.currentTimeMillis());
    private transient GumballMachine machine;

    public HasQuarterState(GumballMachine machine) {
        this.machine = machine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("You can't insert another quarter");
    }

    @Override
    public void ejectQuarter() {
        machine.setState(new NoQuarterState(machine));
        System.out.println("Quarter returned");
    }

    @Override
    public void turnCrank() {
        System.out.println("You turned");
        int winner = random.nextInt(10);
        if(winner == 0 && machine.getCount() > 1) {
            machine.setState(new WinnerState(machine));
            return;
        }

        machine.setState(new SoldState(machine));
        machine.dispense();
    }

    @Override
    public void dispense() {
        System.out.println("No gumball dispensed");
    }
    
}
