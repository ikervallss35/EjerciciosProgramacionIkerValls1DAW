package Refuerzo;
import java.util.Scanner;
public class Refuerzo7 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero;
        System.out.print("Introduce un numero entero: ");
        numero = teclado.nextInt();

        if ((numero % 2 == 0) || (numero % 3 == 0)) {
            System.out.println(numero + " es multiplo de 2 o de 3");
        }
    }
}