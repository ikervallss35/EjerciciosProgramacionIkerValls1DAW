import java.io.*;
import java.util.*;
public class CountCountries {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("src/main/resources/Colfuturo-Seleccionados.csv"));
        String paises;
        String linea;
        int contador;
        Map<String,Integer> mapa = new HashMap();
        while ((linea = reader.readLine()) != null) {
            paises = linea.split(",")[6];
            contador = mapa.getOrDefault(paises,0);
            mapa.put(paises, contador + 1);
        }System.out.println(mapa.get("España"));
    }
}