import  java.util.Scanner;
public class Ejemplo28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        boolean esPrimo = true;
        System.out.println("Ingrese un numero: ");
        numero = sc.nextInt();

        if (numero == 0) {
            esPrimo = false;
        }
        else if(numero == 1){
            esPrimo = false;
        }
        else if (numero == 2){
            esPrimo = true;
        }

         for ( int i = 3; i < numero -1; i++) {
            esPrimo = false;
            break;
        }
        if (esPrimo) {
            System.out.println("Es Primo");
        }
        else {
            System.out.println("No Es Primo");
        }
    }
}