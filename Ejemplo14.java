import java.util.Scanner;
public class Ejemplo14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número del 0 al 10: ");
        int numero = sc.nextInt();

        if (numero <=3 ){
            System.out.print("Muy deficiente");
        }else if (numero <5){
            System.out.print("Insuficiente");
        }else if (numero <6){
            System.out.print("Suficiente");
        }else if (numero <7){
            System.out.print("Bien");
        }else if (numero <9){
            System.out.print("Notable");
        }else {
            System.out.print("Sobresaliente");
        }
    }
}