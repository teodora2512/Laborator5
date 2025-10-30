import exercitiul2.PerecheNumere;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestePerechi {
    @Test
    void testFibonacciConsecutiv() {
        PerecheNumere p = new PerecheNumere(5, 8);
        assertTrue(p.suntConsecutiveFibonacci());
    }

    @Test
    void testCmmmc() {
        PerecheNumere p = new PerecheNumere(6, 8);
        assertEquals(24, p.cmmmc());
    }

    @Test
    void testSumaCifrelorEgala() {
        PerecheNumere p = new PerecheNumere(123, 312);
        assertTrue(p.auSumaCifEgala());
    }

    @Test
    void testNrCifrePare() {
        PerecheNumere p = new PerecheNumere(24, 82);
        assertTrue(p.auAcelasiNrCifrePare());
    }

    @Test
    void testFibonacciNegativ() {
        PerecheNumere p = new PerecheNumere(4, 7);
        assertFalse(p.suntConsecutiveFibonacci());
    }
}