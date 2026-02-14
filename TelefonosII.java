import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
public class TelefonosII {
    public static void main(String[] args) {
        HashMap<String, ArrayList<String>> agenda = new HashMap<>();
        ArrayList<String> telefonos = new ArrayList<>();
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el nombre de un contacto: ");
        String contacto = teclado.nextLine();
        telefonos.add("667761");
        telefonos.add("+0034 44001");
        agenda.put("Pepe", telefonos);
        telefonos = new ArrayList<>();
        telefonos.add("94884");
        telefonos.add("34535");
        agenda.put("Juan", telefonos);

        if (agenda.containsKey(contacto)) {
            System.out.println("Teléfonos de " + contacto + ": " + agenda.get(contacto));
        }else{
            System.out.println("El contacto no se encuentra");
        }
        }
    }
/*public class Telefonos2 {
    public static void main(String[] args) {
        HashMap<String, ArrayList<String>> agenda = telef();
        for (HashMap.Entry<String, ArrayList<String>> entry : agenda.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }public static HashMap<String, ArrayList<String>> telef(){
        HashMap<String, ArrayList<String>> mapa = new HashMap<>();
        ArrayList<String> lista = new ArrayList<>();
        lista.add("+34 956 87 56 10");
        lista.add("+34 956 87 56 11");
        mapa.put("Pepe", lista);

        lista = new ArrayList<>();
        lista.add("+34 956 87 56 12");
        lista.add("+34 956 87 56 13");
        mapa.put("Manolo", lista);
        return mapa;
    }
}*/