import java .util.Scanner;
public class Ejemplo19 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        double horas;
        double precio;
        double salarioBruto = 0;
        double impuestos;
        System.out.println("Introduce un numero de horas de trabajo: ");
        horas = sc.nextDouble();
        System.out.println("Introduce el precio por hora: ");
        precio = sc.nextDouble();

        if (horas <= 35) {
            salarioBruto = precio * horas;
        }else{
            salarioBruto = precio * horas;
            salarioBruto += (horas - 35) * (precio * 1.5);
        }
        System.out.println("Salario Bruto: " + salarioBruto);

        if (salarioBruto <= 500) {
            impuestos = 0;
        } else if (salarioBruto <= 900) {
            impuestos = (salarioBruto - 500) * 0.25;
            salarioBruto = salarioBruto - impuestos;
        }else {
             impuestos = 400 * 0.25 + (salarioBruto - 900) * 0.45;
             salarioBruto = salarioBruto - impuestos;
        }
        System.out.println("Salario Neto: " + salarioBruto);
        System.out.println("Impuestos: " + impuestos);
    }
}