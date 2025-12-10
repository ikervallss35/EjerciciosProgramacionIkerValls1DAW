import java.util.Scanner;
public class Ejemplo17 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un mes: ");
        int mes = teclado.nextInt();

        if ((mes == 1) || (mes == 3) || (mes == 5) || (mes == 7) || (mes == 8)  || (mes == 10) || (mes == 12)) {
            System.out.println("El mes tiene 31 dias");
        }
        else if (mes == 2){
            System.out.println("El mes tiene 28 dias");
        }else {
            System.out.println("El mes tiene 30 dias");
        }
        switch (mes) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
            System.out.println("El mes tiene 31 dias");
            break;
            case 2:
            System.out.println("El mes tiene 28 dias");
            break;
            default:
            System.out.println("El mes tiene 30 dias");
        }
    }
    }