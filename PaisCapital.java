import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class PaisCapital {
    public static void main(String[] args) {
        Map<String, String> paises = new HashMap<>();
        Scanner teclado = new Scanner(System.in);
        String pais;
        paises.put("España", "Madrid");
        paises.put("Portugal", "Lisboa");
        paises.put("Francia", "París");
        paises.put("Alemania", "Berlín");
        System.out.println("Introduce el nombre de un país");
        pais = teclado.nextLine();
        System.out.println(paises.getOrDefault(pais, "El país no se encuentra"));
    }
}