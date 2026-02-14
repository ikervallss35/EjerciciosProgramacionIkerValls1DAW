package Refuerzo;
import java.util.Scanner;
public class Refuerzo6 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero;
        int numero2;
        System.out.print("Introduce un numero entero: ");
        numero = teclado.nextInt();
        System.out.println("Introduce otro numero entero: ");
        numero2 = teclado.nextInt();

        if (numero2 != 0) {
            System.out.println(numero + "/" + numero2 + " = " + numero / numero2);
        }else {
                System.out.println("Error: No se puede dividir entre cero");
            }
        }
    }