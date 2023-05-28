package client;

import java.rmi.Naming;

import client.monitor.GumballMonitor;
import server.remote.GumballMachineRemote;

public class MainClient {
    public static void main(String[] args) {
        String location = "rmi://localhost:9009/gumball-machine";
        try {
            var machine = (GumballMachineRemote) Naming.lookup(location);
            var monitor = new GumballMonitor(machine);
            System.out.println(monitor);
            monitor.report();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
