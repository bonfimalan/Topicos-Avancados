package server.remote;

import java.rmi.Remote;
import java.rmi.RemoteException;

import client.monitor.GumballMonitor;
import server.machine.states.State;

public interface GumballMachineRemote extends Remote {
    int getCount() throws RemoteException;
    String getLocation() throws RemoteException;
    State getState() throws RemoteException;

    // Observer
    void add(GumballMonitor monitor) throws RemoteException;
    void remove(GumballMonitor monitor) throws RemoteException;
}
