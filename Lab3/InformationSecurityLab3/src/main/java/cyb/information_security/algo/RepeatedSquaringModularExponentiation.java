package cyb.information_security.algo;

import java.io.PrintStream;
import java.math.BigInteger;

public abstract class RepeatedSquaringModularExponentiation {

    public static BigInteger powRightToLeft(BigInteger number, BigInteger power, BigInteger modulo, PrintStream out) {
        BigInteger result = BigInteger.ONE;
        BigInteger current = number;
        int length = power.bitLength();
        String status;

        if (out != null) {
            out.println("\n" + power.toString() + "_2 = " + power.toString(2));
        }

        for (int i = 0; i < length; i++) {
            boolean bit = power.testBit(i);

            if (out != null) {
                if (bit) {
                    out.println("\nCurrent bit: 1");
                } else {
                    out.println("\nCurrent bit: 0");
                }
            }

            if (bit) {
                status = result.toString() + " * " + current.toString() + " (mod " + modulo.toString() + ") = ";
                result = result.multiply(current).mod(modulo);
                if (out != null) {
                    out.println(status + result.toString());
                }
            }

            status = current.toString() + "^2 (mod " + modulo.toString() + ") = ";
            current = current.pow(2).mod(modulo);
            if (out != null) {
                out.println(status + current.toString());
            }
        }

        if (out != null) {
            out.println("\nRESULT: " + result.toString());
        }

        return result;
    }

    public static BigInteger powLeftToRight(BigInteger number, BigInteger power, BigInteger modulo, PrintStream out) {
        BigInteger result = BigInteger.ONE;
        int length = power.bitLength();
        String status;

        if (out != null) {
            out.println("\n" + power.toString() + "_2 = " + power.toString(2));
        }

        for (int i = length - 1; i >= 0; i--) {
            boolean bit = power.testBit(i);

            if (out != null) {
                if (bit) {
                    out.println("\nCurrent bit: 1");
                } else {
                    out.println("\nCurrent bit: 0");
                }
            }

            status = result.toString() + "^2 (mod " + modulo.toString() + ") = ";
            result = result.pow(2).mod(modulo);
            if (out != null) {
                out.println(status + result.toString());
            }

            if (bit) {
                status = result.toString() + " * " + number.toString() + " (mod " + modulo.toString() + ") = ";
                result = result.multiply(number).mod(modulo);
                if (out != null) {
                    out.println(status + result.toString());
                }
            }
        }

        if (out != null) {
            out.println("\nRESULT: " + result.toString());
        }

        return result;
    }
}
