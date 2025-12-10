import java.util.ArrayList;
import java.util.List;
public class MediaArray {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>(List.of(5, 8, 2, 7, 10, 3, 9, 6, 4, 1));
        System.out.println("La media es: " + media(numeros));
    }public static double media(List<Integer> numeros) {
        int suma = 0;
        for (int numero : numeros) {
            suma = suma + numero;
        }return (double) suma / numeros.size();
    }
}