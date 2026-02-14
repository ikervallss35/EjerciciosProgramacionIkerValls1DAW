package Refuerzo;
import java.util.Scanner;
public class Refuerzo15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t;
        System.out.println("Introduce los segundos: ");
        t = sc.nextInt();

        int minutos;
        int horas;
        int segundos;

        //Aqui saco las horas h=s/3600
        horas=t / 3600;
        //Aqui los minutos, que estoy cogiendo el resto de horas (t%3600) y lo divido por que min=s/60
        minutos=(t % 3600)/60;
        //Los segundos son el resto de los minutos
        segundos=(t % 60);
        System.out.println("La hora es "+horas+":"+minutos+":"+segundos);
    }
}