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
        System.out.println("Introduce el nombre de un país");
        pais = teclado.nextLine();
        System.out.println(paises.getOrDefault(pais, "El país no se encuentra"));
    }
}
/*public class PaisCapital {
    public static void main(String[] args) {
        HashMap<String, String> mapa = capitalList();
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese el país para saber su capital: ");
        String pais = sc.nextLine();
        System.out.println(mapa.getOrDefault(pais, "No esta registrado ese pais"));
    }public static HashMap<String, String> capitalList() {
        HashMap<String, String> capitales = new HashMap<>();
        capitales.put("España", "Madrid");
        capitales.put("Portugal", "Lisboa");
        return capitales;
    }
}*/