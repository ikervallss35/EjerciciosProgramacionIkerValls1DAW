import java.util.Scanner;
public class Ejemplo18v2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int hora;
        int minuto;
        int segundo;
        System.out.println("Introduce hora minutos y segundos: ");
        hora = teclado.nextInt();
        minuto = teclado.nextInt();
        segundo = teclado.nextInt();

        segundo = segundo +1;

        if (segundo == 60) {
            segundo=0;
            minuto++;
        }
        if (minuto == 60) {
            minuto = 0;
            hora++;
        }

        System.out.println(hora + ":" + minuto + ":" + segundo);
    }
    }