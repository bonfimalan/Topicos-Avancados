package server.machine;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.List;

import client.monitor.GumballMonitor;
import server.machine.states.NoQuarterState;
import server.machine.states.State;
import server.remote.GumballMachineRemote;

public class GumballMachine extends UnicastRemoteObject implements GumballMachineRemote, State {
    private State state = new NoQuarterState(this);
    private String location;
    private List<GumballMonitor> monitors;

    private int count;

    public GumballMachine(String localtion, int count) throws RemoteException {
        this.location = localtion;
        this.count = count;
        this.monitors = new ArrayList<>();

        if(count > 0) {
            state = new NoQuarterState(this);
        }
    }

    public void insertQuarter() {
        state.insertQuarter();
    }

    public void ejectQuarter() {
        state.ejectQuarter();
    }

    public void turnCrank() {
        state.turnCrank();
    }

    public void dispense() {
        state.dispense();
    }

    @Override
    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void setState(State state) {
        this.state = state;
        notifyOb();
    }

    @Override
    public State getState() {
        return state;
    }
    
    @Override
    public String getLocation() {
        return location;
    }

    @Override
    public String toString() {
        return "State: " + state.toString();
    }

    public void releaseBall() {
        System.out.println("Your bonus gumball comes rolling out of the slot");
        count--;
    }

    @Override
    public void add(GumballMonitor monitor) {
        monitors.add(monitor);
    }

    @Override
    public void remove(GumballMonitor monitor) {
        monitors.remove(monitor);
    }

    private void notifyOb() {
        monitors.forEach(monitor -> monitor.report());
    }
}
