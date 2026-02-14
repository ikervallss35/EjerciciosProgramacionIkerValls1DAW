public class Alfabetica {
    public static void main(String[] args) {
        String cadena = "amor";
        if (esAlfabetica(cadena)) {
            System.out.println("La palabra " + cadena + " es una palabra alfabética");
        }else {
            System.out.println("La palabra " + cadena + " no es una palabra alfabética");
        }
    }public static boolean esAlfabetica(String cadena) {
        boolean esAlfabetica = false;
        for (int i = 0; i < cadena.length(); i++) {
            char actual = cadena.charAt(i);
            char siguiente = cadena.charAt(i + 1);
            if (actual > siguiente) {
                return false;
            }else{
                return true;
        }
        }return esAlfabetica;
    }
    }