package Refuerzo;
import java.util.Scanner;
public class Refuerzo10 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero;
        System.out.print("Introduce un numero entero: ");
        numero = teclado.nextInt();

        if (!(numero % 2 == 0) && !(numero % 3 == 0)) {
            System.out.println(numero + " no es multiplo de 2 ni de 3");
        }
    }
}