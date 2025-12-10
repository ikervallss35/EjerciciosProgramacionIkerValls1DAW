public class Longitud2 {
    public static void main(String[] args) {
        String cadena = "una cadena de texto";
        int k = 2;
        boolean existe = existePalabraDeLongitud(cadena, k);
        if (existe) {
            System.out.println("Alguna palabra tiene una longitud de " + k + " caracteres.");
        }
    }public static boolean existePalabraDeLongitud(String cadena, int k) {
        String[] palabras = cadena.split(" ");
        for (int i = 0; i < palabras.length; i++) {
            if (palabras[i].length() == k) {
                return true;
            }
        }return false;
    }
}