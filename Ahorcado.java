import java.util.ArrayList;
import java.util.List;
public class Ahorcado {
    public static void main(String[] args) {
        int numFallos = 7;
        String palabraOculta = "jazz";
        String letrasPropuestas = "aeiiiiii";
        int resultado = ahorcado(numFallos, palabraOculta, letrasPropuestas);
            if (resultado == 1){
                System.out.println("Has ganado");
            }else if (resultado == 2){
                System.out.println("Has fallado mas de " + numFallos + " veces");
            }else {
                System.out.println("Todavía estás jugando, no has perdido ni has ganado");
            }
        }public static int ahorcado (int numFallos, String palabraOculta, String letrasPropuestas) {
        List<Character> jugadas = new ArrayList<>();
        List<Character> letrasJugadas = new ArrayList<>();
        int fallos = 0;
        for (int i = 0; i < letrasPropuestas.length(); i++) {
            char c = letrasPropuestas.charAt(i);
            if (!jugadas.contains(c)) {
                jugadas.add(c);
                boolean estaEnPalabra = false;
                for (int j = 0; j < palabraOculta.length(); j++) {
                    if (palabraOculta.charAt(j) == c) {
                        estaEnPalabra = true;
                        break;
                    }
                }if (!estaEnPalabra) {
                    fallos++;
                }
            }
            if(!letrasJugadas.contains(c)){
                letrasJugadas.add(c);
            }
        }if (fallos > numFallos) {
            return 2;
        }boolean haDescubiertoTodo = true;
        for (int i = 0; i < palabraOculta.length(); i++) {
            char c = palabraOculta.charAt(i);
            if (!jugadas.contains(c)) {
                haDescubiertoTodo = false;
                break;
            }
        }if (haDescubiertoTodo) {
            return 1;
        }return 3;
    }
}