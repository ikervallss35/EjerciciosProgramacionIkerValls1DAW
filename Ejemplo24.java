import java.util.Scanner;
public class Ejemplo24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double suma = 0;
        int contador = 0;
        boolean diez = false;
        double nota;
        System.out.print("Introduce varias notas, pon -1 para terminar ");
        do {
            nota = sc.nextInt();
            if (nota != -1) {
                suma += nota;
                contador++;

                if (nota == 10) {
                    diez = true;
                }
            }

        } while (nota != -1);

        System.out.println("La nota media es : " + suma / contador);
        if (diez) {
            System.out.println("Había un diez en las notas");
        }
    }
}