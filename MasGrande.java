package Metodos;
import java.util.Scanner;
public class MasGrande {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero: ");
        int numero = sc.nextInt();
        System.out.println("Introduce otro numero: ");
        int numero2 = sc.nextInt();

        System.out.println("El numero mas grande es: " + valorMasGrande(numero, numero2));
    }
        public static int valorMasGrande (int num1, int num2){
            if(num1 > num2){
                return num1;
            }
            else {
                return num2;
        }
}
}