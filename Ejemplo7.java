import java.util.Scanner;
public class Ejemplo7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Introduce el precio real: ");
        double precio = sc.nextInt();
        System.out.print("Introduce el precio rebajado: ");
        double precioRebajado = sc.nextInt();

        double descuento = (precio - precioRebajado)/precio * 100;

        System.out.print(descuento);
    }
}
