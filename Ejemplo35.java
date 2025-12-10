import  java.util.Scanner;
public class Ejemplo35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dividendo;
        int divisor;
        System.out.println("Introduce un numero: ");
        dividendo = sc.nextInt();
        System.out.println("Introduce otro numero: ");
        divisor = sc.nextInt();

        do {
        dividendo -= divisor;
        }while (dividendo >= divisor);
        System.out.println("El resto es " + dividendo);
    }
}