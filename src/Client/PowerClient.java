package Client;

/**
 * Created by johanpettersson on /201510/05.
 */

import Server.Power;

import java.rmi.*;

public class PowerClient {

    public static void main(String[] args) {
        try {
            Power pow = (Power) Naming.lookup("rmi://localhost/power");
            double res;
            double x = 12;
            int n = 3;
            res = pow.calcPower(x, n);
            System.out.println("" + x + "^" + n + " = " + res);
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
}
