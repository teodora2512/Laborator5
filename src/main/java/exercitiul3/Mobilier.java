package exercitiul3;

import java.util.ArrayList;
import java.util.List;

/**
 * Clasa {@code Mobilier} modelează o piesă de mobilier compusă din mai multe plăci de PAL.
 */
public class Mobilier {
    private String nume;
    private List<Placa> placi;

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public List<Placa> getPlaci() {
        return placi;
    }

    public void setPlaci(List<Placa> placi) {
        this.placi = placi;
    }

    /**
     * Constructor complet.
     *
     * @param nume  numele piesei de mobilier (ex: „Birou”)
     * @param placi lista plăcilor care o compun
     */

    public Mobilier(String nume, List<Placa> placi) {
        this.nume = nume;
        this.placi = placi;
    }

    public Mobilier() {
    }

    /**
     * Calculează numărul estimativ de coli de PAL necesare
     * (dimensiune coală: 2800 x 2070 mm).
     *
     * @return numărul de coli necesare (valoare reală)
     */

    public int ariaTotalaMobilier() {
        int total = 0;
        for (Placa p : placi) {
            total += p.ariaTotala();
        }
        return total;
    }

    public double nrColiNecesare() {
        double ariaCoala = 2800 * 2070;
        return ariaTotalaMobilier() / ariaCoala;
    }

    @Override
    public String toString() {
        return "Mobilier: " + " (" + placi.size() + " placi)";
    }
}
