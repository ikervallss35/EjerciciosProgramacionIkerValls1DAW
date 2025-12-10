import java.util.Scanner;
public class Ejemplo16 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n;
        int m;
        String operacion;
        System.out.println("Introduce un numero: ");
        n = teclado.nextInt();
        System.out.println("Introduce otro numero: ");
        m = teclado.nextInt();
        System.out.println("Introduce la operacion a realizar (+, -, *, /): ");
        operacion = teclado.next();
        switch (operacion) {
            case "+":
                System.out.println( n + m);
                break;
            case "-":
                System.out.println( n - m);
                break;
            case "*":
                System.out.println(n * m);
                break;
            case  "/":
                System.out.println(n / m);
                break;
        }
    }
}
