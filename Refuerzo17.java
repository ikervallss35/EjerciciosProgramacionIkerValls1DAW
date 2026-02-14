package Refuerzo;
import java.util.Scanner;
public class Refuerzo17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el primer número entero: ");
        int numero1 = sc.nextInt();
        System.out.print("Introduce el segundo número entero: ");
        int numero2 = sc.nextInt();

        if (numero1 == numero2) {
            System.out.println("Los dos números son iguales");
        } else if (numero1 > numero2) {
            System.out.println("El primer número es mayor");
        } else {
            System.out.println("El segundo número es mayor");
        }
    }
}