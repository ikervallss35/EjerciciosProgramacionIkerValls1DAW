package Refuerzo;
import java.util.Scanner;
public class Refuerzo20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el saldo de cuenta del primer día de mes: ");
        double saldoInicial = sc.nextDouble();
        System.out.print("Introduce el cambio estimado (ingresos menos gastos): ");
        double cambioEstimado = sc.nextDouble();

        double saldoFinal = saldoInicial + cambioEstimado;
        if (saldoFinal >= 0) {
            System.out.println("SÍ");
        } else {
            System.out.println("NO");
        }
    }
}