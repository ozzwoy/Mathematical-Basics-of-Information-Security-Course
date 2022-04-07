package cyb.information_security.algo;

import java.math.BigInteger;

import static cyb.information_security.algo.RepeatedSquaringModularExponentiation.powLeftToRight;
import static cyb.information_security.algo.RepeatedSquaringModularExponentiation.powRightToLeft;

public class Main {

    private static void test(BigInteger number, BigInteger power, BigInteger modulo) {
        System.out.println("\n\nEXAMPLE: " + number.toString() + " ^ " + power.toString() +
                " (mod " + modulo.toString() + ") = 1");

        System.out.println("\nLEFT TO RIGHT");
        powLeftToRight(number, power, modulo, System.out);
        System.out.println("\n\nRIGHT TO LEFT");
        powRightToLeft(number, power, modulo, System.out);
    }

    public static void main(String[] args) {
        test(BigInteger.valueOf(7), BigInteger.valueOf(560), BigInteger.valueOf(561));
        test(BigInteger.valueOf(595), BigInteger.valueOf(703), BigInteger.valueOf(991));
    }
}
