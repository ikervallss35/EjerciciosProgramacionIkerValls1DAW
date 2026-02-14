import java.util.ArrayList;
import java.util.List;
public class SumaPositivosNegativos {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>(List.of(1, 2, -3, 4, 5));
        contarPositivosNegativos(numeros);
    }public static void contarPositivosNegativos(List<Integer> numeros) {
        long positivos = numeros.stream()
                .filter(n -> n >= 0)
                .count();

        long negativos = numeros.stream()
                .filter(n -> n < 0)
                .count();

        System.out.println("Positivos: " + positivos);
        System.out.println("Negativos: " + negativos);
    }
}