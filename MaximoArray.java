import java.util.ArrayList;
import java.util.List;
public class MaximoArray {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>(List.of(9, 4, 5, 1, 10, 3));
        System.out.println(maximo(numeros));
    }public static int maximo(List<Integer> numeros){
        int maximo = Integer.MIN_VALUE;
        for(Integer numero : numeros){
            if(numero > maximo){
                maximo = numero;
            }
        }return maximo;
    }
}