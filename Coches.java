import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
public class Coches {
    public static void main(String[] args) {
        List<String> coches = new ArrayList<>();
        Scanner teclado = new Scanner(System.in);
        String coche;
        do {
            coche = teclado.nextLine();
            if (!coche.isEmpty()) {
                coches.add(coche);
            }
        }while (!coche.isEmpty());

        Collections.sort(coches);
        for(String c : coches){
            System.out.println(c);
        }
    }
}
/*public class Coches {
    public static void main(String[] args) {
        ArrayList<String> marcasCoches = vehiculos();
        marcasCoches.forEach(System.out::println);
    }public static ArrayList<String> vehiculos(){
        Scanner teclado = new Scanner(System.in);
        ArrayList<String> coches = new ArrayList<>();
        System.out.println("Introduce la marca de tu coche y espacio para finalizar: ");

        while(true){
            String coche = teclado.nextLine();
            if(coche.isEmpty()) break;
            coches.add(coche);
        }
        Collections.sort(coches);
        return coches;
    }
}*/