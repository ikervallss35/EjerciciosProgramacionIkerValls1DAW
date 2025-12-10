import java.util.Scanner;
public class Ejemplo22 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int positivos = 0;
        int numero;
        System.out.println("Introduce 10 números: ");

        for (int i = 1; i <= 10; i++) {
            numero = teclado.nextInt();
            if (numero >= 0) {
            positivos++;
            }
        }
        System.out.println("Hay " + positivos + " positivos");
    }
}