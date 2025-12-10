import  java.util.Scanner;
public class Ejemplo34 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int multiplicando;
        int multiplicador;
        int mult = 0;
        System.out.println("Introduce un numero: ");
        multiplicando = teclado.nextInt();
        System.out.println("Introduce otro numero: ");
        multiplicador = teclado.nextInt();

        for (int i = 1; i <= multiplicador; i++) {
        mult += multiplicando;
        }
        System.out.println(mult);
            }
        }