import java.util.Scanner;
public class Ejemplo10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        int numero = sc.nextInt();

        if (numero >= 0){
        System.out.print("Es positivo");
        }else{
            System.out.print("Es negativo");
        }
    }
}