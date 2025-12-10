import  java.util.Scanner;
public class Ejemplo31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        System.out.println("Introduce un numero natural: ");
        numero = sc.nextInt();
        for (int i = 1; i <= numero; i++) {
            if(numero % i == 0){
                System.out.println(i);
            }
        }
    }
}
