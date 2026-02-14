package Refuerzo;
import java.util.Scanner;
public class Refuerzo18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        int n = sc.nextInt();

        if (n % 2 != 0) {
            n = n + 1;
        }
        System.out.println("Los 5 primeros números pares a partir de la entrada son:");
        for (int i = 0; i < 5; i++) {
            System.out.println(n + 2 * i);
        }
    }
}