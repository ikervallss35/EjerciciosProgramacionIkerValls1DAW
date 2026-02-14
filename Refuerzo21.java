package Refuerzo;
import java.util.Scanner;
public class Refuerzo21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float papel = 0.00001f;
        System.out.print("Introduce la altura del edificio (medida en metros): ");
        double edificio = sc.nextDouble();
        int dobleces = 0;

        do {
            papel = papel * 2;
            dobleces++;
        }while (edificio > papel);
        System.out.println(dobleces);
    }
}