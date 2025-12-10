import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Telefonos {
    public static void main(String[] args) {
        Map<String, String> contactos = new HashMap<>();
        Scanner teclado = new Scanner(System.in);
        String contacto;
        contactos.put("Diego", "687654832");
        contactos.put("Fernando", "664654876");
        contactos.put("María", "698632114");
        contactos.put("Clara", "645634097");
        System.out.println("Introduce el nombre de un contacto: ");
        contacto = teclado.nextLine();
        System.out.println(contactos.getOrDefault(contacto, "El contacto no se encuentra"));
    }
}