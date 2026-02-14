import java.util.Scanner;
public class Ejemplo5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter number 1: ");
        int numero1 = sc.nextInt();
        System.out.print("Enter number 2: ");
        int numero2 = sc.nextInt();

        int sum = numero1 + numero2;
        int sub = numero1 - numero2;
        int mult = numero1 * numero2;
        int div = numero1 / numero2;

        System.out.print("Sum:" + sum);
        System.out.print("Sub:" + sub);
        System.out.print("Mult:" + mult);
        System.out.print("Div:" + div);

    }
}