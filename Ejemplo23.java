import java.util.Scanner;
    public class Ejemplo23 {
        public static void main(String[] args) {
            Scanner teclado = new Scanner(System.in);
            int positivos = 0;
            int numero;
            System.out.println("Introduce los números que quieras, para acabar introduce el 0 ");


            do {
                numero = teclado.nextInt();
                if (numero > 0) {
                    positivos++;
                }
            }
            while (numero != 0);

            System.out.println("Hay " + positivos + " positivos");

        }
    }
