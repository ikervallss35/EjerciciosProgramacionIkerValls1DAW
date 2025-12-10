package Metodos;
import java.util.Scanner;
public class Ejemplo6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the radius: ");
        double radius = sc.nextDouble();
        double PI = Math.PI;

        System.out.print("perimetro:" + Perimetro(radius));
        System.out.print("area:" + Area(radius));
    }
    public static double Area (double radius){
        return Math.PI*radius*radius;
    }
    public static double Perimetro (double radius){
        return 2*Math.PI*radius;
    }
}