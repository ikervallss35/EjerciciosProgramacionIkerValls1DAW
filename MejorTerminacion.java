import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class MejorTerminacion {
    public static void main(String[] args) {
        ArrayList<String> boletos = new ArrayList<>(List.of("00004", "03847", "39804"));
        Map<Integer, Integer> resultado = sorteo(boletos);
        System.out.println(resultado);
    }public static Map<Integer, Integer> sorteo(ArrayList<String> boletos) {
        int ultimoDigito;
        Integer cuantos;
        Map<Integer, Integer> terminaciones = new HashMap<>();
        for (String boleto : boletos) {
            ultimoDigito = Integer.parseInt("" + boleto.charAt(boleto.length() - 1));
            cuantos = terminaciones.get(ultimoDigito);

            if (cuantos == null) {
                terminaciones.put(ultimoDigito, 1);
            } else {
                terminaciones.put(ultimoDigito, cuantos + 1);
            }
        }return terminaciones;
    }
}