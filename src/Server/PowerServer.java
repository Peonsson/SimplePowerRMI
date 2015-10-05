package Server;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * Created by johanpettersson on /201510/05.
 */
public class PowerServer {

    public static void main(String[] args) {
        try {
            PowerImpl pow = new PowerImpl();
            Naming.bind("power", pow);
        } catch (Exception e) {
            System.err.println("Error initializing power: " + e.toString());
        }
    }
}
