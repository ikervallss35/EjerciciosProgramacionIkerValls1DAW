import java.util.Scanner;
public class Ejemplo20 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        float precio;
        float descuento;
        System.out.println("Introduce el precio: ");
        precio = teclado.nextFloat();

        if (precio < 6) {
            System.out.println("EL precio es: " + precio);
        }else if (precio >=6 && precio <60) {
            descuento = 0.95f;
            System.out.println("El precio es: " + (precio*descuento));
        }else{
            descuento = 0.90f;
            System.out.println("El precio es: " + (precio*descuento));
        }
    }
}