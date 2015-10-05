package Server;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Created by Johan Pettersson on 2015-10-05 21:42.
 * At Kungliga Tekniska Högskolan (KTH) in Sweden.
 * Contact: johanp7@kth.se
 */

public interface Power extends Remote {
    public double calcPower(double x, int n) throws RemoteException;
}
