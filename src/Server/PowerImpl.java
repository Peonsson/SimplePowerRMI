package Server;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * Created by Johan Pettersson on 2015-10-05 21:39.
 * At Kungliga Tekniska Högskolan (KTH) in Sweden.
 * Contact: johanp7@kth.se
 */

public class PowerImpl extends UnicastRemoteObject implements Power {

    public PowerImpl() throws RemoteException {
        super();
    }

    @Override
    public double calcPower(double x, int n) throws RemoteException {
        int abs = Math.abs(n);
        double res = 1;
        for (int i = 0; i < abs; i++) {
            res = res * x;
        }
        return (n >= 0 ? res : 1 / res);
    }
}