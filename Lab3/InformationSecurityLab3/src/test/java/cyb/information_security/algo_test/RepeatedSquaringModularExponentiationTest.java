package cyb.information_security.algo_test;

import cyb.information_security.algo.RepeatedSquaringModularExponentiation;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigInteger;

public class RepeatedSquaringModularExponentiationTest {

    @Test
    public void testLeftToRight() {
        BigInteger number = BigInteger.valueOf(7);
        BigInteger power = BigInteger.valueOf(560);
        BigInteger modulo = BigInteger.valueOf(561);

        // 7 ^ 560 (mod 561) = 1
        Assertions.assertEquals(RepeatedSquaringModularExponentiation
                .powLeftToRight(number, power, modulo, null), BigInteger.ONE);
    }

    @Test
    public void testRightToLeft() {
        BigInteger number = BigInteger.valueOf(7);
        BigInteger power = BigInteger.valueOf(560);
        BigInteger modulo = BigInteger.valueOf(561);

        // 7 ^ 560 (mod 561) = 1
        Assertions.assertEquals(RepeatedSquaringModularExponentiation
                .powRightToLeft(number, power, modulo, null), BigInteger.ONE);
    }
}
