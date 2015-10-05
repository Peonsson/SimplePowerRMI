package Client;

/**
 * Created by johanpettersson on /201510/05.
 */


import java.rmi.*;

public class PowerClient {

    public interface Power extends java.rmi.Remote {
        public double calcPower(double x, int n) throws java.rmi.RemoteException;
    }

    public static void main(String[] args) {
        try {
            Power pow = (Power) Naming.lookup("rmi://" + args[0] + "/power");
            double res, x = 12;
            int n = 3;
            res = pow.calcPower(x, n);
            System.out.println("" + x + "^" + n + " = " + res);
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
}
