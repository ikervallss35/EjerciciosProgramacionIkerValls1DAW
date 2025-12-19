import java.util.HashMap;
import java.util.Map;
public class Morse {
    public static void main(String[] args) {
        String palabra = "Corazones";
        System.out.println(Morse(palabra));
    }public static boolean Morse(String palabra) {
        Map<Character, String> morse = new HashMap<>();
        morse.put('a', ".-");
        morse.put('b', "-...");
        morse.put('c', "-.-.");
        morse.put('d', "-..");
        morse.put('e', ".");
        morse.put('f', "..-.");
        morse.put('g', "--.");
        morse.put('h', "....");
        morse.put('i', "..");
        morse.put('j', ".---");
        morse.put('k', "-.-");
        morse.put('l', ".-..");
        morse.put('m', "--");
        morse.put('n', "-.");
        morse.put('o', "---");
        morse.put('p', ".--.");
        morse.put('q', "--.-");
        morse.put('r', ".-.");
        morse.put('s', "...");
        morse.put('t', "-");
        morse.put('u', "..-");
        morse.put('v', "...-");
        morse.put('w', ".--");
        morse.put('x', "-..-");
        morse.put('y', "-.--");
        morse.put('z', "--..");

        palabra = palabra.toLowerCase();
        String codigoLetra = morse.get(palabra.charAt(0));
        String generado = "";

        for (int i = 0; i < palabra.length(); i++) {
            char c = palabra.charAt(i);

            if (c == 'o') {
                generado += "-";
            } else if (c == 'a' || c == 'e' || c == 'i' || c == 'u') {
                generado += ".";
            }
        }return generado.equals(codigoLetra);
    }
}