public class SMIL {
    public static void main(String[] args) {
        String cadena = "hola :) ;-) ;) :-)";
        System.out.println(ContarCaras(cadena));
    }public static String ContarCaras(String cadena) {
        String resultado = "";
        for (int i = 0; i < cadena.length() - 1; i++) {
            if (cadena.charAt(i) == ':' || cadena.charAt(i) == ';') {
                if (cadena.charAt(i + 1) == ')') {
                    resultado += i + " ";
                }
                else if (i + 2 < cadena.length() && cadena.charAt(i + 1) == '-' && cadena.charAt(i + 2) == ')') {
                    resultado += i + " ";
                }
            }
                }return resultado;
            }
        }