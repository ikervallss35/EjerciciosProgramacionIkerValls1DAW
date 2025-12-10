package Refuerzo;
import java.util.Scanner;
public class Refuerzo3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero;
        int numero2;
        System.out.println("Introduce un numero entero mayor a 0: ");
        numero = teclado.nextInt();
        System.out.println("Introduce otro numero entero mayor a 0: ");
        numero2 = teclado.nextInt();

        if (numero % numero2 == 0) {
            System.out.println("El " + numero + " es multiplo del " + numero2);
        } else {
            System.out.println("El " + numero + " no es multiplo del " + numero2);
        }
    }
}