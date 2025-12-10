import java.util.Scanner;
public class Ejemplo18 {
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    int hora;
    int minuto;
    int segundo;
    System.out.println("Introduce la hora: ");
    hora = teclado.nextInt();
    System.out.println("Introduce los minutos: ");
    minuto = teclado.nextInt();
    System.out.println("Introduce los segundos: ");
    segundo = teclado.nextInt();
    System.out.println(hora + ":" + minuto + ":" + segundo);

    if(hora <= 23 && minuto <= 59 && segundo < 59){
        System.out.println("El próximo segundo serán las: " + hora + ":" + minuto + ":" + (segundo+1));
    }else if (hora <= 23 && minuto < 59 && segundo == 59) {
        System.out.println("El próximo segundo serán las: " + hora + ":" + (minuto+1) + ":" + 0);
    }else if (hora < 23 && minuto == 59 && segundo == 59) {
        System.out.println("El próximo segundo serán las: " + (hora+1) + ":" + 0 + ":" + 0);
    }else if (hora == 23 && minuto == 59 && segundo == 59){
        System.out.println("El próximo segundo serán las: " + 0 + ":" + 0 + ":" + 0);
    }else {
        System.out.println("Hora incorrecta");
    }
    }
    }