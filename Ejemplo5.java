package Metodos;
import java.util.Scanner;
public class Ejemplo5 {
        public static void main(String[] args) {
            Scanner sc = new Scanner (System.in);
            System.out.print("Enter number 1: ");
            int numero1 = sc.nextInt();
            System.out.print("Enter number 2: ");
            int numero2 = sc.nextInt();

            System.out.print("Suma: " + suma(numero1, numero2));
            System.out.print("Resta: " + resta(numero1, numero2));
            System.out.print("Multiplicacion: " + multiplicacion(numero1, numero2));
            System.out.print("Division: " + division(numero1, numero2));
        }
        public static int suma(int a, int b) {
            return a + b;
    }
    public static int resta(int a, int b) {
        return a - b;
    }
    public static int multiplicacion(int a, int b) {
            return a * b;
    }
    public static int division(int a, int b) {
            return a / b;
    }
    }