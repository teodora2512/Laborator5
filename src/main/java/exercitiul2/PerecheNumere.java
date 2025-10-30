package exercitiul2;

/**
 * Clasa {@code PerecheNumere} modelează o pereche de numere întregi
 * și oferă metode pentru diverse calcule și verificări asupra lor.
 * <p>
 * Metode implementate:
 * <ul>
 *   <li>verificarea dacă numerele sunt consecutive în șirul Fibonacci</li>
 *   <li>calculul celui mai mic multiplu comun (CMMMC)</li>
 *   <li>verificarea dacă au suma cifrelor egală</li>
 *   <li>verificarea dacă au același număr de cifre pare</li>
 * </ul>
 * </p>
 */

public class PerecheNumere {
    private int a;
    private int b;

    public int getA() {

        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    /**
     * Constructor implicit (fără parametri).
     */
    public PerecheNumere() {
    }

    /**
     * Constructor cu parametri.
     *
     * @param a primul număr al perechii
     * @param b al doilea număr al perechii
     */
    public PerecheNumere(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public String toString() {
        return "PerecheNumere(" + "a=" + a + ", b=" + b + ")";
    }

    /**
     * Verifică dacă cele două numere sunt consecutive în șirul Fibonacci.
     *
     * @return {@code true} dacă numerele sunt consecutive Fibonacci, altfel {@code false}
     */
    public boolean suntConsecutiveFibonacci() {

        int x = Math.abs(a);
        int y = Math.abs(b);


        if (x == y) return false;


        int min = Math.min(x, y);
        int max = Math.max(x, y);


        int f1 = 0, f2 = 1;
        while (f2 <= max && f2 < 100_000_000) { // limită de siguranță
            if (f1 == min && f2 == max)
                return true;
            int next = f1 + f2;
            f1 = f2;
            f2 = next;
        }
        return false;
    }

    /**
     * Calculeaza cel mai mic multiplu comun
     *
     * @return valoarea CMMMDC
     */
    public int cmmmc() {
        return Math.abs(a * b) / cmmdc(a, b);
    }

    /**
     * Calculeaza cel mai mare divizor comun
     *
     * @param x
     * @param y
     * @return valoarea CMMDC
     */
    private int cmmdc(int x, int y) {
        while (x != y) {
            if (x > y)
                x = x - y;
            else
                y = y - x;
        }
        return Math.abs(x);
    }

    /**
     * Verifică dacă cele două numere au aceeași sumă a cifrelor.
     *
     * @return {@code true} daca suma cifrelor e egala, altfel{@code false}
     */
    public boolean auSumaCifEgala() {
        return sumaCifre(a) == sumaCifre(b);
    }

    private int sumaCifre(int n) {
        n = Math.abs(n);
        int s = 0;
        while (n > 0) {
            s += n % 10;
            n /= 10;
        }
        return s;
    }

    /**
     * Verifică dacă cele două numere au același număr de cifre pare.
     *
     * @return {@code true} dacă numărul de cifre pare este egal
     */
    public boolean auAcelasiNrCifrePare() {
        return nrCifrePare(a) == nrCifrePare(b);
    }

    private int nrCifrePare(int n) {
        n = Math.abs(n);
        int nr = 0;
        while (n > 0) {
            int c = n % 10;
            if (c % 2 == 0) nr++;
            n /= 10;
        }
        return nr;
    }
}
