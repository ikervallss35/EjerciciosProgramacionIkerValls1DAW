import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
public class Anagramas {
    public static void main(String[] args) throws IOException {
        HashMap<String, ArrayList<String>> listaAnagramas = anagramas();
        for (HashMap.Entry<String, ArrayList<String>> entry : listaAnagramas.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }public static HashMap<String, ArrayList<String>> anagramas() throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("src/main/resources/spanish-dict.txt"));
        String linea;
        HashMap<String, ArrayList<String>> mapa = new HashMap<>();
        ArrayList<String> lista = new ArrayList<>();
        while ((linea = reader.readLine())!=null) {
            String palabras = alphabetize(linea);
            lista = mapa.getOrDefault(palabras, new ArrayList<>());
            lista.add(linea);
            mapa.put(palabras, lista);
        }
        reader.close();
        return mapa;
    }private static String alphabetize(String s) {
        char[] a = s.toCharArray();
        Arrays.sort(a);
        return new String(a);
    }
}