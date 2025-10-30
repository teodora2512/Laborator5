package exercitiul2;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import exemplul1.Persoana;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MainApp {
    public static void scriere(List<PerecheNumere> lista) {
        try {
            ObjectMapper mapper = new ObjectMapper();
            File file = new File("src/main/resources/persoane.json");
            mapper.writeValue(file, lista);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<PerecheNumere> citire() {
        try {
            File file = new File("src/main/resources/perechi.json");
            ObjectMapper mapper = new ObjectMapper();
            return mapper.readValue(file, new TypeReference<List<PerecheNumere>>() {
            });
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    static void main() {
        List<PerecheNumere> lista = new ArrayList<>();

        lista.add(new PerecheNumere());
        lista.add(new PerecheNumere(12, 21));
        lista.add(new PerecheNumere(11, 10));
        lista.add(new PerecheNumere(3, 5));
        scriere(lista);
        System.out.println("Fisier scris cu succes");

        List<PerecheNumere> listaCitita=citire();
        System.out.println("Perechi citire din fisier! ");
        for (PerecheNumere p:listaCitita)
            System.out.println(p);



    }
}
