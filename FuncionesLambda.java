import java.util.ArrayList;
import java.util.List;
public class FuncionesLambda {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9));
        long mayoresDeCinco = numeros.stream()
                .filter(numero -> mayorDeCinco(numero))
                .count();
        System.out.println("Mayores de cinco: " + mayoresDeCinco);
    }public static boolean mayorDeCinco(int numero) {
        return numero > 5;
    }
}