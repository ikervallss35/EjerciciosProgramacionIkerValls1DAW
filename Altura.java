import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
public class Altura {
    static List<Double> alturas = new ArrayList<>();
    public static void main(String[] args) {
        int numAlumnos = numeroAlumnos();
        leerAlturas(numAlumnos);
        double media = calcularMedia();
        mostrarResultados(alturas, media);
    }public static int numeroAlumnos() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el numero de alumnos: ");
        return teclado.nextInt();
    }public static void leerAlturas(int cuantas) {
        Scanner teclado = new Scanner(System.in);
        System.out.printf("Introduce %d alturas:%n", cuantas);
        for (int i = 0; i < cuantas; i++) {
            alturas.add(teclado.nextDouble());
        }
    }public static double calcularMedia() {
        double total = 0;
        for (Double altura : alturas) {
            total += altura;
        }return total / alturas.size();
    }public static int calcularAlumnosAlturaSuperior(double media) {
        int cuantos = 0;
        for (Double altura : alturas) {
            if (altura > media) {
                cuantos++;
            }
        }return cuantos;
    }public static int calcularAlumnosAlturaInferior(double media) {
        int cuantos = 0;
        for (Double altura : alturas) {
            if (altura < media) {
                cuantos++;
            }
        }return cuantos;
    }public static void mostrarResultados(List<Double> alturas, double media) {
        System.out.println("Alturas: " + alturas);
        System.out.println("Media: " + media);
        System.out.println("Alumnos más altos que la media: " + calcularAlumnosAlturaSuperior(media));
        System.out.println("Alumnos más bajos que la media: " + calcularAlumnosAlturaInferior(media));
    }
}