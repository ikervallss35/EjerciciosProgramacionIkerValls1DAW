import java.util.Scanner;
class Marco {
    public static void main(String[] args) {
        String[] cadenas = new String[5];
        int maximo = 0;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce 5 cadenas de texto:");

        // lee las 5 cadenas y determina la longitud máxima
        for (int i = 0; i < cadenas.length; i++) {
            cadenas[i] = teclado.nextLine();
            if (cadenas[i].length() > maximo) {
                maximo = cadenas[i].length();
            }
        }
        // imprime la fila superior de asteriscos del marco
        for (int i = 0; i < maximo + 4; i++) {
            System.out.print("*");
        }
        System.out.println();

        // imprime cada cadena dentro del marco
        for (int i = 0; i < cadenas.length; i++) {
            System.out.print("* " + cadenas[i]);
            // "* " -> asterisco y espacio **ANTES** de la cadena

            // añade espacios después de cada cadena para que todas tengan la misma longitud
            for (int j = 0; j < (maximo - cadenas[i].length()); j++) {
                System.out.print(" "); // rellena con espacios hasta el ancho máximo
            }
            System.out.println(" *");
            // " *" -> espacio final y asterisco **AL FINAL** de la línea
        }
        // imprime la fila inferior de asteriscos del marco
        for (int i = 0; i < maximo + 4; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
}