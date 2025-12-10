package Refuerzo;
import java.util.Scanner;
public class Refuerzo1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero;
        System.out.println("Introduce un numero entero: ");
        numero = teclado.nextInt();

        System.out.println("Doble del numero: " + numero * 2);
        System.out.println("Triple del numero: " + numero * 3);

    }
}