package exercitiul3;

import java.util.Arrays;

/**
 * Clasa {@code Placa} reprezintă o placă de PAL dreptunghiulară,
 * caracterizată prin dimensiuni, orientare, muchii cantuite și numărul de bucăți.
 */
public class Placa {
    private String descriere;
    private int lungime;
    private int latime;
    private Orientare orientare;
    private boolean[] canturi;
    private int nr_bucati;

    public Placa() {
    }

    /**
     * Constructor complet.
     *
     * @param descriere descrierea plăcii (ex: „blat”, „laterală”)
     * @param lungime   lungimea în milimetri
     * @param latime    lățimea în milimetri
     * @param orientare orientarea fibrei
     * @param canturi   vector boolean de 4 elemente (pentru muchii)
     * @param nr_bucati numărul de bucăți identice
     */

    public Placa(String descriere, int lungime, int latime, Orientare orientare, boolean[] canturi, int nr_bucati) {
        this.descriere = descriere;
        this.lungime = lungime;
        this.latime = latime;
        this.orientare = orientare;
        this.canturi = canturi;
        this.nr_bucati = nr_bucati;
    }

    public String getDescriere() {
        return descriere;
    }

    public void setDescriere(String descriere) {
        this.descriere = descriere;
    }

    public int getLungime() {
        return lungime;
    }

    public void setLungime(int lungime) {
        this.lungime = lungime;
    }

    public int getLatime() {
        return latime;
    }

    public void setLatime(int latime) {
        this.latime = latime;
    }

    public Orientare getOrientare() {
        return orientare;
    }

    public void setOrientare(Orientare orientare) {
        this.orientare = orientare;
    }

    public boolean[] getCanturi() {
        return canturi;
    }

    public void setCanturi(boolean[] canturi) {
        this.canturi = canturi;
    }

    public int getNr_bucati() {
        return nr_bucati;
    }

    public void setNr_bucati(int nr_bucati) {
        this.nr_bucati = nr_bucati;
    }

    /**
     * Calculează aria totală (mm²) pentru toate bucățile acestei plăci.
     *
     * @return aria totală
     */

    public int ariaTotala() {
        return lungime * latime * nr_bucati;
    }

    @Override
    public String toString() {
        return descriere + " (" + lungime + "x" + latime + "mm" + orientare + ",canturi=" + Arrays.toString(canturi) + ", bucati=" + nr_bucati + ")";
    }
}
