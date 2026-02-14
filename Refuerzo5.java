package Refuerzo;
import java.util.Scanner;
public class Refuerzo5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el primer número entero: ");
        int numero1 = sc.nextInt();

        if (numero1 == 0) {
            System.out.println("El producto de 0 por cualquier número es 0");
        }else{
            System.out.print("Introduce el segundo número entero: ");
            int numero2 = sc.nextInt();
            int producto = numero1 * numero2;
            System.out.println("El producto de " + numero1 + " por " + numero2 + " es " + producto);
        }
    }
}