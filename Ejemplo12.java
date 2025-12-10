import java.util.Scanner;
public class Ejemplo12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        int numero = sc.nextInt();
        System.out.print("Introduce otro número: ");
        int numero2 = sc.nextInt();

        if (numero > numero2){
            System.out.print(numero);
        }else{
            System.out.print(numero2);
        }
    }
}
