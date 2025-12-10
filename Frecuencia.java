import java.util.HashMap;
import java.util.Map;
public class Frecuencia {
    public static void main(String[] args) {
        String numeros = "uno dos dos tres tres tres";
        Map<String, Integer> resultado = solucion(numeros);
        for (String palabra : resultado.keySet()) {
        System.out.println(palabra + " - " + resultado.get(palabra));
        }
    }public static Map<String, Integer> solucion(String numeros){
        Map<String, Integer> solucion = new HashMap<>();
        String[] nums = numeros.split(" ");
        for (int i = 0; i < nums.length; i++) {
            int contador = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[i].contains(nums[j])) {
                    contador++;
                }
            }solucion.put(nums[i], contador);
        }return solucion;
    }
}