import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
public class Analfabetos {
    static class Pais implements Comparable<Pais> {
        String nombre;
        int analfabetos;

        public Pais(String nombre, int analfabetos) {
            this.nombre = nombre;
            this.analfabetos = analfabetos;
        }@Override
        public String toString() {
            return nombre + " - " + analfabetos;
        }@Override
        public int compareTo(Pais other) {
            return this.analfabetos - other.analfabetos;
        }
    }public static void main(String[] args)  throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("src/illiterate.csv"));
        List<Pais> paises = new ArrayList<>();
        String linea = "";
        String [] datos;
        Pais pais;
        reader.readLine();
        String nombre;
        int analfabetos;

        while ((linea = reader.readLine()) != null) {
            datos = linea.split(",");
            analfabetos = Integer.parseInt(datos[8]);
            nombre = datos[5];
            pais = new Pais(nombre, analfabetos);
            paises.add(pais);
        }paises.stream().sorted().forEach(System.out::println);
    }
}