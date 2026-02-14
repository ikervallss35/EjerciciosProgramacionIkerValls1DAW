package Refuerzo;
import java.util.Scanner;
public class Refuerzo19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Distancia en metros: ");
        double distancia = sc.nextDouble();
        System.out.print("Velocidad máxima (km/h): ");
        double velocidadMax = sc.nextDouble();
        System.out.print("Tiempo en segundos: ");
        double tiempo = sc.nextDouble();

        if (distancia <= 0 || tiempo <= 0 || velocidadMax <= 0) {
            System.out.println("ERROR");
        } else {
            double distanciaKm = distancia / 1000.0;
            double tiempoHoras = tiempo / 3600.0;
            double velocidadMedia = distanciaKm / tiempoHoras;

            if (velocidadMedia <= velocidadMax) {
                System.out.println("OK");
            } else if (velocidadMedia <= velocidadMax * 1.2) {
                System.out.println("MULTA");
            } else {
                System.out.println("PUNTOS");
            }
        }
    }
}