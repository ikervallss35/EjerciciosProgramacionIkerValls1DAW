import  java.util.Scanner;
public class Ejemplo27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        String cadena = "";
        System.out.println("Ingrese un numero: ");
        numero = sc.nextInt();
        for (int i = 1; i <= numero; i++) {
            cadena = cadena + i + " ";
            System.out.println(cadena);
        }
    }
}