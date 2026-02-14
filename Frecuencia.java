import java.util.HashMap;
import java.util.Map;
public class Frecuencia {
    public static void main(String[] args) {
        String palabras = "uno dos dos tres tres tres";
        Map<String, Integer> resultado = solucion(palabras);
        for (String palabra : resultado.keySet()) {
        System.out.println(palabra + " - " + resultado.get(palabra));
        }
    }public static Map<String, Integer> solucion(String palabras){
        Map<String, Integer> solucion = new HashMap<>();
        String[] palabrasArray = palabras.split(" ");
        for (int i = 0; i < palabrasArray.length; i++) {
            int contador = 0;
            for (int j = 0; j < palabrasArray.length; j++) {
                if (palabrasArray[i].contains(palabrasArray[j])) {
                    contador++;
                }
            }solucion.put(palabrasArray[i], contador);
        }return solucion;
    }
}