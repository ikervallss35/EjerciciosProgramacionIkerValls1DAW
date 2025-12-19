import java.util.ArrayList;
import java.util.List;
public class Mult {
    public static void main(String[] args) {
        System.out.println(mult("3 6 8 4 20 7 14"));
    }public static String mult(String numeros) {
        String[] partes = numeros.split(" ");
        List<Integer> listaNumeros = new ArrayList<>();
        for (String s : partes) {
            listaNumeros.add(Integer.parseInt(s));
        }
        List<Integer> resultado = new ArrayList<>();
        int i = 0;

        while (i < listaNumeros.size()) {
            int base = listaNumeros.get(i);
            boolean encontrado = false;

            for (int j = i + 1; j < listaNumeros.size(); j++) {
                int num = listaNumeros.get(j);
                if (num % base == 0) {
                    resultado.add(num);
                    encontrado = true;
                    break;
                }
            }i++;
        }String salida = "";
        for (int j = 0; j < resultado.size(); j++) {
            if (j > 0) salida += " ";
            salida += resultado.get(j);
        }return salida;
    }
}