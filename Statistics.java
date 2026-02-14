import java.util.ArrayList;
import java.util.List;
public class Statistics {
    public static void main(String[] args) {
        List<String> numeros = new ArrayList<>();
        numeros.add("25");
        numeros.add("30");
        numeros.add("20");

        long cuantos = contarMultiplosDeTres(numeros);
        double media = calcularMedia(numeros);
        System.out.println("Hay " + cuantos + " números múltiplos de 3 y la media es " + media);
    }public static long contarMultiplosDeTres(List<String> numeros) {
        return numeros.stream()
                .mapToInt(Integer::parseInt)
                .filter(number -> number % 3 == 0)
                .count();
    }public static double calcularMedia(List<String> numeros) {
        return numeros.stream()
                .mapToInt(Integer::parseInt)
                .average()
                .getAsDouble();
    }
}