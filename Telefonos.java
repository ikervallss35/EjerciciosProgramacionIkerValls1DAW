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
        System.out.println("Introduce el nombre de un contacto: ");
        contacto = teclado.nextLine();
        System.out.println(contactos.getOrDefault(contacto, "El contacto no se encuentra"));
    }
}
/*public class Telefonos {
    public static void main(String[] args) {
        HashMap<String, String> agenda = telef();
        for (HashMap.Entry<String, String> entry : agenda.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }public static HashMap<String, String> telef(){
        HashMap<String, String> mapa = new HashMap<>();
        mapa.put("Pepe", "+34 956 87 56 12");
        mapa.put("Raul", "+34 956 78 56 12");
        return mapa;
    }
}*/