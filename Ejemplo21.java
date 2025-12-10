import  java.util.Scanner;
public class Ejemplo21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int anyo;
        System.out.println("Ingrese un año: ");
        anyo = sc.nextInt();
        if (anyo % 400 ==0){
            System.out.println("Es bisiesto");
        }else if ((anyo % 4 == 0) && (anyo % 100 !=0)) {
            System.out.println("Es bisiesto");
        }else{
            System.out.println("No es bisiesto");
        }
    }
}