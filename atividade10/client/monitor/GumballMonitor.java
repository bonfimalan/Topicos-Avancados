package client.monitor;

import java.io.Serializable;
import java.rmi.RemoteException;

import server.remote.GumballMachineRemote;

public class GumballMonitor implements Serializable {
    private GumballMachineRemote machine;

    public GumballMonitor(GumballMachineRemote machine) throws RemoteException {
        this.machine = machine;
        machine.add(this);
    }

    public void report() {
        try {
            System.out.println("\n=======================================================");
            System.out.printf("Gumball Machine: %s\t\t\n", machine.getLocation());
            System.out.printf("Current Inventory: %d\t\t\n", machine.getCount());
            System.out.printf("Current State: %s\t\t\n", machine.getState().toString());
            System.out.printf("Monitor object: %s\t\t\n", this);
            System.out.println("=======================================================\n");
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }
}
