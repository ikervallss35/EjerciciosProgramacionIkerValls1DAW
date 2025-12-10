import java.util.ArrayList;
import java.util.List;
public class SumaPositivosNegativos {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>(List.of(1, 2, -3, 4, 5));
        long positivos = numeros.stream()
                .filter(number -> number >=0)
                .count();

        long negativos = numeros.stream()
                .filter(number -> number <0)
                .count();

        System.out.println("Positivos: " + positivos);
        System.out.println("Negaitvos: " + negativos);
    }
}