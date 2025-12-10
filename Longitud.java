import java.util.Scanner;
public class Longitud {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce una cadena de texto: ");
        String cadena = teclado.nextLine();
        System.out.print("Introduce la longitud k: ");
        int k = teclado.nextInt();
        int resultado = comprueba(cadena, k);
        System.out.println("Número de palabras de longitud " + k + ": " + resultado);
    }public static int comprueba(String cadena, int k){
        String[] palabras = cadena.split(" ");
        int contador = 0;

        for (int i = 0; i < palabras.length; i++) {
            if (palabras[i].length() == k) contador++;
        }return contador;
    }
}