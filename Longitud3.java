public class Longitud3 {
    public static void main(String[] args) {
        String cadena = "una cadena de texto";
        int k = 6;
        boolean hayLarga = hayPalabraLarga(cadena, k);

        if (hayLarga) {
            System.out.println("Hay alguna palabra larga");
        } else {
            System.out.println("Todas las cadenas son cortas");
        }
    }public static boolean hayPalabraLarga(String cadena, int k) {
        String[] palabras = cadena.split(" ");
        for (int i = 0; i < palabras.length; i++) {
            if (palabras[i].length() >= k) {
                return true;
            }
        }return false;
    }
}