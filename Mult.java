import java.util.Arrays;
import java.util.List;public class Mult {
    public static void main(String[] args) {
        String num = "3 6 8 4 20 7 14";
        System.out.println(multiplicadores(num));
    }public static String multiplicadores(String num) {
        List<String> lista = Arrays.asList(num.split(" "));
        List<Integer> listaNumeros = lista.stream().map(Integer::parseInt).toList();
        String mult= "";
        for (int i = 1; i < listaNumeros.size(); i++) {
            for (int j = 0; j < i; j++) {
                if (listaNumeros.get(i) % listaNumeros.get(j) == 0){
                    mult += listaNumeros.get(i) + " ";
                    break;
                }
            }
        }return mult;
    }
}