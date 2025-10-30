package exemplul1;

import java.io.File;
import java.io.IOException;
import java.util.List;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class MainApp {
    public static void scriere(List<Persoana> lista) {
        try {
            ObjectMapper mapper = new ObjectMapper();
            File file = new File("src/main/resources/persoane.json");
            mapper.writeValue(file, lista);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Persoana> citire() {
        try {
            File file = new File("src/main/resources/persoane.json");
            ObjectMapper mapper = new ObjectMapper();
            return mapper.readValue(file, new TypeReference<List<Persoana>>() {
            });
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    static void main() {
        List<Persoana> persoane = citire();
        System.out.println("Persoane citite din JSON:");
        for (Persoana p : persoane) {
            System.out.println(p);
        }

        persoane.add(new Persoana("Maria", 33));
        scriere(persoane);
        System.out.println(" Persoanele au fost salvate înapoi în fișierul JSON.");


    }
}
