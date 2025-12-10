package Metodos;
import java.util.Scanner;
public class ValorNota {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce la nota: ");
        int nota = sc.nextInt();

        System.out.println("Valor en texto: " + convertirEnLetra(nota));
    }
    public static String convertirEnLetra(int nota) {
        if (nota < 0 || nota > 10) {
            return "Nota inválida";
        } else if (nota < 3) {
            return "Muy deficiente";
        } else if (nota < 5) {
            return "Insuficiente";
        } else if (nota < 6) {
            return "Suficiente";
        } else if (nota < 7) {
            return "Bien";
        } else if (nota < 9) {
            return "Notable";
        } else {
            return "Sobresaliente";
        }
    }
}