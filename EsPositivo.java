package Metodos;
import java.util.Scanner;
public class EsPositivo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        int numero = sc.nextInt();

        if (esPositivo(numero)) {
            System.out.println("El número es positivo");
        } else {
            System.out.println("El número es negativo");
        }
    }
    public static boolean esPositivo(int num) {
        if (num >= 0){
            return true;
        }else{
            return false;
        }
    }
}