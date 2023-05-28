package server;

import java.lang.reflect.InvocationTargetException;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.util.Random;

import server.machine.GumballMachine;
import server.machine.states.State;

public class MainServer {
    public static void main(String[] args) {
        try {
            var machineName = "gumball-machine";
            var machine = new GumballMachine(machineName, 100);

            runThread(machine);

            Naming.rebind("//localhost:9009/" + machineName, machine);
        } catch (RemoteException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

    private static void runThread(GumballMachine machine) {
        new Thread(() -> {
            try {               
                Thread.sleep(50);

                while(machine.getCount() > 0) {
                    rundomActionInGumballMachine(machine);
                    Thread.sleep(1000);
                }

                System.out.println("No more gumballs :(");
            } catch (InterruptedException e) {
            }
        }).start();
    }

    private static void rundomActionInGumballMachine(State machine) {
        var stateMethods = State.class.getMethods();
        var randomOption = new Random().nextInt(stateMethods.length);

        try {
            stateMethods[randomOption].invoke(machine);
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}