package Client;

/**
 * Created by Johan Pettersson on 2015-10-05 21:39.
 * At Kungliga Tekniska Högskolan (KTH) in Sweden.
 * Contact: johanp7@kth.se
 */

import Server.Power;

import java.rmi.*;

public class PowerClient {

    public static void main(String[] args) {
        try {
            String url = "rmi://localhost/power";
            Power pow = (Power) Naming.lookup(url);
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
