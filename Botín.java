import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Botín {
    public static void main(String[] args) {
       Map<Integer,ArrayList<Integer>> botin = repartirBotin(2, new ArrayList<>(List.of( 10, 20, 50, 200, 500)));
        System.out.println(botin);
    }public static Map<Integer,ArrayList<Integer>> repartirBotin(int cuantos, ArrayList<Integer> billetes){
        Map<Integer, ArrayList<Integer>> repartoPorPersona = new HashMap<>();
        int numeroBillete = 0;
        for (int billeteActual : billetes) {
            int persona = numeroBillete % cuantos;
            ArrayList<Integer> billetesDePersona = repartoPorPersona.get(persona);
            if (billetesDePersona == null) {
                billetesDePersona = new ArrayList<>();
            }
            billetesDePersona.add(billeteActual);
            repartoPorPersona.put(persona, billetesDePersona);
            numeroBillete++;
        }return repartoPorPersona;
    }
}