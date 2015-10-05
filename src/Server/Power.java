package Server;

/**
 * Created by johanpettersson on /201510/05.
 */
public interface Power extends java.rmi.Remote {
    public double calcPower(double x, int n) throws java.rmi.RemoteException;
}