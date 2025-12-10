import java.util.HashMap;
import java.util.Map;
public class Pendientes {
    public static void main(String[] args) {
        int[] pendientesCaso1 = {10, 3, 10, 4, 10};
        System.out.println(cuantosPendientes(pendientesCaso1));
    }public static int cuantosPendientes(int[] pendientes) {
        Map<Integer, Integer> mapa = new HashMap<>();
        for (int pendiente : pendientes) {
            mapa.put(pendiente, mapa.getOrDefault(pendiente, 0) + 1);
        }int contador = 0;
        for (int valor : mapa.values()) {
            contador += valor / 2;
        }return contador;
    }
}