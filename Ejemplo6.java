import java.util.Scanner;
public class Ejemplo6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the radius: ");
        double radius = sc.nextInt();
        double PI = Math.PI;

        double length = 2*Math.PI*radius;
        double area = Math.PI*radius*radius;

        System.out.print("length:" + length);
        System.out.print("area:" + area);
    }
}
