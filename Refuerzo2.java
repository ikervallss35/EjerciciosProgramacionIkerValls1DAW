package Refuerzo;
import java.util.Scanner;
public class Refuerzo2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero;
        System.out.println("Introduce un numero entero: ");
        numero = teclado.nextInt();

        if (numero % 2 == 0) {
            System.out.println("El numero es par");
        }
    }
}