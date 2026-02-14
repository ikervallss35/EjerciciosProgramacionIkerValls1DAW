import java.io.*;
import java.util.*;
public class CountCountries {
    public static void main(String[] args) throws IOException {
        HashMap<String,Integer> mapa = countContries();
        for(HashMap.Entry<String,Integer> e:mapa.entrySet()){
            System.out.println(e.getKey() + " - " + e.getValue());
        }
    }public static HashMap<String,Integer> countContries() throws IOException {
        HashMap<String,Integer> mapa = new HashMap<>();
        BufferedReader reader = new BufferedReader(new FileReader("src/main/resources/Colfuturo-Seleccionados.csv"));
        String linea;
        reader.readLine();
        while ((linea = reader.readLine()) != null) {
            String[] columnas = linea.split(",");
            mapa.put(columnas[6], mapa.getOrDefault(columnas[6], 0) + 1);
        }return mapa;
    }
}