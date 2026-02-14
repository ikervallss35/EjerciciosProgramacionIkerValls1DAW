package Refuerzo;
import java.util.Scanner;
public class Refuerzo11 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero;
        int numero2;
        System.out.print("Introduce un numero entero: ");
        numero = teclado.nextInt();
        System.out.print("Introduce otro numero entero: ");
        numero2 = teclado.nextInt();

        if ((numero % 2 == 0) && (numero2 % 2 == 0)) {
            System.out.println("Ambos son pares");
        }
    }
}