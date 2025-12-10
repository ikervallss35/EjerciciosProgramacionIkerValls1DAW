import  java.util.Scanner;
public class Ejemplo25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        int factorial = 1;
        System.out.println("Ingrese un numero: ");
        numero = sc.nextInt();
        for (int i = 1; i <= numero; i++) {
            factorial = factorial * i;
        }
        System.out.println("El resultado es: " + factorial);
    }
}
// 25 no va