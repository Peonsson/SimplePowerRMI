package Server;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * Created by Johan Pettersson on 2015-10-05 21:39.
 * At Kungliga Tekniska Högskolan (KTH) in Sweden.
 * Contact: johanp7@kth.se
 */

public class PowerServer {

    public static void main(String[] args) {
        try {
            PowerImpl pow = new PowerImpl();
            Naming.bind("power", pow);
            System.out.println("Power initialized");
        } catch (Exception e) {
            System.err.println("Error initializing power: " + e.toString());
        }
    }
}
