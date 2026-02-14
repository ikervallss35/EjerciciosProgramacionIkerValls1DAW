public class Alfabetica {
    public static void main(String[] args) {
        String palabra = "amor";
        if (esAlfabetica(palabra)) {
            System.out.println("La palabra " + palabra + " es alfabética");
        } else {
            System.out.println("La palabra " + palabra + " no es alfabética");
        }
    }public static boolean esAlfabetica(String palabra) {
        for (int i = 0; i < palabra.length() - 1; i++) {
            char actual = palabra.charAt(i);
            char siguiente = palabra.charAt(i + 1);
            if (actual > siguiente) {
                return false;
            }
        }return true;
    }
}