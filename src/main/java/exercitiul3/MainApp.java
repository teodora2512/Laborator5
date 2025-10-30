package exercitiul3;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.util.List;
import java.util.Scanner;

public class MainApp {
    static void main() {
        try {
            ObjectMapper mapper = new ObjectMapper();
            File file = new File("src/main/resources/mobilier.json");
            List<Mobilier> mobila = mapper.readValue(file, new TypeReference<List<Mobilier>>() {
            });

            System.out.println("Lista pieselor de mobilier:");
            for (Mobilier m : mobila) {
                System.out.println("\n" + m.getNume());
                for (Placa p : m.getPlaci()) {
                    System.out.println("   - " + p);
                }
            }
            Scanner scanner = new Scanner(System.in);
            System.out.println("Introdu numele piesei pt detalii");
            String cautat = scanner.nextLine();
            for (Mobilier m : mobila) {
                if (m.getNume().equalsIgnoreCase(cautat)) {
                    System.out.println("\nDetalii pt " + m.getNume() + ":");
                    for (Placa p : m.getPlaci())
                        System.out.println("   *" + p);

                    double coli = m.nrColiNecesare();
                    System.out.printf("\nNr estimativ coli PAL: %2f\n", coli);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
