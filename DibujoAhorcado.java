import java.util.ArrayList;
import java.util.List;
public class DibujoAhorcado {
    public static void main(String[] args) {
        int numFallos = 7;
        String palabraOculta = "jazz";
        String letrasPropuestas = "aeiiiiii";
        List<Character> jugadas = new ArrayList<>();
        int fallos = 0;
        for (int i = 0; i < letrasPropuestas.length(); i++) {
            char c = letrasPropuestas.charAt(i);
            if (!jugadas.contains(c)) {
                jugadas.add(c);
                if (!palabraOculta.contains("" + c)) {
                    fallos++;
                }
            }
        }System.out.println("Fallos acumulados: " + fallos);
        System.out.println(dibujarAhorcado(fallos));

        boolean haGanado = true;
        for (int i = 0; i < palabraOculta.length(); i++) {
            if (!jugadas.contains(palabraOculta.charAt(i))) {
                haGanado = false;
                break;
            }
        }if (haGanado) {
            System.out.println("¡Has ganado!");
        } else if (fallos > numFallos) {
            System.out.println("¡Has perdido! Has fallado más de " + numFallos + " veces.");
        } else {
            System.out.println("Todavía estás jugando, no has perdido ni has ganado.");
        }
    }public static String dibujarAhorcado(int fallos) {
        if (fallos < 0) fallos = 0;
        if (fallos > 7) fallos = 7;
        String dibujo = "  +---+\n  |   |\n";
        dibujo += (fallos >= 1) ? "  O   |\n" : "      |\n";
        if (fallos == 2) dibujo += "  |   |\n";
        else if (fallos == 3) dibujo += " /|   |\n";
        else if (fallos >= 4) dibujo += " /|\\  |\n";
        else dibujo += "      |\n";
        dibujo += (fallos >= 5) ? "  |   |\n" : "      |\n";
        if (fallos == 6) dibujo += " /    |\n";
        else if (fallos >= 7) dibujo += " / \\  |\n";
        else dibujo += "      |\n";
        dibujo += "      |\n=========\n";
        return dibujo;
    }
}