package Refuerzo;
import java.util.Scanner;
public class Refuerzo4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero;
        System.out.print("Introduce un numero entero: ");
        numero = teclado.nextInt();

        if (numero % 10 == 0) {
            System.out.println("El numero " + numero + " es multiplo de 10");

            int numero2;
            System.out.print("Introduce otro numero entero: ");
            numero2 = teclado.nextInt();

            if (numero2 % 10 == 0) {
                System.out.println("El numero " + numero2 + " es multiplo de 10");
            } else {
                System.out.println("El numero " + numero2 + " no es multiplo de 10");
            }
        }
    }
}